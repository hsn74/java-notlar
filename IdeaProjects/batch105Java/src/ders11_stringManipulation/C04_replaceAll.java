package ders11_stringManipulation;

public class C04_replaceAll {
    public static void main(String[] args) {
        //kullacidanin girdigi tüm metinde harf dısında kalan tum karakterleri+
        //temizleyen bir kod yazin
        //space silinmesin
        String input= "Ja5+va cok 1*guzel";
        input=input.replaceAll("\\d","");
        input=input.replace("","5");
        input=input.replace("5"," ");
        input=input.replaceAll("\\s"," ");
        System.out.println(input);
    }
}
