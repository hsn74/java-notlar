package ders17_scope;

public class C03_0bjectVariables {
    static  String hastaneismi="Yildiz hastanesi";
    static int hastaSayisi=23453;
    static String basHekimIsmi;
    String persIsmi="isim girilmedi";
    String PersTelefonu="Telefon girilmedi";
    int persYasi;

    /* class level variable'larin scope u tum class dir.
    static kaliemsi ile variablelere
    class icerisinde her yerden ulasabildiği için diger adi class variable denir.

    static kelimesi ile isaretlenmeyen variable ise instance variable denir.
    instance variableler objelere bagli olduklarından bu variable ler
    diger variablelerin diger adi object variable dir. */
    public  static void main(String[] args){
}
}
