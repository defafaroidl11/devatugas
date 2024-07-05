/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template ovl
 */
package pkg8;

/**
 *
 * @author KAMAL
 */
public class Kalkulator {
    
    public int tambah(int a, int b) {
        return a + b;
    }

    public double tambah(double a, double b) {
        return a + b;
    }

    public int tambah(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();

        int jumlah1 = kalkulator.tambah(1, 2);
        System.out.println("Jumlah dari 1 dan 2: " + jumlah1);

        double jumlah2 = kalkulator.tambah(1.5, 2.3);
        System.out.println("Jumlah dari 1.5 dan 2.3: " + jumlah2);

        int jumlah3 = kalkulator.tambah(1, 2, 3);
        System.out.println("Jumlah dari 1, 2, dan 3: " + jumlah3);
    }
}
