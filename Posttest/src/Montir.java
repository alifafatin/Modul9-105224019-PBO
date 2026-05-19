package Modul9.Posttest.src;

import rental.Mobil;

public class Montir {
    String idMontir;
    String namaMontir;

    public Montir(String idMontir, String namaMontir) {
        this.idMontir = idMontir;
        this.namaMontir = namaMontir;
    }

    public void lakukanQualityControl(Mobil m){
        System.out.println("[Quality Control");
        System.out.println("Nama Montir:  " + namaMontir + "(ID Montir: " + idMontir + ")");
        System.out.println("Mobil yang di quality control: " + m.merk + "warna " + m.warna);
        m.tampilkanInformasi();
    }
}
