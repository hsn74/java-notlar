package free.odev;

public class honda extends car {
    honda(){
        super();
        System.out.println("honda calişti");
    }

    protected String make = "Her arabanın adi vardır";
    protected String model = "Her arabanın modeli avardır";
    protected int year = Integer.parseInt("her arabanin yılı vardır");
}
