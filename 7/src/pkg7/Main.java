/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg7;

/**
 *
 * @author KAMAL
 */
 abstract class Vehicle {
    private final int numberOfWheels;
    private final String color;

    public Vehicle(int numberOfWheels, String color) {
        this.numberOfWheels = numberOfWheels;
        this.color = color;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public String getColor() {
        return color;
    }

    @Override
    public abstract String toString();
}

class Bicycle1 extends Vehicle {
    private final int numberOfSaddles;
    private final int numberOfGears;

    public Bicycle1(int numberOfWheels, String color, int numberOfSaddles, int numberOfGears) {
        super(numberOfWheels, color);
        this.numberOfSaddles = numberOfSaddles;
        this.numberOfGears = numberOfGears;
    }

    public int getNumberOfSaddles() {
        return numberOfSaddles;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    @Override
    public String toString() {
        return "Sepeda : jumlah roda " + getNumberOfWheels() + ", warna " + getColor() + ", jumlah sadle " + numberOfSaddles + ", Jumlah gear " + numberOfGears + " biji ";
    }
}

class Bicycle extends Vehicle {
    private final int numberOfSaddles;
    private final int numberOfGears;

    public Bicycle(int numberOfWheels, String color, int numberOfSaddles, int numberOfGears) {
        super(numberOfWheels, color);
        this.numberOfSaddles = numberOfSaddles;
        this.numberOfGears = numberOfGears;
    }

    public int getNumberOfSaddles() {
        return numberOfSaddles;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    @Override
    public String toString() {
        return "Sepeda : jumlah roda " + getNumberOfWheels() + ", warna " + getColor() + ", jumlah sadle " + numberOfSaddles + ", Jumlah gear " + numberOfGears + " biji ";
    }
}

class Truck extends Vehicle {
    private final int maxLoad;
    private final String fuelType;
    private final int engineCapacity;

    public Truck(int numberOfWheels, String color, String fuelType , int engineCapacity,int maxLoad) {
        super(numberOfWheels, color);
        this.maxLoad = maxLoad;
        this.fuelType = fuelType;
        this.engineCapacity = engineCapacity;
    }
    public String getFuelType() {
        return fuelType;
    }

    public int getMaxLoad() {
        return maxLoad;
    }
    
    public int getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public String toString() {
        return "Truck 1 : jumlah roda  " + getNumberOfWheels() + ", warna " + getColor() + ", jenis bahan bakar " + fuelType + ", kapasitas mesin " + engineCapacity + "CC, kapasitas maksimal " + maxLoad + " Kg ";
    }
}
class Truck1 extends Vehicle {
    private final int maxLoad;
    private final String fuelType;
    private final int engineCapacity;

    public Truck1(int numberOfWheels, String color, String fuelType , int engineCapacity,int maxLoad) {
        super(numberOfWheels, color);
        this.maxLoad = maxLoad;
        this.fuelType = fuelType;
        this.engineCapacity = engineCapacity;
    }
    public String getFuelType() {
        return fuelType;
    }

    public int getMaxLoad() {
        return maxLoad;
    }
    
    public int getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public String toString() {
        return "Truck 2 : jumlah roda  " + getNumberOfWheels() + ", warna " + getColor() + ", jenis bahan bakar " + fuelType + ", kapasitas mesin " + engineCapacity + "CC, kapasitas maksimal " + maxLoad + " Kg ";
    }
}

class Taxi extends Vehicle {
    private final int baseFare;
    private final int farePerKm;
    private final String fuelType;
    private final int engineCapacity;
    public Taxi(int numberOfWheels, String color, String fuelType ,int engineCapacity, int baseFare, int farePerKm) {
        super(numberOfWheels, color);
        this.baseFare = baseFare;
        this.farePerKm = farePerKm;
        this.fuelType = fuelType;
        this.engineCapacity = engineCapacity;
    }
    public String getFuelType() {
        return fuelType;
    }

    public int getBaseFare() {
        return baseFare;
    }

    public int getFarePerKm() {
        return farePerKm;
    }
    public int getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public String toString() {
        return "Taxi 1 : jumlah roda " + getNumberOfWheels() + ", warna " + getColor() + ", jenis bahan bakar " + fuelType + ", kapasitas mesin " + engineCapacity + "CC,  tarif awal " + baseFare + ", tarif per Km " + farePerKm;
    }
}
class Taxi1 extends Vehicle {
    private final int baseFare;
    private final int farePerKm;
    private final String fuelType;
    private final int engineCapacity;
    public Taxi1(int numberOfWheels, String color, String fuelType ,int engineCapacity, int baseFare, int farePerKm) {
        super(numberOfWheels, color);
        this.baseFare = baseFare;
        this.farePerKm = farePerKm;
        this.fuelType = fuelType;
        this.engineCapacity = engineCapacity;
    }
    public String getFuelType() {
        return fuelType;
    }

    public int getBaseFare() {
        return baseFare;
    }

    public int getFarePerKm() {
        return farePerKm;
    }
    public int getEngineCapacity(){
        return engineCapacity;
    }

    @Override
    public String toString() {
        return "Taxi 2 : jumlah roda " + getNumberOfWheels() + ", warna " + getColor() + ", jenis bahan bakar " + fuelType + ", kapasitas mesin " + engineCapacity + "CC,  tarif awal " + baseFare + ", tarif per Km " + farePerKm;
    }
}
public class Main {
    public static void main(String[] args) {
        
        Vehicle truck = new Truck(6, "Merah","solar",2000 ,1500);
        Vehicle truck1 = new Truck1(4, "Kuning","solar",1500 ,1000);
        Vehicle taxi = new Taxi(4, "orange","bensin",1500, 10000, 5000);
        Vehicle taxi1 = new Taxi1(4, "biru","bensin",1000, 7000, 3500);
        Vehicle bicycle = new Bicycle(3, "Hitam", 1, 2);
        Vehicle bicycle1 = new Bicycle1(2, "Putih", 2, 5);


       
        System.out.println(truck);
        System.out.println(truck1);
        System.out.println(taxi);
        System.out.println(taxi1);
        System.out.println(bicycle);
        System.out.println(bicycle1);
    }
}