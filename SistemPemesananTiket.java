/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopcharacteristic;

/**
 *
 * @author yuni
 */

public class SistemPemesananTiket {
    public static void main(String[] args) {
        Tiket ekonomi = new TiketEkonomi("Budi");
        Tiket bisnis = new TiketBisnis("Ani");

        ekonomi.hitungHarga();
        bisnis.hitungHarga();

        System.out.println("Tiket Ekonomi - Nama: " + ekonomi.getNamaPenumpang() + ", Harga: " + ekonomi.getHarga());
        System.out.println("Tiket Bisnis - Nama: " + bisnis.getNamaPenumpang() + ", Harga: " + bisnis.getHarga());
    }
}
