/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian2.bacatulis;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class latihan3 {
    public static void main(String[] args) {
        // try-with-resources: stream otomatis ditutup setelah blok selesai
        try (PrintWriter penulis = new PrintWriter(new FileWriter("mahasiswa.txt"))) {
        penulis.println("Andi");
        penulis.println("Budi");
        penulis.println("Citra");
        System.out.println("Data berhasil ditulis ke mahasiswa.txt");
        } catch (IOException e) {
        System.out.println("Gagal menulis: " + e.getMessage());
        }
    }
}
