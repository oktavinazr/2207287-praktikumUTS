/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal1_uts;

/**
 * @author Oktavina Zahra R - 2207287
 */
import java.util.Random;

public class Soal1_UTS {

    public static void main(String[] args) {
        // Array untuk menyimpan nama bulan
        String[] namaBulan = {
            "Januari", "Februari", "Maret", "April", "Mei", "Juni",
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };
        
        // Membuat objek Random
        Random acak = new Random();
        
        // Menghasilkan bilangan bulat acak antara 1 dan 12
        int nomorBulan = acak.nextInt(12) + 1;
        
        // Menampilkan nama bulan sesuai dengan nomor yang dihasilkan
        System.out.println("Nomor bulan: " + nomorBulan);
        System.out.println("Nama bulan: " + namaBulan[nomorBulan - 1]);
    }
    
}
