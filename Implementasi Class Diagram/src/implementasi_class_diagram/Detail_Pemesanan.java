/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementasi_class_diagram;

public class Detail_Pemesanan {
    private String ID_detail;
    private String ID_pemesanan;
    private String ID_tiket;
    private int jumlah;
    private double subtotal;
    
    public Detail_Pemesanan(String ID_detail, String ID_pemesanan, 
                           String ID_tiket, int jumlah, double subtotal) {
        this.ID_detail = ID_detail;
        this.ID_pemesanan = ID_pemesanan;
        this.ID_tiket = ID_tiket;
        this.jumlah = jumlah;
        this.subtotal = subtotal;
    }
    
    // Getters and Setters
    public String getID_detail() { return ID_detail; }
    public void setID_detail(String ID_detail) { this.ID_detail = ID_detail; }
    public String getID_pemesanan() { return ID_pemesanan; }
    public void setID_pemesanan(String ID_pemesanan) { this.ID_pemesanan = ID_pemesanan; }
    public String getID_tiket() { return ID_tiket; }
    public void setID_tiket(String ID_tiket) { this.ID_tiket = ID_tiket; }
    public int getJumlah() { return jumlah; }
    public void setJumlah(int jumlah) { this.jumlah = jumlah; }
    public double getSubtotal() { return subtotal; }
    public void setSubtotal(double subtotal) { this.subtotal = subtotal; }
}
