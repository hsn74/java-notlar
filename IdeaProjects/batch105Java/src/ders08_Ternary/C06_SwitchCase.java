package ders08_Ternary;

public class C06_SwitchCase {
    public static void main(String[] args) {

        int gunNo=5;
        if(gunNo==1) {
            System.out.println("pazartesi");
        }else if(gunNo==2){
            System.out.println("sali");
        }else if(gunNo==3){
            System.out.println("carsamba");
        }else if(gunNo==4){
            System.out.println("persembe");
        }else if(gunNo==5){
            System.out.println("cuma");
        }else if(gunNo==6){
            System.out.println("cumartesi");
        }else if(gunNo==7) {
            System.out.println("pazar");
        }else {
            System.out.println("gecersiz gün");
        }
        switch (gunNo=9){
            case 1:
            System.out.println("pazartesi");
            case 2:
                System.out.println("sali");
            case 3:
                System.out.println("carsamba");
            case 4:
                System.out.println("persembe");
            case 5:
                System.out.println("cuma");
            case 6:
                System.out.println("cumartesi");
            case 7:
                System.out.println("pazar");


        }
    }
}
