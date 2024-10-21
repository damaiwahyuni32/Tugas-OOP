/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopcharacteristic;

/**
 *
 * @author yuni
 */

class TiketBisnis extends Tiket {
    public TiketBisnis(String namaPenumpang) {
        super(namaPenumpang);
    }

    @Override
    public void hitungHarga() {
        setHarga(200000);
    }
}