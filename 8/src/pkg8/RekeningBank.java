/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template ovl
 */
package pkg8;

/**
 *
 * @author KAMAL
 */
public class RekeningBank {
    private double saldo;

    public RekeningBank(double saldo) {
        this.saldo = saldo;
    }

   
    public double hitungBunga(int tahun) {
        return saldo * 0.05 * tahun;
    }

    
    public double hitungBunga(int tahun, double biayaTahunan) {
        return saldo * 0.03 * tahun - biayaTahunan;
    }

    public static void main(String[] args) {
        RekeningBank rekeningTabungan = new RekeningBank(10000);
        RekeningBank rekeningGiro = new RekeningBank(20000);

        System.out.println("Bunga rekening tabungan: " + rekeningTabungan.hitungBunga(5));
        System.out.println("Bunga rekening giro: " + rekeningGiro.hitungBunga(5, 1000));
    }
}
