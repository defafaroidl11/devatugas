/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg7;

/**
 *
 * @author KAMAL
 */
 class Base{
  Base(int i){
    System.out.println("base constructor");
  }
  Base(){
    this(42); 
  }
}

public class Sup extends Base{
  public Sup(){
    super(42); //
  }

  public static void main(String[] args){
    Sup s = new Sup();
  }

  public void derived(){
    //...
  }
}