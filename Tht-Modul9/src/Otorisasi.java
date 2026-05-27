//sebuah interface bernama otorisasi sebuah verifikasi pin
public interface Otorisasi {
    //mengembalikan true jika pin sesuai jika tidak maka akan false
    boolean verifikasiPin(String pin);
}
