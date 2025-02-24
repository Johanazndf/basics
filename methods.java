public class methods {
    public static void main(String[] args) {
        //method = a block of reusable code that is executed when called()
       //overload methods = methods that share the same name but different parameters
        System.out.println(add(1,2));
        System.out.println(add(1,2,66));
        System.out.println(breadpizza("puff bread"));
        System.out.println(breadpizza("Chicken cheesy "+"and " + "zero sugar Coke"));
    }
    static double add(double a, double b)
    {
        return a+b;
    }
    static double add(double a, double b, double c)
    {
        return a+b+c;
    }
    static String breadpizza(String bread)
    {
        return bread;
    }
    static String breadpizza(String flavour,String drink)
    {
        return flavour;
    }
}

