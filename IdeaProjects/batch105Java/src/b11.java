import java.util.Scanner;

public class b11 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("sayi gir");
        int sayi=scan.nextInt();
        for (int i = 0; i <sayi ; i++) {
            if(i%2==0) {
                System.out.println("2'ye bölünür");
            }else if(i%3==0 ){
                System.out.println("3'e bölünür");
            }else if(i%5==0){
                System.out.println("5'e bölünür");
            }else{
                System.out.println("bölünmez");
            }

        }
    }


}

