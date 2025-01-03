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
?>