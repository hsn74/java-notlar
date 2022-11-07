package ders16_doWhileLoop;

import java.util.Scanner;

public class C03_SifreKontrolu {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore
    kontrol edin ve sifredeki hatalari yazdirin.
    Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli
    sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
    - Sifre kucuk harf icermelidir
    - Sifre buyuk harf icermelidir
    - Sifre ozel karakter icermelidir
    - Sifre en az 8 karakter olmalidir.*/

        Scanner scan = new Scanner(System.in);
        String sifre;
        int flag;
        boolean sifreDogruMu;

        do {
            System.out.println("sifre gir:");
            sifre=scan.nextLine();
            flag=0;
            int sonuc=kucukHarfKontroluYap(sifre);
            flag=flag+sonuc;
            sonuc=buyukHarfKontroluYap(sifre);
            flag=flag+sonuc;
            sonuc=ozelKarakterKontroluYap(sifre);
            flag=flag+sonuc;
            if(sifre.length()<8) {
                System.out.println("sifre en az 8 karakter olmalidir");
            }else {
                flag++;
            }
        }while (flag!=4);
        System.out.println("sifre basari ile kaydedildi");

        }
    public static int ozelKarakterKontroluYap(String sifre){;
    int flag=0;
    String ozelKarakterler="§±@!$%^&*()_-+=?/>.<,`~#";
             //sifre ozel karakter icermelidir
            // bunun icin tum harfleri kontrol edecek bir for loop olusturmaliyim
            // eger sifrenin karakterlerinden bir tanesini ozelKarakterler Stringi iceriyorsa
            // bizim icin yeterli olur
                for(int i=0; i< sifre.length(); i++){
                if(ozelKarakterler.contains(sifre.substring(i,i+1))){
                    flag++;
                    break;
            }
        }
        if (flag==0){
        System.out.println("Sifre ozel karakter icermelidir");
        return 0;
        }else return 1;
        }
   public static int buyukHarfKontroluYap(String sifre) {
        int flag=0;
                for (int i = 0; i <sifre.length() ; i++) {
                    if(sifre.charAt(i)>='A' && sifre.charAt(i)<='Z'){
                        flag++;
                        break;
                    }
                }
                    if(flag==0) {
                        System.out.println("sifre buyuk harf icermelidir");
                        return 0;
                    }else return 1;
                    }
            public static int kucukHarfKontroluYap(String sifre) {
                int flag=0;
                for (int i = 0; i <sifre.length() ; i++) {
                    if(sifre.charAt(i)>='a' && sifre.charAt(i)<='z'){
                        flag++;
                        break;
                    }
                }
                if(flag==0) {
                    System.out.println("sifre kucuk harf icermelidir");
                    return 0;
                }else return 1;

            }
                }