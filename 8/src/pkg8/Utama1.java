/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template ovr
 */
package pkg8;

/**
 *
 * @author KAMAL
 */
  class KartuUno {
    private String warna;
    private String tipe;
    private int nilai;

    
    public KartuUno(String warna, String tipe, int nilai) {
        this.warna = warna;
        this.tipe = tipe;
        this.nilai = nilai;
    }

    
    public KartuUno(String tipe, int nilai) {
        this.warna = "tidak ada";
        this.tipe = tipe;
        this.nilai = nilai;
    }

    
    public KartuUno tambah(KartuUno kartu) {
        if (this.tipe.equals(kartu.tipe) && this.warna.equals(kartu.warna)) {
            return new KartuUno(this.warna, this.tipe, this.nilai + kartu.nilai);
        } else {
            throw new IllegalArgumentException("Tidak bisa menambahkan KartuUno dengan warna atau tipe yang berbeda.");
        }
    }

    
    public int tambah(KartuUno kartu, int bonus) {
        if (this.tipe.equals(kartu.tipe) && this.warna.equals(kartu.warna)) {
            return this.nilai + kartu.nilai + bonus;
        } else {
            throw new IllegalArgumentException("Tidak bisa menambahkan KartuUno dengan warna atau tipe yang berbeda.");
        }
    }

    
    @Override
    public String toString() {
        return this.warna + " " + this.tipe + " " + this.nilai;
    }  
}

public class Utama1 {
    public static void main(String[] args) {
        KartuUno k1 = new KartuUno("merah", "angka", 3);
        KartuUno k2 = new KartuUno("merah", "angka", 4);
        KartuUno k3 = new KartuUno("merah", "angka", 9);

        System.out.println(k1.tambah(k2)); 
        System.out.println(k1.tambah(k3)); 
        System.out.println(k2.tambah(k3));
    }
}
