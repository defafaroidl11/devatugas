/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg8;

/**
 *
 * @author KAMAL
 */
 class RerataNilai {
    public double average(double... angka) {
        double hitung = 0;
        for (double Angka : angka) {
            hitung += Angka;
        }
        return hitung / angka.length;
    }
}
      public class TesTugas1{
public static void main(String args[]){
  RerataNilai rn = new RerataNilai();
   System.out.println("Rerata nilai 21 dan 13 adalah : " + rn.average(21, 13));
   System.out.println("Rerata nilai 19.3 dan 39.5 adalah : " + rn.average(19.3, 39.5));
   System.out.println("Rerata nilai 123, 567 dan 744 adalah : " + rn.average(123, 567, 744));
}
}
