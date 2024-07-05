/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg8;

/**
 *
 * @author KAMAL
 */

class bengkel {
    void antrian(String nama){
        System.out.println("nama palanggan "+nama);
    }
    void antrian(String nama, int nomor){
        System.out.println("nama palanggan "+nama+" nomor antrian "+nomor);
    }
    void antrian(String nama, int nomor, String tipe){
        System.out.println("nama palanggan "+nama+" sejumlah "+nomor+" tipe motor "+tipe);
    }
     void antrian(String nama, int nomor, String tipe, String kendala){
        System.out.println("nama palanggan "+nama+" sejumlah "+nomor+" tipe motor "+tipe+" kerusakan "+kendala);
    }
}

public class ovl{
    public static void main(String[] args){
        System.out.println("bengkel motor pak yon");
        bengkel bs = new bengkel();
        bs.antrian("anton");
        bs.antrian("anton", 11);
        bs.antrian("anton", 11, "VIP");
        bs.antrian("anton", 11, "BEAT", "skok depan mati");
    }
}
