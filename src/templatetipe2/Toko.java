/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package templatetipe2;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Toko {
    private String namaToko, alamat;
    private Karyawan penanggunJawab;
    private ArrayList<Karyawan> karyawan;
    private double danaToko;
    
    //Perbaiki code berikut sehingga sesuai dengan prinsip Singleton
    private static Toko TokoInstance = null;
    //
    
    //Perbaiki code berikut sehingga sesuai dengan prinsip Singleton
    private Toko(String namaToko, String alamat, double danaToko) {
        this.namaToko = namaToko;
        this.alamat = alamat;
        this.penanggunJawab = null;
        this.danaToko = danaToko;
        karyawan = new ArrayList<Karyawan>();
    }
    //
    
    //Lengkapi code berikut
    public static Toko getTokoInstance(String namaToko, String alamat, double danaToko) {
        System.out.println("\nMembuat Objek Toko Baru...");
        
        if(Toko.TokoInstance == null){
            Toko.TokoInstance = new Toko(namaToko, alamat, danaToko);
            System.out.println("Toko " + namaToko + " Berhasil Dibuat");
        }else {
            System.out.println("Toko " + TokoInstance.namaToko + " Sudah Ada Sebelumnya");
            System.out.println("Toko " + namaToko + " Gagal Dibuat");
        }
        return null;
    }
    
    public void TampilDaftarKaryawan()
    {
        System.out.println("Toko " + namaToko);
        System.out.println("Alamat " + alamat);
        System.out.println("Jumlah Dana Toko : Rp. " + danaToko);
        
        if(penanggunJawab != null)
        {
            penanggunJawab.ShowData();
        }
        else
        {
            System.out.println("Posisi Manager sedang Kosong!");
        }
    }
    
    public void RegisterObserver(Karyawan k)
    {
        karyawan.add(k);
    }
    
    public void NotifyObserver(double jumlah)
    {
        for(Karyawan k : karyawan)
        {
            k.Update(jumlah);
        }
    }
    
    public void PenjualanBarang(double harga, int jmlBarang)
    {
        double total = harga * jmlBarang;
        double bonus = (harga * jmlBarang) / 20;
        System.out.println("\t\t Toko mendapatkan dana sebesar : Rp. " + total);
        danaToko += total;
        NotifyObserver(bonus);
    }
    
    public void SetPenanggungJawab(Karyawan manager)
    {
        if(manager.getJenis().equalsIgnoreCase("Utama")){
            this.penanggunJawab = manager;
        }else{
            System.out.println("Jabatan Manager kurang tinggi!");
            System.exit(0);
        }        
    }
    
    public void ShowTotalTunjangan()
    {
        double temp = penanggunJawab.GetTunjangan();
        System.out.println("\nTotal Tunjangan: " + temp);
    }
}
