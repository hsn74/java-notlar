package free.odev;

public class o3 extends honda{
    public static void main(String[] args) {

            o3 o32=new o3();
            System.out.println(o32.make);
        System.out.println(o32.model);
        System.out.println(o32.year);
        }
    protected String make = "Honda";
    protected String model = "Accord";
    protected int year = 2012;
        o3(){
            super();
            System.out.println("hersey calişti");


    }

    private static void arabaYili() {
        System.out.println("araba yılı modele göre degişir");
    }

    private static void arabaModeli() {
        System.out.println("araba modeli yıla-modele göre değişir");
    }

    private static void arabaMarkasi() {
        System.out.println("araba markasi modele göre değişir");
    }
}

