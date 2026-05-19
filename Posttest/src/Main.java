package Modul9.Posttest.src;

public class Main {
    public static void main(String[] args) {
        Ban ban1 = new Ban("Ban BMW", 17);
        Ban ban2 = new Ban("Ban Honda", 18);
        Ban ban3 = new Ban("Ban Yamaha", 19);
        Ban ban4 = new Ban("Ban Toyota", 20);
        
        Mobil mobil1 = new Mobil("Toyota", "merah", "V6", 2000);

        Ban[] setBan = {ban1, ban2, ban3, ban4};
        mobil1.pasangSetBan(setBan);

        Montir montir1 = new Montir("M-01", "Michael");
        montir1.lakukanQualityControl(mobil1);

        System.out.println("Mobil gagal Uji Coba");
        mobil1 = null;


        Ban[] semuaBan = {ban1, ban2, ban3, ban4};
        for (int i = 0; i < semuaBan.length; i++) {
            System.out.println("Ban" + (i+1) + " apakah ada?: " + 
                (semuaBan[i] != null ? "Ya, " + semuaBan[i].merk + " Ring " + semuaBan[i].ukuranRing : "Tidak"));
        }


        System.out.println("Mesin ikut musnah karena dibuat di dalam Mobil.");

        System.out.println("Montir apakah ada?: " + (montir1 != null ? "Ya, " + montir1.nama : "Tidak"));
    }
}