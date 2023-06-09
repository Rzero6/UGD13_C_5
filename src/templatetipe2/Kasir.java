/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package templatetipe2;

/**
 *
 * @author USER
 */
public class Kasir extends Karyawan{
    private int jumlahLembur;

    public Kasir(String nama, double tunjangan, Toko toko, int jumlahLembur) {
        super(nama, tunjangan, toko);
        this.jumlahLembur = jumlahLembur;
    }

    @Override
    public void ShowData() {
        System.out.println("[Kasir] " + nama + " - Total Tunjangan: " + tunjangan); 
    }

    @Override
    public void Update(double jumlah) {
        double pertambahan = jumlah + (jumlahLembur * 10000);
        tunjangan += pertambahan;
        System.out.println("\t --- Tunjangan "+ nama +" bertambah sebanyak Rp. " + pertambahan);
    }
    
    @Override
    public double GetTunjangan()
    {
        return tunjangan;
    }
    
    
    public void RekrutBawahan(Karyawan k){}
            
    public String getJenis(){
        return null;
    }
}
