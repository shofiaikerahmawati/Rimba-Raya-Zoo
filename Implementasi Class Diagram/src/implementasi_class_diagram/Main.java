/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementasi_class_diagram;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final List<Tiket> daftarTiket = new ArrayList<>();
    private static final List<Pemesanan_Tiket> daftarPemesanan = new ArrayList<>();
    private static final List<Kritik_Saran> daftarKritikSaran = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    
    public static void main(String[] args) {
        initializeTiket();
        
        while (true) {
            try {
                tampilkanMenuUtama();
                int pilihan = scanner.nextInt();
                scanner.nextLine(); 
                
                switch (pilihan) {
                    case 1 -> pesanTiket();
                    case 2 -> tampilkanDaftarTiket();
                    case 3 -> kirimKritikSaran();
                    case 4 -> {
                        System.out.println("\nTerima kasih telah menggunakan layanan kami!");
                        return;
                    }
                    default -> System.out.println("Pilihan tidak valid!");
                }
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
                scanner.nextLine();
            }
        }
    }
    
    private static void tampilkanMenuUtama() {
        System.out.println("\n=====================================");
        System.out.println("           RIMBA RAYA ZOO          ");
        System.out.println("=====================================");
        System.out.println("1. Pesan Tiket");
        System.out.println("2. Lihat Daftar Tiket");
        System.out.println("3. Kirim Kritik & Saran");
        System.out.println("4. Keluar");
        System.out.println("=====================================");
        System.out.print("Pilih menu (1-4): ");
    }
    
    private static void initializeTiket() {
        daftarTiket.add(new Tiket("T1", "Dewasa", 50000));
        daftarTiket.add(new Tiket("T2", "Anak-anak", 25000));
        daftarTiket.add(new Tiket("T3", "Lansia", 35000));
    }
    
    private static void tampilkanDaftarTiket() {
        System.out.println("\n=== DAFTAR TIKET ===");
        System.out.println("----------------------------------------");
        System.out.printf("%-8s %-15s %-15s%n", "ID", "Jenis", "Harga");
        System.out.println("----------------------------------------");
        for (Tiket tiket : daftarTiket) {
            System.out.printf("%-8s %-15s Rp.%-12.2f%n", 
                tiket.getID_tiket(), 
                tiket.getJenis_tiket(), 
                tiket.getHarga());
        }
        System.out.println("----------------------------------------");
    }
    
    private static void pesanTiket() {
        try {
            System.out.println("\n=== PEMESANAN TIKET ===");
            
            // Input data pengunjung
            System.out.print("Nama Pemesan: ");
            String nama = scanner.nextLine();
            
            System.out.print("Email: ");
            String email = scanner.nextLine();
            
            System.out.print("Tanggal Kunjungan (dd/MM/yyyy): ");
            Date tanggalKunjungan = dateFormat.parse(scanner.nextLine());
            
            // Tampilkan daftar tiket
            tampilkanDaftarTiket();
            
            // Proses pemesanan tiket
            double totalHarga = 0;
            List<Detail_Pemesanan> detailPemesananList = new ArrayList<>();
            boolean lanjutPesan = true;
            int totalJumlahTiket = 0;
            
            while (lanjutPesan) {
                System.out.print("Masukkan ID Tiket: ");
                String idTiket = scanner.nextLine();
                
                Tiket tiketDipilih = null;
                for (Tiket t : daftarTiket) {
                    if (t.getID_tiket().equals(idTiket)) {
                        tiketDipilih = t;
                        break;
                    }
                }
                
                if (tiketDipilih == null) {
                    System.out.println("ID Tiket tidak valid!");
                    continue;
                }
                
                System.out.print("Jumlah tiket: ");
                int jumlah = scanner.nextInt();
                scanner.nextLine(); // consume newline
                
                double subtotal = tiketDipilih.getHarga() * jumlah;
                totalHarga += subtotal;
                totalJumlahTiket += jumlah;
                
                String idDetail = "DT" + String.format("%03d", detailPemesananList.size() + 1);
                String idPemesanan = "PMS" + String.format("%03d", daftarPemesanan.size() + 1);
                
                Detail_Pemesanan detail = new Detail_Pemesanan(
                    idDetail, idPemesanan, idTiket, jumlah, subtotal);
                detailPemesananList.add(detail);
                
                System.out.print("Pesan tiket lain? (y/n): ");
                String jawaban = scanner.nextLine();
                lanjutPesan = jawaban.equalsIgnoreCase("y");
            }
            
            // Buat pemesanan baru
            String idPemesanan = "PMS" + String.format("%03d", daftarPemesanan.size() + 1);
            String barcode = generateBarcode(idPemesanan);
            
            Pemesanan_Tiket pemesanan = new Pemesanan_Tiket(
                idPemesanan, nama, email, tanggalKunjungan,
                totalJumlahTiket, totalHarga, barcode, new Date()
            );
            
            // Tambahkan detail pemesanan
            for (Detail_Pemesanan detail : detailPemesananList) {
                pemesanan.addDetailPemesanan(detail);
            }
            
            daftarPemesanan.add(pemesanan);
            
            // Tampilkan ringkasan pemesanan
            tampilkanRingkasanPemesanan(pemesanan);
            
        } catch (ParseException e) {
            System.out.println("Format tanggal salah! Gunakan format dd/MM/yyyy");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
    
    private static void tampilkanRingkasanPemesanan(Pemesanan_Tiket pemesanan) {
        System.out.println("\n=== RINGKASAN PEMESANAN ===");
        System.out.println("ID Pemesanan: " + pemesanan.getID_pemesanan());
        System.out.println("Nama Pemesan: " + pemesanan.getNama_pemesan());
        System.out.println("Email: " + pemesanan.getEmail());
        System.out.println("Tanggal Kunjungan: " + dateFormat.format(pemesanan.getTanggal_kunjungan()));
        System.out.println("Barcode: " + pemesanan.getBarcode());
        System.out.println("\nDetail Pemesanan:");
        System.out.println("----------------------------------------");
        System.out.printf("%-15s %-8s %-12s%n", "Jenis Tiket", "Jumlah", "Subtotal");
        System.out.println("----------------------------------------");
        
        for (Detail_Pemesanan detail : pemesanan.getDetailPemesanan()) {
            Tiket tiket = getTiketById(detail.getID_tiket());
            if (tiket != null) {
                System.out.printf("%-15s %-8d Rp.%-12.2f%n",
                    tiket.getJenis_tiket(),
                    detail.getJumlah(),
                    detail.getSubtotal());
            }
        }
        
        System.out.println("----------------------------------------");
        System.out.printf("Total Harga: Rp.%.2f%n", pemesanan.getTotal_harga());
        System.out.println("----------------------------------------");
        System.out.println("\nSilahkan simpan ID Pemesanan dan Barcode Anda!");
    }
    
    private static void kirimKritikSaran() {
        try {
            System.out.println("\n=== KIRIM KRITIK & SARAN ===");
            
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            
            System.out.print("Email: ");
            String email = scanner.nextLine();
            
            System.out.print("Kritik/Saran: ");
            String isiKritik = scanner.nextLine();
            
            String idKritik = "KS" + String.format("%03d", daftarKritikSaran.size() + 1);
            
            Kritik_Saran kritikSaran = new Kritik_Saran(
                idKritik, nama, new Date(), isiKritik, email);
            daftarKritikSaran.add(kritikSaran);
            
            System.out.println("\nTerima kasih atas kritik & saran Anda!");
            
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
    
    private static String generateBarcode(String idPemesanan) {
        return "BAR" + idPemesanan + System.currentTimeMillis() % 1000;
    }
    
    private static Tiket getTiketById(String idTiket) {
        for (Tiket tiket : daftarTiket) {
            if (tiket.getID_tiket().equals(idTiket)) {
                return tiket;
            }
        }
        return null;
    }
}