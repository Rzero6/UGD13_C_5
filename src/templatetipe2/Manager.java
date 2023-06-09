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
public class Manager extends Karyawan{
    private ArrayList<Karyawan> bawahan;
    private String jenis;
    private int jumlahBawahan;
    
    public Manager(String nama, double tunjangan, Toko toko, String jenis) {
        super(nama, tunjangan, toko);
        this.jenis = jenis;
        bawahan = new ArrayList<Karyawan>();
        jumlahBawahan = 0;
    }
        
    @Override
    public void ShowData() {
        System.out.println("[Manager] " + nama + " - Total Tunjangan: " + tunjangan); 
        Karyawan.space.append("   ");
        
        for(Karyawan comp : bawahan)
        {
            System.out.print(Karyawan.space + "{Bawahan " + nama + "} ");
            comp.ShowData();
        }
        Karyawan.space.setLength(Karyawan.space.length() - 3);
    }

    @Override
    public void Update(double jumlah) {
        double pertambahan = 0;
        if(jenis.equalsIgnoreCase("Utama")){
            pertambahan = (jumlah+100000) + (jumlahBawahan * 20000); 
        }else{
            pertambahan = (jumlah+40000) + (jumlahBawahan * 10000); 
        }
        
        tunjangan += pertambahan;
        System.out.println("\t --- Tunjangan "+ nama +" bertambah sebanyak Rp. " + pertambahan);
    }

    public void RekrutBawahan(Karyawan k)
    {
        bawahan.add(k);
        jumlahBawahan += 1;
    }
    
    @Override
    public double GetTunjangan() {
        double tempTunjangan = 0;
        for(Karyawan karyawan : bawahan)
        {
            tempTunjangan += karyawan.GetTunjangan();
        }
        return tunjangan + tempTunjangan;
    }
    
    public String getJenis(){
        return this.jenis;
    }
}
