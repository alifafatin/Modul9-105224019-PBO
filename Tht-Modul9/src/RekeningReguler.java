public class RekeningReguler extends Rekening{
    double biayaAdmin; //biaya admin yang dipotong nantinya setiap ada transaksi

    //constructor
   public RekeningReguler(String nomorRekening, String namaPemilik, double saldoAwal, String pin, double biayaAdmin) {
        super(nomorRekening, namaPemilik, saldoAwal, pin);
        this.biayaAdmin = biayaAdmin;

    }

    @Override
    public void tarik(double jumlah){
        //jika jumlah tarik lebih kecil atau sama dengan 0 maka akan tertolak
      if (jumlah <= 0){
          System.out.println("jumlah tarik tidak boleh dari 0");
          return;
      }

    //menghitung total yang seharusnya dipotng dari saldo (sudah termasuk biaya admin)
    double total = biayaAdmin + jumlah;

    //mengecek apakah saldo mencukupi untuk membayar total yang sudah dikeluarkan (beserta total dengan admin)
    if(getSaldoRekening() < total){
        System.out.println("Maaf saldo anda tidak cukup, saldo anda: Rp" + getSaldoRekening());
        return;
    }
    //jika ternyata saldo cukup, maka kurangi dengan total
    saldoRekening -= total;

    //catat aktivitas selama trabnsaksi berlangsung
    bukuMutasi.catatLog("Tarik Rp" + jumlah);

    //tampilkan konfirmasi bahwa penarikan berhasil
    System.out.println("Anda menarik Rp" + jumlah + "Berhasil!");
    System.out.println("Saldo anda sekarang Rp" + saldoRekening);
    }
}
