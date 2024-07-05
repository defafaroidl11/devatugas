/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg10;

/**
 *
 * @author KAMAL
 */
 public abstract class Binatang {
   public void bernafas(){
   System.out.println("semua binatang bernafas");
}
  public void makan(){
   System.out.println("semua binatang makan");
}
 public void berkembangBiak (){
     System.out.println("burung berkembang biak dengan cara bertelur");
 }
}
  class Burung extends Binatang{
 public void makan(){

 super.makan();
 System.out.println("burung makan biji-bijian");
}
 public void berkembangBiak (){
 System.out.println("burung berkembang biak dengan cara bertelur");
}
}
  class Mamalia extends Binatang{
   public void berkembangBiak (){
    System.out.println("mamalia berkembang biak dengan cara melahirkan");
}
}

  class TestAnimal {
  public static void main(String args[]){
   Binatang lovebird = new Burung();
   Binatang cat = new Mamalia();
   Mamalia dolphin = new Mamalia();
   lovebird.bernafas();
   lovebird.makan();
   lovebird.berkembangBiak();
   cat.bernafas();
   cat.makan();
   cat.berkembangBiak();
   dolphin.berkembangBiak();
}
}

