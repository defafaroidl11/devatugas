/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author KAMAL
 */
 class Baranglo {
    double totalBiaya, perKg, perKm, feeLayanan;

    void biayaKirim() {
        System.out.println("biaya kirim barang");
    }
}

class CekBiaya extends Baranglo {
    void biayaKirim(double berat) {
        perKg = 5000;
        totalBiaya = berat * perKg;
        System.out.println("biaya kirim barang " + berat + " Kg : Rp" + totalBiaya);
    }

    void biayaKirim(double berat, double jarak) {
        perKg = 5000;
        perKm = 2000;
        totalBiaya = (berat * perKg) + (jarak * perKm);
        System.out.println("biaya kirim barang " + berat + " kg jarak " + jarak + " : Rp " + totalBiaya);
    }

    void biayaKirim(double berat, double jarak, String layanan) {
        perKg = 5000;
        perKm = 2000;
        if (layanan.equals("express")) {
            feeLayanan = 4000;
        } else {
            feeLayanan = 2000;
        }
        totalBiaya = (berat * perKg) + (jarak * perKm) + feeLayanan;
        System.out.println("biaya kirim barang " + berat + " kg jarak " + jarak + " km layanan " + layanan + " : Rp " + totalBiaya);
    }
}

public class BarangLagi {
    public static void main(String[] args) {
        CekBiaya cekKirim = new CekBiaya();
        cekKirim.biayaKirim(5);
        cekKirim.biayaKirim(5, 10);
        cekKirim.biayaKirim(5, 10, "standar");
    }
}