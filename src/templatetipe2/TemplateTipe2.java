package templatetipe2;

public class TemplateTipe2 {

    public static void main(String[] args) {
        //Silakan ganti code berikut
        Toko oneShop = Toko.getTokoInstance("One Shop", "Jl. Merdeka No.241", 20000000);
        //
        
        //Silakan buat toko baru dengan nama "Sinar Makmur" menggunakan Singleton
        //...
        //Toko sinarMakmur = Toko.getTokoInstance("Sinar Makmur", "Jl. Penjajah No.42",36000000);
        //
        
        KaryawanFactory kf = new KaryawanFactory();
        Karyawan smith, michael, andreson;
        Karyawan wilson, olivia, brian, evans;
        
        //Silakan ganti code berikut
        smith = kf.createKaryawan("Smith","Manager", 3500000, oneShop, "Utama",0);
        michael = kf.createKaryawan("Michael","Manager", 3000000, oneShop, "Utama",0);
        andreson = kf.createKaryawan("Andreson", "Manager",1000000, oneShop, "Bagian",0);
        //
        
        oneShop.SetPenanggungJawab(smith);
        smith.RekrutBawahan(michael);
        smith.RekrutBawahan(andreson);

        //Silakan ganti code berikut
        wilson = kf.createKaryawan("Wilson","Kasir", 300000, oneShop,"", 1);
        olivia = kf.createKaryawan("Olivia","Kasir", 800000, oneShop, "",8);
        brian = kf.createKaryawan("Brian","Kasir", 400000, oneShop, "",3);
        evans = kf.createKaryawan("Evans","Kasir", 500000, oneShop, "",5);
        //
        
        michael.RekrutBawahan(wilson);
        michael.RekrutBawahan(olivia);
        
        andreson.RekrutBawahan(brian);
        andreson.RekrutBawahan(evans);
        
        oneShop.TampilDaftarKaryawan();
        
        // Observer
        System.out.println("\n\n Tampilkan Observernya saat terjadi penjualan dengan jumlah barang 5 dan harga 450000");
        oneShop.PenjualanBarang(450000, 5);
        
        System.out.println("\n\tSetelah Penjualan Berhasil... \n");
        oneShop.TampilDaftarKaryawan();
        
        oneShop.ShowTotalTunjangan();
    }
    
}
