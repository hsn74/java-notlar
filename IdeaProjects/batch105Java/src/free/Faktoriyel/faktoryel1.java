package free.Faktoriyel;

public class faktoryel1 {
    public static void main(String[] args) {
        // Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        //hesaplayin.
        int sayi=4;
        int faktoryel=1;

        for (int i = sayi; i>1; i--) {
            faktoryel=faktoryel*i;
        }
        System.out.println(faktoryel);

}
}

