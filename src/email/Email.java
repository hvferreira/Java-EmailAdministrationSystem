package email;

import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Email {

    private String firstName;
    private String lastName;
    private String dept;
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

}
