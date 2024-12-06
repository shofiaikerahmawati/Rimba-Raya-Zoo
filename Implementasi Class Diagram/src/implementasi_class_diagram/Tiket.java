/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementasi_class_diagram;

public class Tiket {
    private String ID_tiket;
    private String jenis_tiket;
    private double harga;
    
    public Tiket(String ID_tiket, String jenis_tiket, double harga) {
        this.ID_tiket = ID_tiket;
        this.jenis_tiket = jenis_tiket;
        this.harga = harga;
    }
    
    // Getters and Setters
    public String getID_tiket() { return ID_tiket; }
    public void setID_tiket(String ID_tiket) { this.ID_tiket = ID_tiket; }
    public String getJenis_tiket() { return jenis_tiket; }
    public void setJenis_tiket(String jenis_tiket) { this.jenis_tiket = jenis_tiket; }
    public double getHarga() { return harga; }
    public void setHarga(double harga) { this.harga = harga; }
}
