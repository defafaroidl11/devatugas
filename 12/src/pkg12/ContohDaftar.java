/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg12;

/**
 *
 * @author KAMAL
 */
import java.util.ArrayList;
import java.util.List;

public class ContohDaftar {

    public static void main(String[] args) {
        // Create two ArrayList objects
        List<String> warna = new ArrayList<>();
        List<String> warnaDihapus = new ArrayList<>();

        // Add colors to the "warna" list
        warna.add("MAGENTA");
        warna.add("RED");
        warna.add("WHITE");
        warna.add("BLUE");
        warna.add("CYAN");

        // Add colors to the "warnaDihapus" list
        warnaDihapus.add("RED");
        warnaDihapus.add("WHITE");
        warnaDihapus.add("BLUE");

        // Remove colors from the "warna" list that are present in the "warnaDihapus" list
        warna.removeAll(warnaDihapus);

        // Print the results
        System.out.println("Warna : ");
        System.out.println(warna);

        System.out.println("Warna yang dihapus : ");
        System.out.println(warnaDihapus);

        System.out.println("Output : ");
        System.out.println("Warna : ");
        System.out.println(warna);
    }
}