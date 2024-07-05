/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg11;

/**
 *
 * @author KAMAL
 */
interface Camera {
    void captureImage();
}

interface CardReader {
    void readCard();
}

class Phone {
    private String phoneNumber;

    public Phone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void call() {
        System.out.println("Making a call...");
    }

    public void receiveCall() {
        System.out.println("Receiving a call...");
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

class SmartPhone extends Phone implements Camera, CardReader {
    private Lens lens;

    public SmartPhone(String phoneNumber, Lens lens) {
        super(phoneNumber);
        this.lens = lens;
    }

    @Override
    public void captureImage() {
        System.out.println("Capturing an image with " + lens.getType() + " lens...");
    }

    @Override
    public void readCard() {
        System.out.println("Reading a card...");
    }

    public Lens getLens() {
        return lens;
    }
}

class Lens {
    private String type;

    public Lens(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

public class Main {
    public static void main(String[] args) {
        Lens wideLens = new Lens("Wide Angle");
        SmartPhone myPhone = new SmartPhone("1234567890", wideLens);

        myPhone.call();
        myPhone.receiveCall();
        myPhone.captureImage();
        myPhone.readCard();
    }
}