package Modul9.Posttest.src;

public class Mobil {
    String merk;
    String warna;

    privateMesin mesin;

    private Ban[] daftarBan;

    public Mobil(String merk, String warna, privateMesin mesin, Ban[] daftarBan) {
        this.merk = merk;
        this.warna = warna;
        this.mesin = new Mesin(tipeMesin, kapasitasCC);
        this.daftarBan = new Ban[4];
    }

    public void pasangSetBan(Ban[] setBan){
        for (int i = 0; i < setBan.length; i++) {
            this.daftarBan[i] = setBan[i];
        }
    }

    public void tampilkanInformasi(){
       System.out.println("Merk : " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Mesin: " + mesin.tipeMesin + 
            " - " + mesin.kapasitasCC + "CC");
        System.out.println("Ban  :");
        for (int i = 0; i < daftarBan.length; i++) {
            if (daftarBan[i] != null) {
                System.out.println("  Ban " + (i+1) + ": " + 
                    daftarBan[i].merk + " Ring " + daftarBan[i].ukuranRing);
            }
        }

    }
}
