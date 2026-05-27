//Nasabah akan memanggil CS untuk laooran keluhan
//nasabah dan CS bisa berdiri sendiri, ketika nasabah hilang CS akan tetao ada
public class Nasabah {
    String idNasabah;
    String namaNasabah;
    int jumlahRekening;
    Rekening[] daftarRek; //ketika nasabah dihapus maka rekening tetap ada dengan batasan nasabah hanya mempunyai rekening maksimal 3

    //constructor
    public Nasabah(String idNasabah, String namaNasabah) {
        this.idNasabah = idNasabah;
        this.namaNasabah = namaNasabah;
        this.daftarRek = new Rekening[3];
        this.jumlahRekening = 0;
    }

    //getter untuk nama nasabah, id nasabah, dan jumlah rekening yg dipunya oleh nasabah

    public String getNamaNasabah() {
        return namaNasabah;
    }

    public String getIdNasabah() {
        return idNasabah;
    }

    public int getJumlahRekening() {
        return jumlahRekening;
    }

    //merupakan getter yang mengambil objek dari rekening pada array berdasarkan posisi yang sudah ditunjuk atau dippilih oleh user
    public Rekening getRekening(int posisi) {
        if (posisi < 0 || posisi >= jumlahRekening) {
            return null;
        }
        return daftarRek[posisi];
    }

    //menampilkan rekening, jika ternyata 0 rekening artinya nasabah belum memiliki rekening
    //namun jika tidak 0 maka artinya nasabah punya rek dan akan ditampilkan
    public void tampilkanRekening() {
        if (jumlahRekening == 0) {
            System.out.println(namaNasabah + " belum mempunyai rekening.");
            return;
        }
        System.out.println("Rekening milik " + namaNasabah + ":");
        for (int i = 0; i < jumlahRekening; i++) {
            System.out.println("  " + (i + 1) + ". " + daftarRek[i].getNomorRekening() + " | Saldo: Rp" + daftarRek[i].getSaldoRekening());
        }
    }

    //jika nasabah ternyata sudah mempunyai rekening 3 maka akan menolak untuk tambah rekening karena maksimal yang diperbolehkan oleh sistem adalah 3 rekening
    public void tambahRekening(Rekening rekening) {
        if (jumlahRekening < daftarRek.length) {
            daftarRek[jumlahRekening] = rekening;
            jumlahRekening++;
            System.out.println("Rekening " + rekening.getNomorRekening() + " berhasil ditambahkan ke " + namaNasabah);
        } else {
            System.out.println("Maaf " + namaNasabah + ", sudah memiliki 3 rekening!");
        }
    }

    // asosiasi atau berdiri sendiri 
    public void laporkanKeluhan(CustomerService cs, String keluhan) {
        cs.pelayanan(this, keluhan);
    }
}