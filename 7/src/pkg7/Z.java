/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg7;

/**
 *
 * @author KAMAL
 */
class X{
 Y b = new Y();
     X(){
    System.out.print("X");
}
}

public class Z extends X{
 Y y = new Y();
    Z(){
    System.out.print("Z");
}
public static void main(String[] args){
  new Z();
}
}
class Y{
 Y(){
    System.out.print("Y");
}
}
