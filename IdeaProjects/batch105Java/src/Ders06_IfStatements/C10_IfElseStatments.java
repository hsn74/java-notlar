package Ders06_IfStatements;

public class C10_IfElseStatments {
    public static void main(String[] args) {

    char cinsiyet='E';
    int yas=60;

    if(cinsiyet=='E' && yas>=65){
        System.out.println("emekli olabilirsin");
    }else if (cinsiyet =='E' && yas<65) {
            System.out.println("emekli olmak için"+ (65 - yas)+ "sene calismalisin");
    }else if (cinsiyet =='K' && yas>=60) {
        System.out.println("emekli olabilirsin");
    }else if (cinsiyet =='K' && yas<60) {
        System.out.println("emekli olmak için" +(60 - yas)+ "sene calismalisin");

        }
    }

}
