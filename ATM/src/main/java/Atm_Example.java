import java.util.Scanner;
public class Atm_Example {

    //main method starts
    public static void main(String args[]) {
        //declare and initialize balance,wid,depo
        int balance = 100000, withdraw, deposit;

        //create scanner class object to get choice of user
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.println("Choose the operation you want");
            //get choice from user
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter money to be withdraw");
                    //get the withdraw money from user
                    withdraw = sc.nextInt();

                    //check whether the balance is greater than or equal
                    if (balance >= withdraw) {
                        //remove the withdraw amount from the total balance
                        //=====================aa=======================
                        if(withdraw >=15001){
                            System.out.println("{limit is 15000}");
                        }
                        else
                        {
                            balance = balance - withdraw;
                            System.out.println("{Please collect your money");
                        }

                    } else {
                        //show custom erroe message
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;
                case 2:
                    System.out.print("Enter money to be deposited");


                    //get deposit amount from to user
                    deposit = sc.nextInt();

                    //add the deposit amount to the total balance
                    balance = balance + deposit;
                    System.out.println("Your Money has been successfully deposited");
                    System.out.println("");
                    break;
                case 3:
                    //displaying the total balance of the user
                    System.out.println("Balance:" + balance);
                    System.out.println("");
                    break;
                case 4:
                    //exit from the menu
                    System.exit(0);
            }
        }
    }
}