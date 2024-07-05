/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg8;

/**
 *
 * @author KAMAL
 */
 class Orang {
    private String nama;
    private int umur;

    public Orang(String nama) {
        this.nama = nama;
    }

    public Orang(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void Info() {
        System.out.println("Nama: " + nama);
        if (umur != 0) {
            System.out.println("Umur: " + umur);
        }
    }
}

 class Dosen extends Orang {
    private int nip;

    public Dosen(String nama) {
        super(nama);
    }

    public Dosen(String nama, int nip) {
        super(nama);
        this.nip = nip;
    }

    public Dosen(String nama, int nip, int umur) {
        super(nama, umur);
        this.nip = nip;
    }

    @Override
    public void Info() {
        super.Info();
        System.out.println("NIP: " + nip);
    }
}

public class TesLatihan {
    public static void main(String args[]) {
        System.out.println("Memasukkan identitas dosen 1 : Agus");
        Dosen dosen1 = new Dosen("Agus");
        System.out.println("Memasukkan identitas dosen 2 : Budi, NIP. 1458");
        Dosen dosen2 = new Dosen("Budi", 1458);
        System.out.println("Memasukkan identitas dosen 3 : Iwan, NIP. 1215, umur 47");
        Dosen dosen3 = new Dosen("Iwan", 1215, 47);
        System.out.println();
        dosen1.Info();
        System.out.println();
        dosen2.Info();
        System.out.println();
        dosen3.Info();
    }
}