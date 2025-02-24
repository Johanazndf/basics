import java.util.Scanner;
import java.util.Random;
public class diceroller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter the number of dice: ");
        int numofdice = sc.nextInt();
        int total = 0;
        if (numofdice > 0) {
            int roll = 0;
            for (int i = 0; i < numofdice; i++) {
                roll = random.nextInt(1, 7);
                printDie(roll);
                System.out.println("you rolled: " + roll);
                total = total + roll;
            }
            System.out.println("Your total is " + total);
        } else {
            System.out.println("The number of dice should be greater than 0 ");
        }

        sc.close();
    }
        static void printDie(int roll){
            String dice1 = """
                     -------
                    |       |
                    |   ●   |
                    |       |
                     -------
                    """;
            String dice2 = """
                     -------
                    | ●     |
                    |       |
                    |     ● |
                     -------
                    """;
            String dice3 = """
                     -------
                    | ●     |
                    |   ●   |
                    |      ●|
                     -------
                    """;

            String dice4 = """
                     -------
                    | ●    ●|
                    |       |
                    | ●    ●|
                     -------
                    """;
            String dice5 = """
                     -------
                    | ●    ●|
                    |   ●   |
                    | ●    ●|
                     -------
                    """;
            String dice6 = """
                     -------
                    | ●    ●|
                    | ●    ●|
                    | ●    ●|
                     -------
                    """;
            switch (roll) {
                case 1 -> System.out.print(dice1);
                case 2 -> System.out.print(dice2);
                case 3 -> System.out.print(dice3);
                case 4 -> System.out.print(dice4);
                case 5 -> System.out.print(dice5);
                case 6 -> System.out.print(dice6);
                default -> System.out.println("Invalid roll");
            }
        }
    }

