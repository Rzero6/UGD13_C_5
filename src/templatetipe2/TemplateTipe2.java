package templatetipe2;

public class TemplateTipe2 {

    public static void main(String[] args) {
        //Silakan ganti code berikut
        Toko oneShop = new Toko("One Shop", "Jl. Merdeka No.241", 20000000);
        //
        
        //Silakan buat toko baru dengan nama "Sinar Makmur" menggunakan Singleton
        //...
        //
        
        KaryawanFactory kf = new KaryawanFactory();
        Karyawan smith, michael, andreson;
        Karyawan wilson, olivia, brian, evans;
        
        //Silakan ganti code berikut
        smith = new Manager("Smith", 3500000, oneShop, "Utama");
        michael = new Manager("Michael", 3000000, oneShop, "Utama");
        andreson = new Manager("Andreson", 1000000, oneShop, "Bagian");
        //
        
        oneShop.SetPenanggungJawab(smith);
        smith.RekrutBawahan(michael);
        smith.RekrutBawahan(andreson);

        //Silakan ganti code berikut
        wilson = new Kasir("Wilson", 300000, oneShop, 1);
        olivia = new Kasir("Olivia", 800000, oneShop, 8);
        brian = new Kasir("Brian", 400000, oneShop, 3);
        evans = new Kasir("Evans", 500000, oneShop, 5);
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
