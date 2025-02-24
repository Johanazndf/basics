//import static java.lang.StringUTF16.charAt;

public class strings {
    public static void main(String[] args) {
        String name = " ";
        int length = name.length();
        char letter = name.charAt(0); charAt(0);
        int index = name.indexOf("a");
        int lastind = name.lastIndexOf("a");
        name = name.toUpperCase();
        System.out.println(name.isEmpty());
       System.out.println(name);
// substring() = A method used to extract a portion of a string
        //.substring(start , end)
        String email = "johanaz@gmail.com";
        String username = email.substring(0 ,7);
        String domain = email.substring(8,17);//or (7)
        System.out.println(username);
    }
}
