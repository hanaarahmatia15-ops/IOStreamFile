package tugas;

// Nama : Balqis Ansari
// NPM  : 2410010076

public class MainTugas {

    public static void main(String[] args) {

        String[] kategori = {
            "Makanan",
            "Minuman",
            "Alat Tulis"
        };

        System.out.println("== KATEGORI ==");

        for (String k : kategori) {
            System.out.println("- " + k);
        }

        Gudang gudang =
                new Gudang("barang.txt");

        gudang.tambahBarang(
                new Barang("Pensil", 3000, 50));

        gudang.tambahBarang(
                new Barang("Buku Tulis", 5000, 40));

        gudang.tambahBarang(
                new Barang("Pulpen", 4000, 30));

        gudang.tambahBarang(
                new Barang("Air Mineral", 4000, 100));

        gudang.tambahBarang(
                new Barang("Roti", 7000, 25));

        System.out.println();
        gudang.tampilkanSemua();

        gudang.simpanKeBerkas();

        System.out.println();

        Gudang gudangBaru =
                new Gudang("barang.txt");

        gudangBaru.muatDariBerkas();

        System.out.println();
        gudangBaru.tampilkanSemua();

        System.out.println();
        System.out.println(
                "Total Nilai Persediaan = Rp"
                + gudangBaru.totalNilai());
    }
}