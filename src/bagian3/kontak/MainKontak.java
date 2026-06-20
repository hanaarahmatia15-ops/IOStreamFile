/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian3.kontak;

/**
 *
 * @author ASUS
 */
public class MainKontak {
    public static void main(String[] args) {
        // Membuat objek pengelola dan mengisinya
        BukuKontak buku = new BukuKontak("kontak.txt");
        
        buku.tambahKontak(
        new kontak("Aqis", "085740574633", "balqissnr15@gmail.com"));
        
        buku.tambahKontak(
        new kontak("Yuli", "081251550319", "yuli86@gmail.com"));

        buku.tambahKontak(
        new kontak("Layla", "082157591102", "EffaLaayla70@gmail.com"));
        
        buku.cariKontak("Budi");
        buku.cariKontak("Dewi");

        buku.tampilkanSemua();
        buku.simpanKeBerkas();
        System.out.println();
        // Objek baru yang kosong, lalu memuat dari berkas
        BukuKontak bukuLain = new BukuKontak("kontak.txt");
        bukuLain.muatDariBerkas();
        bukuLain.tampilkanSemua();
        System.out.println("Jumlah kontak: " + bukuLain.jumlahKontak());
    }
}
