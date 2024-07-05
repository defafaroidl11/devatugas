/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg10;

/**
 *
 * @author KAMAL
 */
public abstract class Weapon {
    protected int ammo;

    public abstract void attack();

    public int getAmmo() {
        return ammo;
    }
}

 class Knife extends Weapon {
    public Knife() {
        ammo = 0; // Knife has no ammo
    }

    @Override
    public void attack() {
        System.out.println("Menyayat dan menusuk musuh");
    }
}

 class Gun extends Weapon {
    public Gun(int ammo) {
        this.ammo = ammo;
    }

    @Override
    public void attack() {
        if (ammo > 0) {
            System.out.println("Menembakkan peluru");
            ammo--;
            System.out.println("Sisa peluru: " + ammo);
        } else {
            System.out.println("Peluru habis!");
        }
    }
}

 class TestAbstract {
    public static void main(String args[]) {
        Knife weapon = new Knife();
        Knife knife = new Knife();
        Gun gun = new Gun(10);
        knife.attack();
        gun.attack();
        gun.attack();
        Knife knife2 = new Knife();
        Gun gun2 = new Gun(10);
        knife2.attack();
        gun2.attack();
        gun2.attack();
    }
}              
