package free;

public class compare {
            public static void main(String args[]){
                String s1="hello";
                String s2="hello";
                String s3="hemlo";
                String s4="flag";
                System.out.println(s1.compareTo(s3)); // 0 because both are equal
                System.out.println(s1.compareTo(s2)); //-1 because "l" is only one time lower than "m"
                System.out.println(s1.compareTo(s1)); // 2 because "h" is 2 times greater than "f"
                System.out.println(s1.compareTo(s3));
            }
    }

