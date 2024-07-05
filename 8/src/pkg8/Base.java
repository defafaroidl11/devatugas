/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg8;

/**
 *
 * @author KAMAL
 */
public class Base{
private void amethod(int iBase){
   System.out.println("Base.amethod");
}
}
class Over extends Base{
public static void main(String argv[]){
   Over o = new Over();
   int iBase=0;
   o.amethod(iBase);
}
public void amethod(int iOver){
   System.out.println("Over.amethod");
}
}