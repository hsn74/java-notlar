package ders20_multiDimemsionalArrays;

public class C05_MDA_SayilarCarpimi {
    public static void main(String[] args) {
        //Verilen 2 katli bir array’de bulunan tum sayilarin carpinini bize donduren bir method olusturun.

        int[][] arr={{5,7}, {5, 8, 9},{0,1}};
        System.out.println(elementleriCarp(arr));

            }
            public static int elementleriCarp(int[][]arr){
                int carpim=1;
                for (int i = 0; i <arr.length ; i++) {
                    for (int j = 0; j <arr[i].length ; j++) {
                        carpim*=arr[i][j];


                    }

    }
                return carpim;
}}
