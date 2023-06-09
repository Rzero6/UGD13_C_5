/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package templatetipe2;

/**
 *
 * @author USER
 */
public abstract class Karyawan {
    public static StringBuffer space = new StringBuffer();
    
    protected String nama;
    protected double tunjangan;
    protected Toko toko;
    
    public Karyawan(String nama, double tunjangan, Toko toko) {
        this.nama = nama;
        this.tunjangan = tunjangan;
        this.toko = toko;
        this.toko.RegisterObserver(this);
    }
    
    public abstract void ShowData();
    public abstract void Update(double jumlah);
    public abstract double GetTunjangan();
    public abstract void RekrutBawahan(Karyawan k);
    public abstract String getJenis();
}
