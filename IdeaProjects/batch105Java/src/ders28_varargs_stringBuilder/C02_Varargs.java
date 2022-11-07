package ders28_varargs_stringBuilder;

public class C02_Varargs {
    public static void main(String[] args) {
        topla(5, 6);
        topla(5, 3, 8);
        topla(2, 4, 6, 8);
        /*bir methodda parametre sayisini sinirlandirmak istemezsek
        standart bir variable yerine varargs kullanilir.
        varargs data türünün yanina ... kullanilarak deklare edilir.
        int ...==> sayisi belirli olmayan int parametreler alan bir array dir.

         */
    }
    private static void topla(int ... sayilar){
        int toplamSonucu=0;
        for (int each:sayilar
             ) {
            toplamSonucu+=each;
        }
        System.out.println("girilen sayilarin toplam sonucu:"+toplamSonucu);

    }
}
