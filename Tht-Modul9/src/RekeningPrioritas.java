public class RekeningPrioritas extends Rekening {
    double minimalTarik; //dalam rekening rpiroitas dibebaskan biaya admin namun mendapatkan minimum transaksi

    //constructor
      public RekeningPrioritas(String nomorRekening, String namaPemilik, double saldoAwal, String pin, double minimalTarik) {
        super(nomorRekening, namaPemilik, saldoAwal, pin);
        this.minimalTarik = minimalTarik;
    }

    @Override
    public void tarik(double jumlah){ //jumlah merupakan jumlah penarikan yang dimasukan oleh user
        //jika jumlah tarik lebih kecil atau sama dengan 0 maka akan tertolak
      if (jumlah <= 0){
          System.out.println("jumlah tarik tidak boleh dari 0");
          return;
      }

      //validasi ketika jumlah tarik memenuhi batas minimum jumlah penarikan
      if (jumlah < minimalTarik){
        System.out.println("Maaf, minimu penarikan prioritas adalah Rp" + minimalTarik + ". Tidak sesuai demgan jumlah tarik anda yaitu Rp" + jumlah);
        return;
      }

      //cek apakah saldo memenyhi (karena tidak ada potongan admin maka lansgung ke jumlah penarikan)
      if(getSaldoRekening() < jumlah){
        System.out.println("Maaf saldo anda tidak cukup, saldo anda: Rp" + getSaldoRekening());
        return;
      }

      //kurangi saldo 
      saldoRekening -= jumlah;

      //catat aktivitas selama trabnsaksi berlangsung
      bukuMutasi.catatLog("Tarik Rp" + jumlah);

      //tampilkan konfirmasi bahwa penarikan berhasil
      System.out.println("Anda menarik Rp" + jumlah + "Berhasil!");
      System.out.println("Saldo anda sekarang Rp" + saldoRekening);
    }

}
