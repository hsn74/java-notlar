package free.karişik;

public class MetodCagirmaDegiskenSayidaParametre {
    public static void main(String[] args) {
        int[] sayilar1={2,3,4};
        int[] sayilar2={2,3,4,5};
        int[] sayilar3={2,3,4,5,8,11,20};
        System.out.println(carp(sayilar1));

    }
    public static int carp(int[]sayilar){

        int carpim=1;
        for (int i = 0; i <sayilar.length ; i++) {
            carpim*=sayilar[i];


        }
        return carpim;
    }
}
