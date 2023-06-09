/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package templatetipe2;

/**
 *
 * @author USER
 */
public class KaryawanFactory {
    //Lengkapi code berikut
    public Karyawan createKaryawan(String nama, String pekerjaan, double tunjangan, Toko toko, String jenis, int jumlahLembur) {
        if(pekerjaan.equalsIgnoreCase("Manager")){
            return new Manager(nama, tunjangan, toko, jenis);
        }else if(pekerjaan.equalsIgnoreCase("Kasir")){
            return new Kasir(nama, tunjangan, toko, jumlahLembur);
        }
        return null;
    }
}
