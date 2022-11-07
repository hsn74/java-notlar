package free;

import java.util.Scanner;

public class b6_sifre {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("sifre gir");

        boolean sifreGecerliMİ=false;
        String sifre="";
        int flag=0;
        while (sifreGecerliMİ!=true){
            flag++;
            sifre=scan.nextLine();

            if(sifre.charAt(0)>='A'&& sifre.charAt(0)<='Z'){
                System.out.println("sifrenin ilk harfi buyuk");
            }
            flag++;
            if(sifre.charAt(sifre.length()-1)>='0'&& sifre.charAt(sifre.length()-1)<='9'){
                System.out.println("sifre son karakter sayi olmali");
                flag++;
            }
            if(sifre.length()<8){
                System.out.println("sifre en az 8 karakter olmali");
            }
            if(flag==0){
                sifreGecerliMİ=true;
                System.out.println("sifre basarili");
            }
        }
    }
}

