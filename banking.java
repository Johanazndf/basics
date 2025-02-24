
import java.util.Scanner;

public class banking {
     static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double balance = 0;
        boolean isRunning = true;
        int choice;
        while(isRunning)
        {
            System.out.println("The Banking Program ");
            System.out.println("Welcome!! ");
            System.out.println("1. Show balannce ");
            System.out.println("2. Deposit ");
            System.out.println("3. Withdraw ");
            System.out.println("4. Exit ");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1-> showbalance(balance);
                case 2-> balance= balance + deposit();
                case 3-> balance= balance - withdraw(balance);
                case 4-> isRunning = false;
                default -> System.out.println("invalid choice❌");
            }
        }
        System.out.println("Thank you for using our banking system! ");
    }
    static double showbalance(double balance)
    {
        System.out.printf("%.2frupees\n",balance);
        System.out.println();
        return balance;
    }
    static double deposit()
    {
        double amount;
        System.out.println("Enter an amount to be deposited: ");
    amount = sc.nextDouble();
        if(amount < 0)
        {
            System.out.println("The amount cannot be negative");
            return 0;
        }
        else
        {
            return amount;
        }
    }
    static double withdraw(double balance)
    {
        double amount;
        System.out.println("Enter the amount to be withdrawn: ");
        amount = sc.nextDouble();
        if(amount > balance)
        {
            System.out.println("Not sufficient amount! ");
            return 0;
        }
        else if(amount < 0)
        {
            System.out.println("The amount cannot be negative! ");
            return 0;
        }
        else
        {
            return amount;
        }
    }
    }


