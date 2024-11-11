/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementasi_class_diagram;

public class Fasilitas {
    private String ID_fasilitas;
    private String nama_fasilitas;
    private String deskripsi_fasilitas;
    private String lokasi;
    
    public Fasilitas(String ID_fasilitas, String nama_fasilitas, 
                     String deskripsi_fasilitas, String lokasi) {
        this.ID_fasilitas = ID_fasilitas;
        this.nama_fasilitas = nama_fasilitas;
        this.deskripsi_fasilitas = deskripsi_fasilitas;
        this.lokasi = lokasi;
    }
    
    // Getters and Setters
    public String getID_fasilitas() { return ID_fasilitas; }
    public void setID_fasilitas(String ID_fasilitas) { this.ID_fasilitas = ID_fasilitas; }
    public String getNama_fasilitas() { return nama_fasilitas; }
    public void setNama_fasilitas(String nama_fasilitas) { this.nama_fasilitas = nama_fasilitas; }
    public String getDeskripsi_fasilitas() { return deskripsi_fasilitas; }
    public void setDeskripsi_fasilitas(String deskripsi_fasilitas) { this.deskripsi_fasilitas = deskripsi_fasilitas; }
    public String getLokasi() { return lokasi; }
    public void setLokasi(String lokasi) { this.lokasi = lokasi; }
}
