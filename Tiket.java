/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopcharacteristic;

/**
 *
 * @author yuni
 */

// Kelas abstrak
abstract class Tiket {
    private String namaPenumpang;
    private double harga;

    public Tiket(String namaPenumpang) {
        this.namaPenumpang = namaPenumpang;
    }

    public abstract void hitungHarga();

    public String getNamaPenumpang() {
        return namaPenumpang;
    }

    public double getHarga() {
        return harga;
    }

    protected void setHarga(double harga) {
        this.harga = harga;
    }
}