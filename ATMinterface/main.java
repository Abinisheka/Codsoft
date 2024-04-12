package ATMinterface;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        ATMOPinterface OP=new ATMoperation();
        int atmno=12345;
        int atmpin=510;
        Scanner sc=new Scanner(System.in);
        System.out.println("***  Welcome to ATM Machine  ***");
        System.out.print("Enter The ATM Number: ");
        int atmNo=sc.nextInt();
        System.out.print("Enter The Pin: ");
        int pin= sc.nextInt();

        if ((atmno==atmNo)&&(atmpin==pin)){
            System.out.println("Validation Done!! You may proceed..");
            while (true){
                System.out.println("1.Check Balance");
                System.out.println("2.Deposit Amount");
                System.out.println("3.Withdraw Amount");
                System.out.println("4.Mini Statement");
                System.out.println("5.Exit");
                System.out.println("Enter the choice: ");
                int choice= sc.nextInt();
                if(choice==1){
                    OP.balance();

                }
                else if (choice==2) {
                    System.out.println("Enter the amount to be Deposited: ");
                    double deposit= sc.nextDouble();
                    OP.deposit(deposit);

                }
                else if (choice==3) {
                    System.out.println("Enter the Withdrawal Amount:");
                    double withdraw=sc.nextDouble();
                    OP.withdraw(withdraw);

                }
                else if (choice==4) {
                    OP.ministatement();

                }
                else if (choice==5) {
                    System.out.println("Collect your ATM Card!!");
                    System.out.println("*** Thankyou for using the ATM Machine ***");
                    System.exit(0);
                }
                 else {
                    System.out.println("Please Enter The Correct Choice");
                }
                }

        }
        else {
            System.out.println("Incorrect Details TRY AGAIN!!");
            System.exit(0);
        }


    }
}
