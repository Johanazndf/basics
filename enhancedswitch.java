import java.util.Scanner;
public class enhancedswitch {
    public static void main(String[] args) {
        //enhanced switches = A replacement to many else if statements
        Scanner sc = new Scanner(System.in);
        double n1,n2,result = 0;
        char choice;
        System.out.println("Enter the first number: ");
        n1 = sc.nextDouble();
        System.out.println("Enter the second number: ");
        n2 = sc.nextDouble();
        System.out.println("Enter the choice: ");
        choice = sc.next().charAt(0);
        switch (choice)
        {
            case '1' -> result = n1+n2;
            case '2' -> result = n1-n2;
            case '3' -> result = n1*n2;
            case '4' -> result = n1/n2;
            case '5' -> result = n1%n2;
        }
        System.out.println(result);
    }
}
