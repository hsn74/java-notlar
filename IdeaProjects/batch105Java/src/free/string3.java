package free;

public class string3 {
    public static void main(String[] args) {

        String str1 = "10000";
        String str2 = "22222";

        //Conversion using parseLong(String) method
        long num1 = Long.parseLong(str1);
        long num2 = Long.parseLong(str2);
        System.out.println(num1 * num2);
    }
}

