package tugas;

import java.io.*;
import java.util.ArrayList;

public class Gudang {

    private ArrayList<Barang> daftar;
    private String namaBerkas;

    public Gudang(String namaBerkas) {
        this.namaBerkas = namaBerkas;
        daftar = new ArrayList<>();
    }

    public void tambahBarang(Barang b) {
        daftar.add(b);
    }

    public void tampilkanSemua() {

        System.out.println("== DAFTAR BARANG ==");

        for (int i = 0; i < daftar.size(); i++) {
            System.out.println((i + 1) + ". "
                    + daftar.get(i).info());
        }
    }

    public void simpanKeBerkas() {

        try (PrintWriter out =
                new PrintWriter(
                        new FileWriter(namaBerkas))) {

            for (Barang b : daftar) {
                out.println(b.keBaris());
            }

            System.out.println("Data barang disimpan.");

        } catch (IOException e) {
            System.out.println("Gagal menyimpan: "
                    + e.getMessage());
        }
    }

    public void muatDariBerkas() {

        daftar.clear();

        try (BufferedReader in =
                new BufferedReader(
                        new FileReader(namaBerkas))) {

            String baris;

            while ((baris = in.readLine()) != null) {

                String[] bagian = baris.split(";");

                if (bagian.length == 3) {

                    daftar.add(
                            new Barang(
                                    bagian[0],
                                    Double.parseDouble(bagian[1]),
                                    Integer.parseInt(bagian[2])
                            )
                    );
                }
            }

            System.out.println("Data barang dimuat.");

        } catch (IOException e) {
            System.out.println("Gagal memuat: "
                    + e.getMessage());
        }
    }

    public double totalNilai() {

        double total = 0;

        for (Barang b : daftar) {
            total += b.getHarga() * b.getStok();
        }

        return total;
    }
}