package ders32_inheritanceConstructorCall;

public class BToyota extends Araba{
    BToyota(){
        System.out.println("parametresiz toyota constructor");
    }
    BToyota(int pt){
        System.out.println("parametreli Araba constructor");
    }
    BToyota(String pt2){
        super("mehmet");
        System.out.println("String parametreli toyota ");

    }
}
