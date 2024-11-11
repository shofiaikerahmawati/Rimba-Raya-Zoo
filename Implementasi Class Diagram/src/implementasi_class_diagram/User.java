/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementasi_class_diagram;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class User {

    private String ID_user;
    private String nama_user;
    private String email;
    private final List<Kritik_Saran> kritikSaranList;
    private final List<Pemesanan_Tiket> pemesananList;

    // Constructor
    public User(String ID_user, String nama_user, String email) {
        this.ID_user = ID_user;
        this.nama_user = nama_user;
        this.email = email;
        this.kritikSaranList = new ArrayList<>();
        this.pemesananList = new ArrayList<>();
    }

    // Getters and Setters
    public String getID_user() {
        return ID_user;
    }

    public void setID_user(String ID_user) {
        this.ID_user = ID_user;
    }

    public String getNama_user() {
        return nama_user;
    }

    public void setNama_user(String nama_user) {
        this.nama_user = nama_user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Methods untuk mengelola Kritik & Saran
    public void addKritikSaran(Kritik_Saran kritikSaran) {
        if (kritikSaran != null) {
            kritikSaranList.add(kritikSaran);
        }
    }

    public List<Kritik_Saran> getKritikSaranList() {
        return kritikSaranList;
    }

    public void removeKritikSaran(Kritik_Saran kritikSaran) {
        kritikSaranList.remove(kritikSaran);
    }

    public int getJumlahKritikSaran() {
        return kritikSaranList.size();
    }

    public Kritik_Saran findKritikSaranById(String ID_kritik) {
        for (Kritik_Saran ks : kritikSaranList) {
            if (ks.getID_kritik().equals(ID_kritik)) {
                return ks;
            }
        }
        return null;
    }

    public String getAllKritikSaranDetails() {
        StringBuilder details = new StringBuilder();
        details.append("Kritik & Saran dari ").append(nama_user).append(":\n");

        if (kritikSaranList.isEmpty()) {
            details.append("Belum ada kritik & saran.\n");
        } else {
            for (Kritik_Saran ks : kritikSaranList) {
                details.append("- ID: ").append(ks.getID_kritik())
                        .append(", Tanggal: ").append(ks.getTanggal_input())
                        .append(", Isi: ").append(ks.getIsi_kritik())
                        .append("\n");
            }
        }

        return details.toString();
    }

    // Methods untuk mengelola Pemesanan Tiket
    public void addPemesanan(Pemesanan_Tiket pemesanan) {
        if (pemesanan != null) {
            pemesananList.add(pemesanan);
        }
    }

    public List<Pemesanan_Tiket> getPemesananList() {
        return pemesananList;
    }

    public void removePemesanan(Pemesanan_Tiket pemesanan) {
        pemesananList.remove(pemesanan);
    }

    public int getJumlahPemesanan() {
        return pemesananList.size();
    }

    public Pemesanan_Tiket findPemesananById(String ID_pemesanan) {
        for (Pemesanan_Tiket pemesanan : pemesananList) {
            if (pemesanan.getID_pemesanan().equals(ID_pemesanan)) {
                return pemesanan;
            }
        }
        return null;
    }

    public String getAllPemesananDetails() {
        StringBuilder details = new StringBuilder();
        details.append("Pemesanan Tiket dari ").append(nama_user).append(":\n");

        if (pemesananList.isEmpty()) {
            details.append("Belum ada pemesanan tiket.\n");
        } else {
            for (Pemesanan_Tiket pemesanan : pemesananList) {
                details.append("- ID: ").append(pemesanan.getID_pemesanan())
                        .append(", Tanggal Kunjungan: ").append(pemesanan.getTanggal_kunjungan())
                        .append(", Total Tiket: ").append(pemesanan.getJumlah_tiket())
                        .append(", Total Harga: Rp").append(String.format("%.2f", pemesanan.getTotal_harga()))
                        .append("\n");
            }
        }

        return details.toString();
    }

    // Method untuk membuat Kritik & Saran baru
    public Kritik_Saran createKritikSaran(String isiKritik) {
        String idKritik = "KS" + String.format("%03d", getJumlahKritikSaran() + 1);
        Kritik_Saran kritikSaran = new Kritik_Saran(
                idKritik,
                this.nama_user,
                new Date(),
                isiKritik,
                this.email
        );
        addKritikSaran(kritikSaran);
        return kritikSaran;
    }

    // Method untuk membuat Pemesanan Tiket baru
    public Pemesanan_Tiket createPemesanan(Date tanggalKunjungan, int jumlahTiket, double totalHarga) {
        String idPemesanan = "PMS" + String.format("%03d", getJumlahPemesanan() + 1);
        String barcode = "BAR" + idPemesanan + System.currentTimeMillis() % 1000;

        Pemesanan_Tiket pemesanan = new Pemesanan_Tiket(
                idPemesanan,
                this.nama_user,
                this.email,
                tanggalKunjungan,
                jumlahTiket,
                totalHarga,
                barcode,
                new Date()
        );
        addPemesanan(pemesanan);
        return pemesanan;
    }

    @Override
    public String toString() {
        return "User{"
                + "ID=" + ID_user
                + ", Nama='" + nama_user + '\''
                + ", Email='" + email + '\''
                + ", Jumlah Kritik & Saran=" + getJumlahKritikSaran()
                + ", Jumlah Pemesanan=" + getJumlahPemesanan()
                + '}';
    }
}
