package Modul9.LatihanSoal.src;

public class Dokter {
    String namaDokter;
    String spesialisDoter;

    public Dokter(String namaDokter, String spesialisDoter) {
        this.namaDokter = namaDokter;
        this.spesialisDoter = spesialisDoter;
    }

    //dokter memeriksa pasien 
    //asosiasi: dokter hanya melakukan interaksi dengan pasien
    public void periksaPasien(Pasien pasien){
        System.out.println("Dokter memeriksa pasien");
        System.out.println("Nama Dokter: " + this.namaDokter);
        System.out.println("Spesialis Dokter: " + this.spesialisDoter);
        System.out.println("Nama Pasien: " + pasien.namaPasien);
        System.out.println("Umur Pasien: " + pasien.umurPasien);
    }
}
