package free;

public class mainOl1 {
    public static void main(String[] args) {
        int sayi = 10;
        System.out.println(asalSayi(sayi));

    }

    public static String asalSayi(int sayi) {
        String sonuc = "";
        for (int i=2; i <= (sayi - 1); i++) {
        if (sayi %i== 0)
            sonuc = "asal degil";
        break;
    }
         if(!sonuc.equals("asal degil"));
        sonuc ="asal";
        return sonuc;
    }

}
