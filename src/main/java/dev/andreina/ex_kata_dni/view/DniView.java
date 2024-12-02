package dev.andreina.ex_kata_dni.view;

import java.util.Scanner;

public class DniView {
    private Scanner scanner= new Scanner(System.in);

    public String askFirstName() {
        System.out.println("Enter your first name");
        return scanner.nextLine();

    }

    public String askLastName() {
        System.out.println("Enter your last name");
        return scanner.nextLine();

    }

    public void Message(String message) {
        System.out.println(message);
    }

    public String dniNumber() {
        System.out.print("Enter your DNI Number: ");
        return scanner.nextLine();
    }

}
