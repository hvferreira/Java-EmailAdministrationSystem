package email;

import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter First Name:");
        String f_name = s.next();
        System.out.println("Enter Last Name:");
        String l_name = s.next();


        Email em1 = new Email(f_name, l_name);

        int choice = -1;
        do {
            System.out.println("\n**********\nENTER YOUR CHOICE\n1.Show Info\n2.Change Password"
                    + "\n3.Change Mailbox Capacity\n4.Set Alternate Email\n5.Exit");
            choice = s.nextInt();
            switch(choice) {
                case 1:
                    em1.getInfo();
                    break;
                case 2:
                    em1.set_password();
                    break;
                case 3:
                    em1.setMailCapacity();
                    break;
                case 4:
                    em1.setAlternativeEmail();
                    break;

                case 5:
                    System.out.println("\nTHANKS!!!");
                    break;
                default:
                    System.out.println("INVALID CHOICE! ENTER AGAIN!");
            }

        }while(choice!=5);

    }
}
