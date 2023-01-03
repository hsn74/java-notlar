package free.inherit;

import ders31_inheritance.GCorolla;

public class Stest extends SDagBisikleti{
    public static void main(String[] args) {
        Stest Stest1=new Stest();
        System.out.println(Stest1.agirlik);
    }
    String model= "Corolla";
    String uretimYeri="Turkiye";
        Stest(){
            super();
            System.out.println("hersey calişti");
        }


}

