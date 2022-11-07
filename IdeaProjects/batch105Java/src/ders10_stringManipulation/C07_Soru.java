package ders10_stringManipulation;

public class C07_Soru {
    public static void main(String[] args) {
        /*
        Kullanicidan bie cumle ve metin al
        1 cumle metni icermiyor
        2 cunmle metni sadece 1 kere iceriyor
        3 cumle metni birden fazla iceriyor
         */
        String cumle="Java cok guzeldir cok";
        String metin="Java";
        if(! cumle.contains(metin)) {
            System.out.println("cumle metni icermiyor");
        }else{
            int ilkIndex=cumle.indexOf(metin);

            int ikinciIndex=cumle.indexOf(metin,ilkIndex+1);
            if (ikinciIndex==(-1)) {
                System.out.println("cumle metni sadece 1 kere iceriyor");
            }else{
                System.out.println("cumle metni birden fazla iceriyor");
            }
        }
    }
}
