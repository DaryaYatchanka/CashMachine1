import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int balance = 1000, withdraw, deposit;
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Cash Machine welcomes you");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check balance");
            System.out.println("Choose 4 for Exit");
            System.out.println("Choose the operation you would like to perform");

            int n = sc.nextInt();
            switch(n){

                case 1:
                    System.out.print("Enter amount to be withdrawn");
                    withdraw = sc.nextInt();
                    if(balance >= withdraw){
                        balance=balance-withdraw;
                        System.out.println("Please, collect your money");
                    }else{
                        System.out.println("You have not enough money on your balance");
                    }
                    System.out.println("");
                    break;

                case 2:
                    System.out.print("Enter amount to be deposited");
                    deposit = sc.nextInt();
                    balance = balance + deposit;
                    System.out.println("Your new balance is: "+ balance);
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Your current balance is: "+ balance);
                    System.out.println("");
                    break;

                case 4:
                    System.exit(0);


            }

        }
    }

}