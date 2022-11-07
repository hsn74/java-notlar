package ders11_stringManipulation;

public class C08_Soru {
    public static void main(String[] args) {
        //kullanicidan bir sifre al
        //sartlari kontrol et
        //eksikleri soyle duzelt
        //hersey dogru ise sifre basariyla kabul edildi
        //ilk harf kucuk harf olacak
        //son karakter rakam olacak
        //sifre bosluk yok
        //en az 10 karakter olmali
        String sifre="Nasilsin Kardes";
        int bayrak=0;
        if(!(sifre.charAt(0)>='a' && sifre.charAt(0)<='z')){
            System.out.println("ilk harf kucuk olmali");
            bayrak++;
        }
        if (!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9')){
            System.out.println("son karakter rakam olmali");
            bayrak++;

        }
        if(sifre.contains(" ")){
            System.out.println("sifre bosluk icermemeli");
            bayrak++;

        }
        if(sifre.length()>=10){
            System.out.println("sifre en az 10  haneli olmali");
            bayrak++;
        }
        System.out.println(bayrak);

    }
}
