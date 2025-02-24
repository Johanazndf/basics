import java.util.Scanner;
public class tempconversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float temp;
        String unit;
        System.out.println("Enter the unit: ");
        unit = sc.nextLine();
        System.out.println("Enter the temperature: ");
        temp = sc.nextFloat();
        float conversion = (unit.equals("C"))? (temp * 9/5)+32 : (temp - 32)*5/9;
        System.out.println("The converted temperature is: " +conversion);
        sc.close();
    }
}
