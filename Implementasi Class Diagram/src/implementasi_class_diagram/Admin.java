/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package implementasi_class_diagram;
import java.util.List;

public class Admin {
    private String ID_admin;
    private String role;

    public Admin(String ID_admin, String role) {
        this.ID_admin = ID_admin;
        this.role = role;
    }

    // Getters and Setters
    public String getID_admin() { return ID_admin; }
    public void setID_admin(String ID_admin) { this.ID_admin = ID_admin; }
    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    // Method untuk melihat semua kritik dan saran
    public void lihatSemuaKritikSaran(List<Kritik_Saran> daftarKritikSaran) {
        System.out.println("\n=== DAFTAR KRITIK & SARAN ===");
        System.out.println("----------------------------------------");
        System.out.printf("%-5s %-15s %-25s %-15s%n", "No", "Tanggal", "Nama", "Email");
        System.out.println("----------------------------------------");

        int no = 1;
        for (Kritik_Saran ks : daftarKritikSaran) {
            System.out.printf("%-5d %-15s %-25s %-15s%n", 
                no++,
                new java.text.SimpleDateFormat("dd/MM/yyyy").format(ks.getTanggal_input()),
                ks.getNama_pengunjung(),
                ks.getEmail()
            );
            System.out.println("Isi Kritik: " + ks.getIsi_kritik());
            System.out.println("----------------------------------------");
        }
    }
}