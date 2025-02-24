import java.util.Scanner;

public class searcharray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] fruits;
        int size;
        String target;
        boolean isFound = false;
        System.out.println("Enter the number of fruits: ");
        size = sc.nextInt();
        sc.nextLine();
        fruits = new String[size];
        System.out.println("enter the fruits: ");
        for(int i = 0; i< fruits.length; i++)
        {
            fruits[i] = sc.nextLine();
        }
        System.out.println("The fruits are: ");
        for(String fruit : fruits)
        {
            System.out.println(fruit);
        }
        System.out.println("Enter the fruit to be searched: ");
        target = sc.nextLine();
        for(int i = 0; i<fruits.length; i++)
        {
            if(fruits[i].equals(target))
            {
                System.out.println("Fruit found at the index " + i);
                isFound = true;
                break;
            }
        }
        if(!isFound)
        {
            System.out.println("Fruit not found");
        }
    }
}
