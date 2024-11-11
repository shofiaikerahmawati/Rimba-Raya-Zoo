/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementasi_class_diagram;

import java.util.Date;
public class Kritik_Saran {
    private String ID_kritik;
    private String nama_pengunjung;
    private Date tanggal_input;
    private String isi_kritik;
    private String email;
    
    public Kritik_Saran(String ID_kritik, String nama_pengunjung, 
                        Date tanggal_input, String isi_kritik, String email) {
        this.ID_kritik = ID_kritik;
        this.nama_pengunjung = nama_pengunjung;
        this.tanggal_input = tanggal_input;
        this.isi_kritik = isi_kritik;
        this.email = email;
    }
    
    // Getters and Setters
    public String getID_kritik() { return ID_kritik; }
    public void setID_kritik(String ID_kritik) { this.ID_kritik = ID_kritik; }
    public String getNama_pengunjung() { return nama_pengunjung; }
    public void setNama_pengunjung(String nama_pengunjung) { this.nama_pengunjung = nama_pengunjung; }
    public Date getTanggal_input() { return tanggal_input; }
    public void setTanggal_input(Date tanggal_input) { this.tanggal_input = tanggal_input; }
    public String getIsi_kritik() { return isi_kritik; }
    public void setIsi_kritik(String isi_kritik) { this.isi_kritik = isi_kritik; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
