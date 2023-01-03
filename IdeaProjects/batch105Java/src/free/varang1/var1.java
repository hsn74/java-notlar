package free.varang1;

public class var1 {
    public static void main(String[] args) {
        topla(2,3,5);

    }
    public static void topla(int...sayilar){
        int toplamSonucu=0;
        for (int each:sayilar
             ) {
            toplamSonucu+=+each;

        }
        System.out.println(toplamSonucu);
    }
}
