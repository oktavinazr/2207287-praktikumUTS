/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pbo.soal4_uts;

/**
 * @author Oktavina Zahra R - 2207287
 */

public class Soal4_UTS {

    public static void main(String[] args) {
        LimasSegiEmpat limas1 = new LimasSegiEmpat(1.0, 1.0, 1.0);
        System.out.println("Limas segi empat dengan luas alas : " + limas1.luasAlas +
                           ", luas selubung limas : " + limas1.luasSelubungLimas +
                           ", dan tinggi : " + limas1.tinggi + ".");
        System.out.println("Luasnya : " + limas1.getLuas() +
                           ", sedangkan volumenya : " + limas1.getVolume());

        LimasSegiEmpat limas2 = new LimasSegiEmpat(30.0, 40.0, 50.0);
        System.out.println("Limas segi empat dengan luas alas : " + limas2.luasAlas +
                           ", luas selubung limas : " + limas2.luasSelubungLimas +
                           ", dan tinggi : " + limas2.tinggi + ".");
        System.out.println("Luasnya : " + limas2.getLuas() +
                           ", sedangkan volumenya : " + limas2.getVolume());

        LimasSegiEmpat limas3 = new LimasSegiEmpat(25.0, 35.0, 45.0);
        System.out.println("Limas segi empat dengan luas alas : " + limas3.luasAlas +
                           ", luas selubung limas : " + limas3.luasSelubungLimas +
                           ", dan tinggi : " + limas3.tinggi + ".");
        System.out.println("Luasnya : " + limas3.getLuas() +
                           ", sedangkan volumenya : " + limas3.getVolume());
    }
    
}
