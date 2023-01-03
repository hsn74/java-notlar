package free.B;

public class b4 {
    public static void main(String[] args) {
        int input=8;
        int baslangic=1;
        int flag=0;
        do{
            if(baslangic*baslangic<=input){
                System.out.println("true");
            }
            baslangic++;
            }while (baslangic*baslangic<=input);
        if(flag==0){
            System.out.println("false");

        }
   }
    }
