package ders08_Ternary;

public class C05_NestedTernary {
    public static void main(String[] args) {

        int sayi=20;
        if(sayi>0) {
            System.out.println(sayi % 2 == 0 ? "cıft sayi" : "uc basamakli");
        }else{
            System.out.println(sayi<-99 && sayi>-1000?"uc basamakli":"uc basamakli degil");
        }
        String sonuc=sayi>0
                ?
                sayi%2==0?"cıft sayi":"cıft sayi degil"
                :sayi<-99 && sayi>-1000?"uc basamakli":"uc basamakli degil";
    }
}
