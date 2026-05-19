package Modul9.LatihanSoal.src;

//jika rumah sakit ditiadakan maka ruangan yang ada di dalam otomatis akan musnah dan tidak bisa berdiri secara mandiri
public class RumahSakit {
    String namaRumahSakit;

    //menggunakan array standar
    Ruangan[] daftarRuangan;
    Dokter[] daftarDokter;

    //objek ruangan dibuat langsung di dalam konstruktor rumah sakit
    //pembuatan objek bergantung speenuhnya pada objek rumah sakit
    public RumahSakit(String namaRumahSakit, Dokter[] daftarDokter){
        this.namaRumahSakit = namaRumahSakit;
        this.daftarRuangan = new Ruangan[2];
        this.daftarRuangan[0] = new Ruangan("R-01", 10);
        this.daftarRuangan[1] = new Ruangan("R-02", 5);
        this.daftarDokter = daftarDokter;
    }

    public void tampilkanRuangan(){
        System.out.println("Daftar Ruangan: " + namaRumahSakit + " :");
        for(Ruangan ruangan : daftarRuangan){
            if(ruangan != null){
                System.out.println(" - " + ruangan.nomorRegristasi + " (" + ruangan.kapasitasMaksimal + ")");
            }
        }

    }

    public void tampilkanDokter(){
        System.out.println("Daftar Dokter di Rumah Sakit: " + namaRumahSakit + " :");
        for (Dokter dokter : daftarDokter) {
            if(dokter != null){
                System.out.println(" - " + dokter.namaDokter + " (" + dokter.spesialisDoter + ")");
            }
        }
    }
}
