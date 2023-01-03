package free.free.artikYil;

public class switchCase {

      /*  public static void main(String args[]){
            int num=2;
            switch(num+2)
            {
                case 1:
                    System.out.println("Case1: Value is: "+num);
                case 2:
                    System.out.println("Case2: Value is: "+num);
                case 3:
                    System.out.println("Case3: Value is: "+num);
                default:
                    System.out.println("Default: Value is: "+num);
       */
      public static void main(String[] args) {
        int sayi=2;
        int sonuc=sayi;
        switch (sonuc=sayi+2){
            case 1:
                System.out.println("sonuc1:"+sayi);
            case 2:
                System.out.println("sonuc2:"+sayi);
            case 3:
                System.out.println("sonuc3:"+sayi);
            default:
                System.out.println("defaultsonuc3:"+sayi);
        }
    }
}
