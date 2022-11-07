package ders10_stringManipulation;

public class C09_Soru {
    public static void main(String[] args) {
         /*
        Kullanicidan bie cumle ve metin al
        1 cumle metni icermiyor
        2 cunmle metni sadece 1 kere iceriyor
        3 cumle metni birden fazla iceriyor
         */
        String cumle="Java cok guzeldir cok";
        String metin="cok";

        int ilkIndex=cumle.indexOf(metin);
        int sonIndex=cumle.lastIndexOf(metin);
        if (ilkIndex==-1) {
            System.out.println("metin icermiyor");
        }else if(ilkIndex==sonIndex) {
            System.out.println("cumle metni 1 kere iceriyor");
        }else{
            System.out.println("cumle birden fazla var");
        }

    }
}
