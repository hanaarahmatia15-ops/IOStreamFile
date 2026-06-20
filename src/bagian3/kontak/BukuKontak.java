/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian3.kontak;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;

public class BukuKontak {
    // ArrayList yang menampung objek bertipe Kontak
    private ArrayList<kontak> daftar = new ArrayList<>();
    private String namaBerkas;
    
    public BukuKontak(String namaBerkas) {
        this.namaBerkas = namaBerkas;
    }
    // Menambah satu kontak ke koleksi
    public void tambahKontak(kontak kontak) {
        daftar.add(kontak);
    }
    // Menampilkan seluruh koleksi beserta nomor urut
    public void tampilkanSemua() {
        System.out.println("== Daftar Kontak ==");
        for (int i = 0; i < daftar.size(); i++) {
            kontak k = daftar.get(i);
            System.out.println((i + 1) + ". " + k.info());
        }
    }
    
    // Menyimpan seluruh kontak ke berkas, satu kontak per baris
    public void simpanKeBerkas() {
        try (PrintWriter penulis = new PrintWriter(new FileWriter(namaBerkas))) {
            for (kontak k : daftar) {
                penulis.println(k.keBaris());
            }
            System.out.println("Kontak disimpan ke " + namaBerkas);
        } catch (IOException e) {
            System.out.println("Gagal menyimpan: " + e.getMessage());
        }
    }
    // Membaca kembali kontak dari berkas ke dalam ArrayList
    public void muatDariBerkas() {
        daftar.clear();
        try (BufferedReader pembaca = new BufferedReader(new FileReader(namaBerkas))) {
            String baris;
            while ((baris = pembaca.readLine()) != null) {
                String[] bagian = baris.split(";");
                if (bagian.length == 3) {
                daftar.add(new kontak(
                        bagian[0],
                        bagian[1],
                        bagian[2]));
                }
            }
            System.out.println("Kontak dimuat dari " + namaBerkas);
        } catch (IOException e) {
            System.out.println("Gagal memuat: " + e.getMessage());
        }
    }
    
    public int jumlahKontak() {
        return daftar.size();
    }
    
    public void cariKontak(String nama) {
    for (kontak k : daftar) {
        if (k.getNama().equals(nama)) {
            System.out.println("Ditemukan: " + k.info());
            return;
        }
    }
    System.out.println("Kontak " + nama + " tidak ditemukan.");
    }
    
    public void hapusKontak(String nama) {

    for (int i = 0; i < daftar.size(); i++) {

        if (daftar.get(i).getNama().equals(nama)) {

            daftar.remove(i);

            System.out.println("Kontak " + nama
                    + " berhasil dihapus.");

            simpanKeBerkas();

            return;
        }
    }

    System.out.println("Kontak " + nama
            + " tidak ditemukan.");
    }
}
