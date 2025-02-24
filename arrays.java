import java.util.Arrays;
import java.util.Scanner;
public class arrays {
    public static void main(String[] args) {
        /*array = a collection of values of the same data type
        String[] fruits = {"apple" , "mango"};
        int numoffruits =  fruits.length;
        System.out.println(numoffruits);
        for(int i = 0; i< fruits.length ; i++)
           System.out.println(fruits[0])
         Arrays.sort(fruits);
         Arrays.fill(fruits, "pineapple");
        for(String fruit : fruits)  // enhanced for loop or for each loop
        {
            System.out.println(fruit);
        }*/
        Scanner sc = new Scanner(System.in);
        String[] foods;
        int size;
        System.out.println("Enter the number of items: ");
        size = sc.nextInt();
        sc.nextLine();
        foods =  new String[size];
        for(int i = 0; i<foods.length;i++)
        {
            System.out.println("Enter a food: ");
            foods[i] = sc.nextLine();
        }
        System.out.println("The food items are: ");
        for(String food : foods)
        {
            System.out.println(food);
        }
        sc.close();
    }
}
