import java.util.Random;
import java.util.Scanner;

public class rockpapsci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();
        String[] choices = {"Rock", "Paper", "Scissors"};
        String playerChoice;
        String compChoice;
        String playAgain = "yes";
        do {
            System.out.println("Enter your move(Rock, Paper, Scissor)");
            playerChoice = sc.nextLine();
            if (!playerChoice.equals("Rock") && !playerChoice.equals("Paper") && !playerChoice.equals("Scissors")) {
                System.out.println("Invalid choice");
                continue;
            }
            compChoice = choices[ra.nextInt(3)];
            System.out.println("Computer Choice: " + compChoice);
            if (playerChoice.equals(compChoice)) {
                System.out.println("It's a tie!!");
            } else if ((playerChoice.equals("Rock") && compChoice.equals("Scissors")) || (playerChoice.equals("Paper") && compChoice.equals("Rock")) || (playerChoice.equals("Scissors") && compChoice.equals("Paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose");
            }
            System.out.println("Play Again(yes/no)");
            playAgain = sc.nextLine();
        } while(playAgain.equals("yes"));
        System.out.println("Thanks for playing!!");
        sc.close();
    }
}
