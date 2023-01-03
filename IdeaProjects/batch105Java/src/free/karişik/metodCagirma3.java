package free.karişik;

public class metodCagirma3 {
    public static void main(String[] args) {
        System.out.println(carp(4,8,12));
        //burada neyi istersen cagir

    }
    public static int carp(int...sayilar){
        //kurallari buraya yaz yukariya istenilen nitelikleri yaz
        int carpim=1;
        for (int sayi:sayilar) {
            carpim=carpim*sayi;

        }
        return  carpim;
    }

}
