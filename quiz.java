import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        String[] questions = {"What is the main function of a router? ",
                "Which part of the computer is considered brain?",
                "What year was facebook launched?",
                "Who is known as the father of computer?"};
        String[][] options = {{"1.Storing files", "2.Encrypting data", "3.Directing internet traffic", "4.Managing passwords"},
                {"1.CPU", "2.Monitor", "3.Microcontroller", "4.Mouse"},
                {"1.2000", "2.2004", "3.2006", "4.2008"},
                {"1.Steve Jobs", "2.Johannes", "3.Bill Gates", "4.Charles Babage"}};
        int[] answers = {3, 1, 2, 4};
        int score = 0;
        int guess;
        Scanner sc = new Scanner(System.in);
        System.out.println("****** Welcome to the Quiz ******");
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.println("Enter your guess: ");
            guess = sc.nextInt();
            if(guess == answers[i])
            {
                System.out.println("CORRECT ✅");
                score++;
            }
            else
            {
                System.out.println("WRONG ❌");
            }
        }
        System.out.println("Your total score " + "out of 4 is " + score);
        System.out.println("Thank you for playing quiz");
        sc.close();
    }
}