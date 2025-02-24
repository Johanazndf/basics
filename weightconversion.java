import java.sql.SQLOutput;
import java.util.Scanner;
public class weightconversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight;
        double newWeight;
        int choice;
        System.out.println("Weight conversion program ");
        System.out.println("1. Convert lbs to kgs ");
        System.out.println("2. Convert kgs to lbs");
        System.out.println("Choose an option: ");
        choice = sc.nextInt();
       if(choice == 1)
       {
           System.out.println("Enter the weight in lbs: ");
           weight = sc.nextDouble();
           newWeight = weight * 0.453592;
          // System.out.println(newWeight);
           System.out.println("The new weight in kgs is: "+ newWeight);
       }
       else if(choice == 2)
       {
           System.out.println("Enter the weight in kgs: ");
           weight = sc.nextDouble();
           newWeight = weight * 2.20462;
           //System.out.println(newWeight);
           System.out.println("The new weight in lbs is: "+ newWeight);
       }
       else {
           System.out.println("Enter the valid choice! ");
       }
       sc.close();
    }
}
