package ders13_nestedForLoop;

public class C03_NestedForLoop {
    //1-4 arasindaki sayilar için carpim tablosu
    public static void main(String[] args) {
        // 1-4 arasindaki sayilar icin carpim tablosu olusturalim

        // dis dongu satirlari kontrol eder
        for (int i = 1; i <=5 ; i++) {

            for (int j =1; j <=5 ; j++) {


                System.out.print(i*j + " " );

            }
            // ic dongu bittiginde javayi alt satira indirmeliyiz
            System.out.println("");
        }
    }
}
