package email;

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
}
