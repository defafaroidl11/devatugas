/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg11;

/**
 *
 * @author KAMAL
 */
 interface Scanner{
    public void scanImage();
}

interface Copier{
    public void copyImage();
}

public class Printer implements Copier, Scanner{
    public void scanImage(){
        System.out.println("Scanning image...");
    }
    public void copyImage(){
        System.out.println("Copy image...");
    }
    public void printImage(){
        System.out.println("Print image...");
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.scanImage();
        printer.copyImage();
        printer.printImage();
    }
}