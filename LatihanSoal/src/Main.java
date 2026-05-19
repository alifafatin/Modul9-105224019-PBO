package Modul9.LatihanSoal.src;

public class Main {
    //setidaknya ada dua dokter dan ada dua pasien
    public static void main(String[] args) {
        Dokter dokter1 = new Dokter("Dr. Budi", "Jantung");
        Dokter dokter2 = new Dokter("Dr. Shella", "Anak-anak");

        Pasien pasien1 = new Pasien("Michael", 40);
        Pasien pasien2 = new Pasien("Elsa", 5);

        dokter1.periksaPasien(pasien1);
        dokter2.periksaPasien(pasien2);

        Dokter[] arrayDokter = {dokter1, dokter2};

        RumahSakit rs = new RumahSakit("RS Sehat Selalu", arrayDokter);

        rs.tampilkanRuangan();
        rs.tampilkanDokter();

        rs = null;

        //uji coba jika rumah sakit ditiadakan
        System.out.println("Rumah sakit ditiadakan");
        System.out.println("Dokter Budi apakah ada?: " + dokter1.namaDokter);
        System.out.println("Dokter Shella apakah ada?: " + dokter2.namaDokter);
        System.out.println("Pasien Michael apakah ada?: " + pasien1.namaPasien);
        System.out.println("Pasien Elsa apakah ada?: " + pasien2.namaPasien);

        


    }
}
