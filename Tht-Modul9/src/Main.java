import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==========================");
        System.out.println("Simulasi Pokoknya Mah");
        System.out.println("==========================");

        // registrasi nasabah terlebih dahulu atau menambahkan user
        System.out.println("=== Registrasi Nasabah ===");
        Nasabah nasabah1 = new Nasabah("N0001", "Sisca Monica");
        Nasabah nasabah2 = new Nasabah("N0002", "Ni Putu Haruka");
        Nasabah nasabah3 = new Nasabah("N0003", "Erlangga");
        Nasabah nasabah4 = new Nasabah("N0004", "Paulus");
        System.out.println("Nasabah berhasil ditambahkan!!");

        //buka rekening baru untuk sisca dan erlangga
        System.out.println("=== Buka Rekening ===");
        RekeningReguler reguler = new RekeningReguler("111000", "Sisca Monica", 55000, "1234", 3500);
        RekeningPrioritas prioritas = new RekeningPrioritas("200000", "Erlangga", 100000000, "2392", 1000000);

        nasabah1.tambahRekening(reguler);
        nasabah3.tambahRekening(prioritas);

        //menampilkan info rekening ada berapa reguler dan prioritas
        System.out.println("=== Info Rekening ===");
        reguler.infoRek();
        prioritas.infoRek();

        // menampilkan info rekening dari nasabah 
        System.out.println("=== Tampilkan Rekening Nasabah ===");
        nasabah1.tampilkanRekening();
        nasabah2.tampilkanRekening();
        nasabah3.tampilkanRekening();
        nasabah4.tampilkanRekening();

        // melakukan tranasaksi rekening reguler dan rekening prioritas
        System.out.println("=== Transaksi Rekening Reguler (Sisca) ===");
        reguler.setor(200000);
        reguler.tarik(100000);
        reguler.tarik(99999999);

        System.out.println("=== Transaksi Rekening Prioritas (Erlangga) ===");
        prioritas.tarik(500000);
        prioritas.tarik(2000000);

        // verifikasi apakah pin benaer atau tidak
        System.out.println("=== Verifikasi PIN ===");
        System.out.println("PIN '1234' benar? " + reguler.verifikasiPin("1234"));
        System.out.println("PIN '0000' benar? " + reguler.verifikasiPin("0000"));

        // customer service berdiri sendiri, karena dia melayani keluhan nasabah tidak ikut terlibat dalam hal transaksi
        System.out.println("=== Customer Service ===");
        CustomerService cs = new CustomerService("Andi Prasetyo", "CS-99");
        nasabah1.laporkanKeluhan(cs, "ATM tidak bisa mengeluarkan uang");

        // ketika user mau menambahkan rekening namun tertahan karena maksimal kan 3 rekening dalam satu iedentitas
        System.out.println("=== Batas Maksimal Rekening===");
        nasabah1.tambahRekening(new RekeningReguler("111001", "Sisca Monica", 100000, "1111", 3500));
        nasabah1.tambahRekening(new RekeningReguler("111002", "Sisca Monica", 100000, "2222", 3500));
        nasabah1.tambahRekening(new RekeningReguler("111003", "Sisca Monica", 100000, "3333", 3500));
        nasabah1.tampilkanRekening();

        //jika dihapus maka masih ada
        System.out.println("Rekening Prioritas");
        System.out.println("Rekening " + prioritas.getNomorRekening() +" masih eksis dengan saldo Rp" + prioritas.getSaldoRekening());
        System.out.println("Ini membuktikan Rekening bisa berdiri sendiri tanpa Nasabah (loose-coupling).");


        scanner.close();
    }
}