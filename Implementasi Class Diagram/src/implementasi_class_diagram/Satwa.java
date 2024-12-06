/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementasi_class_diagram;


public class Satwa {
    private String ID_satwa;
    private String nama_satwa;
    private String jenis_satwa;
    private String asal_satwa;
    private String deskripsi_satwa;
    private String status_populasi;
    
    public Satwa(String ID_satwa, String nama_satwa, String jenis_satwa,
                 String asal_satwa, String deskripsi_satwa, String status_populasi) {
        this.ID_satwa = ID_satwa;
        this.nama_satwa = nama_satwa;
        this.jenis_satwa = jenis_satwa;
        this.asal_satwa = asal_satwa;
        this.deskripsi_satwa = deskripsi_satwa;
        this.status_populasi = status_populasi;
    }
    
    // Getters and Setters
    public String getID_satwa() { return ID_satwa; }
    public void setID_satwa(String ID_satwa) { this.ID_satwa = ID_satwa; }
    public String getNama_satwa() { return nama_satwa; }
    public void setNama_satwa(String nama_satwa) { this.nama_satwa = nama_satwa; }
    public String getJenis_satwa() { return jenis_satwa; }
    public void setJenis_satwa(String jenis_satwa) { this.jenis_satwa = jenis_satwa; }
    public String getAsal_satwa() { return asal_satwa; }
    public void setAsal_satwa(String asal_satwa) { this.asal_satwa = asal_satwa; }
    public String getDeskripsi_satwa() { return deskripsi_satwa; }
    public void setDeskripsi_satwa(String deskripsi_satwa) { this.deskripsi_satwa = deskripsi_satwa; }
    public String getStatus_populasi() { return status_populasi; }
    public void setStatus_populasi(String status_populasi) { this.status_populasi = status_populasi; }
}
