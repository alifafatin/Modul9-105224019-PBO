//pada kasus ini ketika rekening dihapus maka bukumutasi akan hilang 
//karena rekening terhubung dengan buku mutasi
public abstract class Rekening implements Otorisasi{
    String nomorRekening; //nomor unik rekening  
    String namaPemilik; //nama pemilik dari rekening
    double saldoRekening; //saldo rekening atau jumlah uang yang ada pada rekening
    String pin; //pin 
    BukuMutasi bukuMutasi; //jika rekening dihapus, maka nantinya bukumutasi akan ikut dihapus secara otomatis
    //karena buku mutasi merupakan bagian dari rekening

    //constructor
    public Rekening(String nomorRekening, String namaPemilik, double saldoRekening, String pin) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldoRekening = saldoRekening;
        this.pin = pin;
        this.bukuMutasi = new BukuMutasi(nomorRekening);
        bukuMutasi.catatLog("Rekening dibuat dengan saldo awal: " + saldoRekening); //mencatat aktivitas pertama, ketika user membuka rekening baru
    }

    //getter untuk no rekening
    public String getNomorRekening(){
        return nomorRekening;
    }

    //getter untuk nama pemilik
    public String getNamaPemilik(){
        return namaPemilik;
    }

    //getter untuk saldo rekening
    public double getSaldoRekening(){
        return saldoRekening;
    }

    @Override 
    //mengimplementasikan interface Otoritas
    public boolean verifikasiPin(String pin){
        return this.pin.equals(pin);
    }

    //Setor() untuk menambahkan saldo dengan menyetor duit ke bank
    public void setor(double jumlahSetor){
        if(jumlahSetor <= 0){ //validasi apakah jumlah setor atau tidak atau negatif
            System.out.println("Jumlah setor harus lebih besar dari 0");
            return;
        }
        saldoRekening += jumlahSetor; //menambahkan jumlag setor ke saldo yang ada
        bukuMutasi.catatLog("Setor: " + jumlahSetor);
        System.out.println("Setoran Rp " + jumlahSetor + " berhasil. Saldo sekarang: Rp" + saldoRekening);

    }

    //tarik, menggunakan method absrrak yang nantinya akan di override atau polimorfisme
    public abstract void tarik(double jumlahTarik);

    //tampilan info
    public void infoRek(){
        System.out.println("============================================================");
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo Rekening: " + saldoRekening);
        System.out.println("Jenis Rekening: " + this.getClass().getSimpleName());
        System.out.println("============================================================");
    }
}
