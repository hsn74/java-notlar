package free;

public class b12 {
    public static void main(String[] args) {
        int sayi=4;
        int us=2;
        ushesapla(sayi,us);
    }

    public static void ushesapla(int sayi,int us) {
        int sonuc = 1;
    while(us>0){
        sonuc*=sayi;
        us--;
    }
        System.out.println(sonuc);
    }
}
