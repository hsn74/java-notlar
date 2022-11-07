package ders20_multiDimemsionalArrays;

public class C06_MDA_Soru {
    public static void main(String[] args) {
        int[][] arr={{5,7}, {5, 8, 9},{0,1}};
        sonElementleriTopla(arr);

    }
    //Verilen 2 katli bir array’de her bir inner array’in son
        //elementlerinin toplaminini yazdiran bir method olusturun
    public static void sonElementleriTopla(int[][]arr){
        int toplam=0;
        for (int i = 0; i < arr.length ; i++) {
            toplam+=arr[i][arr[i].length-1];

        }
        System.out.println("eleman toplami:"+toplam);

    }

}
