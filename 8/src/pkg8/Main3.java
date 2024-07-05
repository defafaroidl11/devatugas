/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template ovr
 */
package pkg8;

/**
 *
 * @author KAMAL
 */
 class Domino {
    private int sisi1;
    private int sisi2;

    
    public Domino(int sisi1, int sisi2) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
    }

   
    public Domino(int sisi) {
        this.sisi1 = sisi;
        this.sisi2 = sisi;
    }

   
    public Domino add(Domino domino) {
        return new Domino(this.sisi1 + domino.sisi1, this.sisi2 + domino.sisi2);
    }

    public Domino add(int side) {
        return new Domino(this.sisi1 + side, this.sisi2 + side);
    }

    
    public static Domino add(Domino domino1, Domino domino2) {
        return new Domino(domino1.sisi1 + domino2.sisi1, domino1.sisi2 + domino2.sisi2);
    }

    
    @Override
    public String toString() {
        return "[" + sisi1 + ", " + sisi2 + "]";
    }
}

public class Main3 {
    public static void main(String[] args) {
        Domino d1 = new Domino(2, 4);
        Domino d2 = new Domino(3, 5);
        Domino d3 = new Domino(3);
        Domino d4 = new Domino(2);

        System.out.println(d1.add(d2)); // [5, 9]
        System.out.println(d1.add(3)); // [5, 7]
        System.out.println(Domino.add(d1, d2)); // [5, 9]
        System.out.println(d3.add(d4)); // [6, 6]
    }
}