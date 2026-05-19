package Modul9.LatihanSoal.src;

//rumah sakit terdiri dari beberapa ruangan operasional yang setiap ruangan mempunyai nomor regristasi
//misalnya R-01
//dan kapasitas Maksimal
public class Ruangan {
    String nomorRegristasi;
    int kapasitasMaksimal;

    public Ruangan(String nomorRegristasi, int kapasitasMaksimal) {
        this.nomorRegristasi = nomorRegristasi;
        this.kapasitasMaksimal = kapasitasMaksimal;
    }
}
