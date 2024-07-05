/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg12;

/**
 *
 * @author KAMAL
 */
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

class Mahasiswa implements Comparable<Mahasiswa> {
    private String nrp;
    private String nama;
    private float nilai;

    public Mahasiswa(String nrp, String nama, float nilai) {
        this.nrp = nrp;
        this.nama = nama;
        this.nilai = nilai;
    }

    public String getNrp() {
        return nrp;
    }

    public String getNama() {
        return nama;
    }

    public float getNilai() {
        return nilai;
    }

    @Override
    public int compareTo(Mahasiswa other) {
        return Float.compare(other.nilai, this.nilai); // descending order
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nrp='" + nrp + '\'' +
                ", nama='" + nama + '\'' +
                ", nilai=" + nilai +
                '}';
    }
}

public class runMhs{
    public static void main(String[] args) {
        Random random = new Random();
        Queue<Mahasiswa> queue = new PriorityQueue<>();

        for (int i = 0; i < 10; i++) {
            String nrp = "NRP-" + (i + 1);
            String nama = "Mahasiswa " + (i + 1);
            float nilai = random.nextFloat() * 40 + 60; // random nilai between 60-100
            Mahasiswa mahasiswa = new Mahasiswa(nrp, nama, nilai);
            queue.add(mahasiswa);
        }

        System.out.println("Data Mahasiswa sebelum diurutkan:");
        for (Mahasiswa mahasiswa : queue) {
            System.out.println(mahasiswa);
        }

        System.out.println("\nData Mahasiswa setelah diurutkan berdasarkan nilai:");
        while (!queue.isEmpty()) {
            Mahasiswa mahasiswa = queue.poll();
            System.out.println(mahasiswa);
        }
    }
}