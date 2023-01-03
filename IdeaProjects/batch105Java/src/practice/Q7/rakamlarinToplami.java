package practice.Q7;

public class rakamlarinToplami {
    public static void main(String[] args) {
        /*rakamlarin toplami
         */
        String kelime="ade1r4d3d";
        rakamlarinToplami(kelime);

    }
    public static void rakamlarinToplami(String input){
        int toplam=0;
        for (int i = 0; i <input.length() ; i++) {
            if(Character.isDigit(input.charAt(i))){
                toplam+=Integer.valueOf(""+input.charAt(i));
            }
        }
        System.out.println("rakamlarin toplami:"+toplam);
    }
}
