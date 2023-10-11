package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the serial number? ");
        int serialNumber = scanner.nextInt();

        System.out.print("What model is the phone? ");
        String model = scanner.next();

        System.out.print("Who is the carrier? ");
        String carrier = scanner.next();

        System.out.print("What is the phone number? ");
        String phoneNumber = scanner.next();

        System.out.print("Who is the owner of the phone?");
        String owner = scanner.next();

    CellPhone myCellPhone = new CellPhone(serialNumber, model, carrier, phoneNumber, owner);

        System.out.println(myCellPhone);

        myCellPhone.dial("704-308-0373");

        display(myCellPhone);

    }

    public static void display(CellPhone phone) {
        System.out.println(phone.getOwner() + "'s phone is calling " + phone.getPhoneNumber());
    }
}
