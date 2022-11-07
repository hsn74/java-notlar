package ders11_stringManipulation;

public class C06_Soru {
    public static void main(String[] args) {
        //kullanicidan bir cumle alin
        //ev gecerse home home sweet home yazdir
        //is gecerse calısmak guzeldir
        //ikisi de gecerse Hem ev almak lazim hem is
        //hic biri yoksa cok calısman lazim
        String cumle="Eve geldim,merdiven curumus";
        String cumleCopy=cumle.toLowerCase();

        if(cumleCopy.contains("ev")&&cumleCopy.contains("is")) {
            System.out.println("hem ev lazim hem is");
        }else if(cumleCopy.contains("ev")){
            System.out.println("home home sweet home");

        }else if(cumleCopy.contains("is")){
            System.out.println("calısmak guzeldir");


        }else{
            System.out.println("cok calısmak lazim");

        }
    }
}
