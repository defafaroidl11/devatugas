/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg9;

/**
 *
 * @author KAMAL
 */
 class Pegawai {
    private final String nama;
    private final int gaji;

    public Pegawai(String nama, int gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public int infoGaji() {
        return gaji;
    }
}

class Manajer extends Pegawai {
    private final int tunjangan;

    public Manajer(String nama, int gaji, int tunjangan) {
        super(nama, gaji);
        this.tunjangan = tunjangan;
    }

    public int infoTunjangan() {
        return tunjangan;
    }
}

class Programmer extends Pegawai {
    private final int bonus;

    public Programmer(String nama, int gaji, int bonus) {
        super(nama, gaji);
        this.bonus = bonus;
    }

    public int infoBonus() {
        return bonus;
    }
}

public class Bayaran {
    public int hitungBayaran(Pegawai peg) {
        int uang = peg.infoGaji();
        if (peg instanceof Manajer)
            uang += ((Manajer) peg).infoTunjangan();
        else if (peg instanceof Programmer)
            uang += ((Programmer) peg).infoBonus();
        return uang;
    }

    public static void main(String args[]) {
        Manajer man = new Manajer("Agus", 800, 50);
        Programmer prog = new Programmer("Budi", 600, 30);
        Bayaran hr = new Bayaran();
        System.out.println("Bayaran untuk Manajer : " +
                hr.hitungBayaran(man));
        System.out.println("Bayaran untuk Programmer : " +
                hr.hitungBayaran(prog));
    }
}