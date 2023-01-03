package free.D;

public class A4 {
        public static void main(String[] args) {
            //outer loop
            for (int i = 1; i <=6 ; i++) {
                for (int j = 3; j <=i ; j++) {

                    System.out.print(" * ");
                }
                // this is to move the cursor to new line
                // to print the next row of the pattern
                System.out.println();
            }
        }
    }
