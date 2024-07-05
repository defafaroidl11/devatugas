/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg9;

/**
 *
 * @author KAMAL
 */
class Base {
int i = 99;
Base(){
amethod();
}
public void amethod(){
System.out.println("Base.amethod()");
}
}
public class Derived extends Base{
int i = -1;
public static void main(String argv[]){
Base b = new Derived();
System.out.println(b.i);
b.amethod();
}
public void amethod(){
System.out.println("Derived.amethod()");
}
}
