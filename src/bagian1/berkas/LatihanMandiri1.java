/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class LatihanMandiri1 {
    public static void main(String[] args) {

        // =========================
        // No 1. Cek laporan.txt
        // =========================
        File laporan = new File("laporan.txt");

        if (laporan.exists()) {
            System.out.println("Berkas ada, ukuran: "
                    + laporan.length() + " byte");
        } else {
            System.out.println("Berkas laporan.txt tidak ditemukan.");
        }

        System.out.println();

        // =========================
        // No 2. Membuat folder arsip
        // =========================
        File folder = new File("arsip");

        if (folder.mkdir()) {
            System.out.println("Folder arsip berhasil dibuat.");
        } else {
            System.out.println("Folder arsip gagal dibuat atau sudah ada.");
        }

        System.out.println();

        // =========================
        // No 3. Membuat lalu menghapus
        // sementara.txt
        // =========================
        File berkas = new File("sementara.txt");

        try {
            berkas.createNewFile();

            System.out.println("Sebelum dihapus, ada? "
                    + berkas.exists());

            berkas.delete();

            System.out.println("Sesudah dihapus, ada? "
                    + berkas.exists());

        } catch (IOException e) {
            System.out.println("Kesalahan: "
                    + e.getMessage());
        }
    }
}
