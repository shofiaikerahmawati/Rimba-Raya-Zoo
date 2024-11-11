/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementasi_class_diagram;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Pemesanan_Tiket {
    private String ID_pemesanan;
    private String nama_pemesan;
    private String email;
    private Date tanggal_kunjungan;
    private int jumlah_tiket;
    private double total_harga;
    private String barcode;
    private Date waktu_pemesanan;
    private final List<Detail_Pemesanan> detailPemesanan;
    
    public Pemesanan_Tiket(String ID_pemesanan, String nama_pemesan, String email,
                          Date tanggal_kunjungan, int jumlah_tiket, double total_harga,
                          String barcode, Date waktu_pemesanan) {
        this.ID_pemesanan = ID_pemesanan;
        this.nama_pemesan = nama_pemesan;
        this.email = email;
        this.tanggal_kunjungan = tanggal_kunjungan;
        this.jumlah_tiket = jumlah_tiket;
        this.total_harga = total_harga;
        this.barcode = barcode;
        this.waktu_pemesanan = waktu_pemesanan;
        this.detailPemesanan = new ArrayList<>();
    }

    // Method untuk menambah detail pemesanan
    public void addDetailPemesanan(Detail_Pemesanan detail) {
        if (detail != null) {
            detailPemesanan.add(detail);
        }
    }
    
    // Getters dan Setters
    public String getID_pemesanan() {
        return ID_pemesanan;
    }
    
    public void setID_pemesanan(String ID_pemesanan) {
        this.ID_pemesanan = ID_pemesanan;
    }
    
    public String getNama_pemesan() {
        return nama_pemesan;
    }
    
    public void setNama_pemesan(String nama_pemesan) {
        this.nama_pemesan = nama_pemesan;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public Date getTanggal_kunjungan() {
        return tanggal_kunjungan;
    }
    
    public void setTanggal_kunjungan(Date tanggal_kunjungan) {
        this.tanggal_kunjungan = tanggal_kunjungan;
    }
    
    public int getJumlah_tiket() {
        return jumlah_tiket;
    }
    
    public void setJumlah_tiket(int jumlah_tiket) {
        this.jumlah_tiket = jumlah_tiket;
    }
    
    public double getTotal_harga() {
        return total_harga;
    }
    
    public void setTotal_harga(double total_harga) {
        this.total_harga = total_harga;
    }
    
    public String getBarcode() {
        return barcode;
    }
    
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }
    
    public Date getWaktu_pemesanan() {
        return waktu_pemesanan;
    }
    
    public void setWaktu_pemesanan(Date waktu_pemesanan) {
        this.waktu_pemesanan = waktu_pemesanan;
    }
    
    public List<Detail_Pemesanan> getDetailPemesanan() {
        return detailPemesanan;
    }
    
    // Method untuk menghitung ulang total
    public void hitungTotal() {
        double total = 0;
        int jumlah = 0;
        for (Detail_Pemesanan detail : detailPemesanan) {
            total += detail.getSubtotal();
            jumlah += detail.getJumlah();
        }
        this.total_harga = total;
        this.jumlah_tiket = jumlah;
    }
    
    // Method untuk mendapatkan informasi pemesanan
    @Override
    public String toString() {
        return "Pemesanan Tiket{" +
                "ID=" + ID_pemesanan +
                ", Nama=" + nama_pemesan +
                ", Email=" + email +
                ", Tanggal Kunjungan=" + tanggal_kunjungan +
                ", Jumlah Tiket=" + jumlah_tiket +
                ", Total Harga=" + total_harga +
                ", Barcode=" + barcode +
                '}';
    }
}