public class variablescope {
    public static void main(String[] args) {
        //local scope = variables declared inside the class
        int x = 12; //local variable
       // System.out.println(x);
        random();
    }
    static void random()
    {
        int x = 13;
        System.out.println(x);
    }
}
