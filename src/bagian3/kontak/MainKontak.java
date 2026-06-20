package bagian3.kontak;

public class MainKontak {

    public static void main(String[] args) {

        // Membuat objek pengelola dan mengisinya
        BukuKontak buku = new BukuKontak("kontak.txt");

        buku.tambahKontak(
                new kontak("Aqis",
                        "085740574633",
                        "balqissnr15@gmail.com"));

        buku.tambahKontak(
                new kontak("Yuli",
                        "081251550319",
                        "yuli86@gmail.com"));

        buku.tambahKontak(
                new kontak("Layla",
                        "082157591102",
                        "EffaLaayla70@gmail.com"));

        // Uji pencarian kontak (Nomor 1)
        buku.cariKontak("Aqis");
        buku.cariKontak("Dewi");

        System.out.println("\n== Daftar Kontak Sebelum Dihapus ==");
        buku.tampilkanSemua();

        // Uji hapus kontak (Nomor 3)
        buku.hapusKontak("Yuli");

        System.out.println("\n== Daftar Kontak Setelah Dihapus ==");
        buku.tampilkanSemua();

        // Simpan ke berkas
        buku.simpanKeBerkas();

        System.out.println();

        // Objek baru yang kosong, lalu memuat dari berkas
        BukuKontak bukuLain = new BukuKontak("kontak.txt");

        bukuLain.muatDariBerkas();

        System.out.println("\n== Data Setelah Dimuat Dari Berkas ==");
        bukuLain.tampilkanSemua();

        System.out.println("Jumlah kontak: "
                + bukuLain.jumlahKontak());
    }
}