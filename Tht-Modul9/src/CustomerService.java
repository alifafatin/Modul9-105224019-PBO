//berdiri sendiri
//Nasabah akan memanggil CS untuk laooran keluhan
//nasabah dan CS bisa berdiri sendiri, ketika nasabah hilang CS akan tetap ada begitu juga sebaliknya
public class CustomerService {
    String namaCS;
    String kodeCS;

    //constructor
    public CustomerService(String namaCS, String kodeCS){
        this.namaCS = namaCS;
        this.kodeCS = kodeCS;
    }

    //untuk tampilan jika ada user yg membutuhkan atau mengeluhkan sesuatu
    public void pelayanan(Nasabah nasabah, String keluhan){
        System.out.println("============================================================");
        System.out.println("CS: " + namaCS + " | Kode:" + kodeCS + "| Laporan dari: " + nasabah.getNamaNasabah());
        System.out.println("Keluhan: " + keluhan);
        System.out.println("Keluhan sudah tercatat, terimakasih. Kami akan memperbaiki layanan kami sebaik mungkin :D");
        System.out.println("============================================================");
    }
}
