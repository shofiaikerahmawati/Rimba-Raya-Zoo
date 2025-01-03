<?php
$servername = "localhost";
$username = "rimbaray_rimbarayazoo";
$password = "Zoorimba25.";
$dbname = "rimbaray_rimbarayazoo";

// Membuat koneksi
$conn = new mysqli($servername, $username, $password, $dbname);

// Memeriksa koneksi
if ($conn->connect_error) {
    die("Koneksi gagal: " . $conn->connect_error);
}

// Proses form
if ($_SERVER['REQUEST_METHOD'] == 'POST') {

    $nama_pengunjung = $conn->real_escape_string($_POST['nama']);
    $email = $conn->real_escape_string($_POST['email']);
    $isi_kritik = $conn->real_escape_string($_POST['kritik-saran']);
    $tanggal_input = date('Y-m-d H:i:s');

    $sql = "INSERT INTO Kritik_Saran (ID_kritik, nama_pengunjung, tanggal_input, isi_kritik, email) 
            VALUES (null, '$nama_pengunjung', '$tanggal_input', '$isi_kritik', '$email')";

    if ($conn->query($sql) === TRUE) {
        echo "<script>alert('Kritik dan saran berhasil dikirim!');</script>";
    } else {
        echo "<script>alert('Gagal mengirim kritik dan saran: " . $conn->error . "');</script>";
    }
}

$conn->close();
?>


<!DOCTYPE html>
<html lang="id">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Kritik & Saran</title>
    <link rel="stylesheet" href="css/style.css" />
    <link rel="stylesheet" href="css/bootstrap.min.css" />
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"
    />
  </head>
  <body>
    <header>
      <img src="Image RRZ/Header.png" alt="Header Image" class="header-image" />
      <div class="header-content">
        <img
          src="Image RRZ/Logo piks.png"
          alt="Logo Rimba Raya Zoo"
          class="logo-nav"
        />
        <nav class="sticky-nav">
          <ul>
            <li><a href="index.html" class="nav-button">Beranda</a></li>
            <li><a href="info_satwa.html" class="nav-button">Satwa</a></li>
            <li>
              <a href="info_fasilitas.html" class="nav-button">Fasilitas</a>
            </li>
            <li><a href="pemesanan_tiket.html" class="nav-button">Tiket</a></li>
            <li>
              <a href="kritik_saran.php" class="nav-button">Kritik & Saran</a>
            </li>
          </ul>
        </nav>
      </div>
    </header>
    <main>
      <section id="kritik">
        <h2><b>Tulis Kritik dan Saran Anda</b></h2>
        <form action="kritik_saran.php" method="post">
          <label for="nama">Nama:</label><br />
          <input
            type="text"
            id="nama"
            name="nama"
            required
            placeholder="Masukkan nama Anda"
          /><br /><br />

          <label for="email">Email:</label><br />
          <input
            type="email"
            id="email"
            name="email"
            required
            placeholder="Masukkan email Anda"
          /><br /><br />

          <label for="kritik-saran">Kritik/Saran:</label><br />
          <textarea
            id="kritik-saran"
            name="kritik-saran"
            rows="4"
            cols="50"
            placeholder="Tulis kritik dan saran di sini..."
            required
          ></textarea
          ><br /><br />

          <button type="submit">Kirim</button>
        </form>
      </section>
    </main>

    <div class="footer">
      <div class="footer-content">
        <div class="top-section">
          <div class="container">
            <div class="row">
              <div class="col-lg-2 col-md-3 col-sm-4 col-6 col-top">
                <div class="column-head"><span>Learn More</span></div>
                <ul class="column-body">
                  <li>
                    <a href="https://wa.me/628329949544" target="_blank"
                      ><span>Help Center</span></a
                    >
                  </li>
                </ul>
              </div>
              <div class="col-lg-2 col-md-3 col-sm-4 col-6 col-top">
                <div class="column-head"><span>Get In Touch</span></div>
                <ul class="column-body">
                  <li>
                    <a href="kritik_saran.php"><span>Get Support</span></a>
                  </li>
                  <li>
                    <a href="mailto:zoorimbaraya@gmail.com"
                      ><span>Contact Us</span></a
                    >
                  </li>
                </ul>
              </div>

              <div class="col-lg-2 col-md-3 col-sm-4 col-6 col-top">
                <div class="column-head"><span>Follow Us</span></div>
                <ul class="column-body follow-row"></ul>
                <div class="social-container">
                  <ul class="social-icons">
                    <li>
                      <a
                        href="https://www.instagram.com/rimbarayazoo/"
                        target="_blank"
                      >
                        <i class="fab fa-instagram"></i>
                      </a>
                    </li>
                  </ul>
                </div>
              </div>
            </div>
          </div>
        </div>
        <div class="middle-section">
          <div class="container">
            <div class="row">
              <div class="col-lg-3 col-md-4 col-12">
                <div class="map-container">
                  <a
                    href="https://maps.app.goo.gl/pvPp3jdo7gtaxdS99"
                    target="_blank"
                  >
                    <iframe
                      src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d15926.706733143681!2d133.76420624437955!3d-3.6609248910088614!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x2d36001ee76518e1%3A0x387f57dde54e3d47!2sKaimana%2C%20Kaimana%20Kota%2C%20Kec.%20Kaimana%2C%20Kabupaten%20Kaimana%2C%20Papua%20Bar.!5e0!3m2!1sid!2sid!4v1733388123298!5m2!1sid!2sid"
                      width="400"
                      height="300"
                      style="border: 0"
                      allowfullscreen=""
                      loading="lazy"
                    >
                    </iframe>
                  </a>
                </div>
              </div>
              <div class="col-lg-3 col-md-4 col-6">
                <h6>Address</h6>
                <span>Kaimana Kota, Kaimana</span
                ><span>Papua Barat, Indonesia</span><span>(200) 567-7391</span>
              </div>
              <div class="col-lg-4 col-md-4 col-6">
                <h6>Help</h6>
                <span>Visit our Help Center for answers</span
                ><span>to common questions, or reach out to our</span
                ><span>support team for personalized assistance.</span>
              </div>
              <div
                class="col-lg-2 col-md-4 col-6 offset-lg-0 offset-md-4 offset-3"
              >
                <div class="button">
                  <a href="https://wa.me/628329949544" target="_blank"
                    >Contact Us</a
                  >
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div></div>
    </div>

    <footer>
      <p>&copy; 2024 Rimba Raya Zoo. Semua hak dilindungi.</p>
    </footer>

    <div class="scroll-buttons" id="scrollButtons" style="display: none">
      <button id="scroll-up" onclick="scrollToTop()">↑</button>
      <button id="scroll-down" onclick="scrollToBottom()">↓</button>
    </div>

    <script>
      // Fungsi untuk menampilkan/menyembunyikan tombol scroll
      function toggleScrollButtons() {
        const scrollButtons = document.getElementById("scrollButtons");
        const scrollThreshold = 300; // Pixel scroll sebelum tombol muncul

        // Tampilkan tombol jika sudah menggulir lebih dari threshold
        if (window.pageYOffset > scrollThreshold) {
          scrollButtons.style.display = "flex";
        } else {
          scrollButtons.style.display = "none";
        }
      }

      // Fungsi scroll ke atas
      function scrollToTop() {
        window.scrollTo({
          top: 0,
          behavior: "smooth",
        });
      }

      // Fungsi scroll ke bawah
      function scrollToBottom() {
        window.scrollTo({
          top: document.body.scrollHeight,
          behavior: "smooth",
        });
      }

      // Tambahkan event listener untuk scroll
      window.addEventListener("scroll", toggleScrollButtons);

      // Tambahkan animasi fade in/out
      function addScrollButtonAnimations() {
        const scrollButtons = document.getElementById("scrollButtons");

        scrollButtons.style.transition = "opacity 0.3s ease, visibility 0.3s";

        scrollButtons.addEventListener("mouseenter", () => {
          scrollButtons.style.opacity = "1";
        });

        scrollButtons.addEventListener("mouseleave", () => {
          scrollButtons.style.opacity = "0.7";
        });
      }

      // Inisialisasi animasi saat halaman dimuat
      document.addEventListener("DOMContentLoaded", addScrollButtonAnimations);
    </script>
  </body>
</html>
