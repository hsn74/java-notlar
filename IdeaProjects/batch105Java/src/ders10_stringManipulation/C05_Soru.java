package ders10_stringManipulation;

public class C05_Soru {
    public static void main(String[] args) {
        /*mail @ isareti icermiyorsa gecersiz email
        @gmail.com icermiyorsa gmail adresi gecersiz
        @gmail.com ile bitmiyorsa yazim hatasi

         */
        String email="ahmet@gmail.com";

        if (!email.contains("@)")) {
            System.out.println("gecersiz email");

        }else if(!email.contains(("@gmail.com"))){
            System.out.println("gmail adresi giriniz");

        }else if(!email.contains("@gmail.com")) {
            System.out.println("yazim hatasi");
        }else{
            System.out.println("email basari ile kaydedildi");
        }

    }
}
