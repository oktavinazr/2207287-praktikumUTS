/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal2_uts;

/**
 * @author Oktavina Zahra R - 2207287
 */
import java.util.Scanner;

public class Soal2_UTS {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bilangan;
        int jumlahPositif = 0;
        int jumlahNegatif = 0;
        double total = 0;
        int jumlahBilangan = 0;

        System.out.print("Masukkan beberapa bilangan bulat, "
                + "program akan berhenti jika memasukkan nilai 0: ");

        while ((bilangan = input.nextInt()) != 0) {
            if (bilangan > 0) {
                jumlahPositif++;
            } else if (bilangan < 0) {
                jumlahNegatif++;
            }

            total += bilangan;
            jumlahBilangan++;
        }

        System.out.println("Jumlah bilangan positif adalah " + jumlahPositif);
        System.out.println("Jumlah bilangan negatif adalah " + jumlahNegatif);
        System.out.println("Nilai total adalah " + total);
        
        if (jumlahBilangan != 0) {
            double rataRata = total / jumlahBilangan;
            System.out.println("Nilai rata-rata " + rataRata);
        } else {
            System.out.println("Tidak ada bilangan yang dimasukkan kecuali 0, "
                    + "sehingga tidak ada rata-rata yang dihitung.");
        }
    }
    
}
