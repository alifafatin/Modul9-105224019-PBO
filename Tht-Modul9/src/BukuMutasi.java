//pada kasus ini ketika rekening dihapus maka bukumutasi akan hilang 
//karena rekening terhubung dengan buku mutasi
public class BukuMutasi {
    String nomorRekening; //untuk menyimpan nomor rekening untuk keterangan milik siapa buku ini

    public BukuMutasi(String nomorRekening) { //constructor
        this.nomorRekening = nomorRekening;
        System.out.println("[Buku Mutasi] berhasil dibuat untuk Nomor Rekening: " + nomorRekening);
    }

    //untuk menyimpan aktivitas transaksi ke log mutasi
    public void catatLog(String aktivitas){
        System.out.println("Mutasi = " + nomorRekening + ": " + aktivitas); 
    }

}
