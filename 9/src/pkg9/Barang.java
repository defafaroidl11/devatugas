/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg9;

/**
 *
 * @author KAMAL
 */

public class Barang {
    double totalBiaya, perKg, perKm, feeLayanan;

    double biayaKirim(double berat) {
        perKg = 5000;
        totalBiaya = berat * perKg;
        return totalBiaya;
    }

    double biayaKirim(double berat, double jarak) {
        perKg = 5000;
        perKm = 2000;
        totalBiaya = (berat * perKg) + (jarak * perKm);
        return totalBiaya;
    }

    double biayaKirim(double berat, double jarak, String layanan) {
        perKg = 5000;
        perKm = 2000;
        if ("express".equals(layanan)) {
            feeLayanan = 4000;
        } else {
            feeLayanan = 2000;
        }
        totalBiaya = (berat * perKg) + (jarak * perKm) + feeLayanan;
        return totalBiaya;
    }

    public static void main(String[] args) {
        Barang pb = new Barang();

        System.out.println("biaya kirim berat 10kg " + pb.biayaKirim(10));
        System.out.println("biaya kirim berat 10kg ,jarak 15km " + pb.biayaKirim(10, 15));
        System.out.println("biaya kirim berat 10kg ,jarak 15km , layanan express " + pb.biayaKirim(10, 15, "express"));
    }
}