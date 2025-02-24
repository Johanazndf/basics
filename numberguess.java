import java.util.Scanner;
import java.util.Random;
public class numberguess {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int guess;
        int attempts = 0;
        int randomno = random.nextInt(1,10);
       // System.out.println(randomno);
        System.out.println("enter the to be guessed between 1-10: ");
        do {
            System.out.println("Enter any number between given range");
            guess = sc.nextInt();
            attempts++;
            if(guess < randomno)
            {
                System.out.println("too low! Try again");
            }
            else if(guess > randomno)
            {
                System.out.println("too high! Try again");
            }
        }while(guess != randomno);
        System.out.println("You did it ! Bravo");
    }
}
