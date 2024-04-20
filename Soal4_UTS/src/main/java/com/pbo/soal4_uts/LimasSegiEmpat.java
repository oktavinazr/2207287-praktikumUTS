/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.soal4_uts;

/**
 * @author Oktavina Zahra R - 2207287
 */
public class LimasSegiEmpat {
    double luasAlas;
    double luasSelubungLimas;
    double tinggi;

    public LimasSegiEmpat() {}

    public LimasSegiEmpat(double luasAlasBaru, double luasSelubungLimasBaru, double tinggiBaru) {
        this.luasAlas = luasAlasBaru;
        this.luasSelubungLimas = luasSelubungLimasBaru;
        this.tinggi = tinggiBaru;
    }

    public double getLuas() {
        return this.luasAlas + this.luasSelubungLimas;
    }

    public double getVolume() {
        return (1.0/3.0) * this.luasAlas * this.tinggi;
    }

    public void setLuasAlas(double luasAlasBaru) {
        this.luasAlas = luasAlasBaru;
    }

    public void setLuasSelubung(double luasSelubungLimasBaru) {
        this.luasSelubungLimas = luasSelubungLimasBaru;
    }

    public void setTinggi(double tinggiBaru) {
        this.tinggi = tinggiBaru;
    }
}
