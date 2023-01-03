package free.free;

public class B {
    public static void main(String[] args) {
        String kelime = "hasan";
        sayilarToplami(kelime);

    }

    public static void sayilarToplami(String input){
        int toplam=0;
        for (int i = 0; i < input.length(); i++) {
            if(Character.isDigit(input.charAt(i)));
            toplam+=Integer.valueOf(input.charAt(i));
        }
        System.out.println(toplam);

        }


    }


