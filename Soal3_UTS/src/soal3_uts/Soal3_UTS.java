/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal3_uts;

/**
 * @author Oktavina Zahra R - 2207287
 */

import java.util.Scanner;
public class Soal3_UTS {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan bulat: ");
        long bilangan = input.nextLong();
        
        int jumlahDigit = sumDigits(bilangan);
        System.out.println("Jumlah digit dalam bilangan " + bilangan + " adalah " + jumlahDigit);
    }
    
    public static int sumDigits(long n) {
        int jumlahDigit = 0;
        
        // Loop untuk mengekstrak dan menjumlahkan digit
        while (n != 0) {
            jumlahDigit += n % 10; // Menggunakan % untuk mendapatkan digit paling belakang
            n /= 10; // Menghapus digit yang sudah diekstrak
        }
        
        return jumlahDigit;
    }
    
}
