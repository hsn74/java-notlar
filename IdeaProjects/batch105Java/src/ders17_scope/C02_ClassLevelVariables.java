package ders17_scope;

public class C02_ClassLevelVariables {
    //class variableler metodlarin dışında olusturlur.
    //genel olarak üstte olur.
    static  String hastaneismi="Yildiz hastanesi";
    static int hastaSayisi=23453;
    static String basHekimIsmi;
    String persIsmi="isim girilmedi";
    String PersTelefonu="Telefon girilmedi";
    int persYasi;

    public static void main(String[] args) {
        System.out.println(hastaneismi);
        System.out.println(basHekimIsmi);
        System.out.println(hastaneismi);
        /*class level variableler adeger atamasi yapılmamış olursa java bu bu variablelere data
        turune göre default olarak tanımlanan degerleri atar :
        default degerler
        sayısal varıableler:0
         boolean : false
         char:" "
         objeler(string dahil):null
         */

    }

    public static void method1() {
        System.out.println(hastaSayisi);
        hastaSayisi++;

    }

    public void method2() {
        System.out.println(hastaneismi);
        hastaSayisi++;
        System.out.println(persIsmi);
        System.out.println(persYasi);



    }
}
