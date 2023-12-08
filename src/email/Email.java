package email;

import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Email {

    private String firstName;
    private String lastName;
    private String department;
    private String email;
    private String password;
    private String alternativeEmail;
    private int mailCapacity=500;


    Scanner sc = new Scanner(System.in);

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("New Employee:"+this.firstName+""+this.lastName);

        this.department = this.setDepartment();
        this.password = this.generate_password(8);
        this.email = this.generate_email();
    }
    private String generate_email() {
        return this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.department.toLowerCase()
                + ".company.com";
    }

    private String setDepartment() {
        System.out.println(
                "DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None");
        boolean bool = false;
        do {
            System.out.print("Enter Department Code: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    return "Sales";
                case 2:
                    return "Development";
                case 3:
                    return "Accounting";
                case 0:
                    return "None";
                default:
                    System.out.println("**INVALID CHOICE**");
            }
        } while (!bool);
        return null;
    }

    private String generate_password(int length) {
        Random r = new Random();

        String capitalChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallChars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%&?";
        String values = capitalChar + smallChars + numbers + symbols;

        String password = "";
        for (int i = 0; i < length; i++) {
            password = password + values.charAt(r.nextInt(values.length()));
        }
        return password;
    }

    public void set_password() {
        boolean bool = false;
        do {
            System.out.print("ARE YOU SURE YOU WANT TO CHANGE YOUR PASSWORD? (Y/N) : ");
            char choice = sc.next().charAt(0);
            if (choice == 'Y' || choice == 'y') {
                bool = true;
                System.out.print("Enter current password: ");
                String temp = sc.next();
                if (temp.equals(this.password)) {
                    System.out.println("Enter new password: ");
                    this.password = s.next();
                    System.out.println("PASSWORD CHANGED SUCCESSFULLY!");
                } else {
                    System.out.println("Incorrect Password!");
                }
            } else if (choice == 'N' || choice == 'n') {
                bool = true;
                System.out.println("PASSWORD CHANGE CANCELED!");
            } else {
                System.out.println("**ENTER A VALID CHOICE**");
            }
        } while (!bool);
    }


    public void setMailCapacity(int mailCapacity) {
        System.out.println("Current capacity = " + this.mailCapacity + "mb");
        System.out.print("Enter new capacity: ");
        this.mailCapacity = sc.nextInt();
        System.out.println("MAILBOX CAPACITY CHANGED SUCCESSFULLY!");
    }

    public void setAlternativeEmail(String alternativeEmail) {
        System.out.print("Enter new alternate email: ");
        this.alternativeEmail = sc.next();
        System.out.println("ALTERNATE EMAIL SET SUCCESSFULLY!");

    }

    public void getInfo() {
        System.out.println("NAME: " + this.firstName + " " + this.lastName);
        System.out.println("DEPARTMENT: " + this.department);
        System.out.println("EMAIL: " + this.email);
        System.out.println("PASSWORD: " + this.password);
        System.out.println("MAILBOX CAPACITY: " + this.mailCapacity + "mb");
        System.out.println("ALTER EMAIL: " + this.alternativeEmail);
    }



}
