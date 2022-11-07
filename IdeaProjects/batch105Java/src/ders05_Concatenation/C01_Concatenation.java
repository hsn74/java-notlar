package ders05_Concatenation;

public class C01_Concatenation {
    public static void main(String[] args) { //sadece verilen variableri kullanarak değerleri yazır.
        String s1 = "Java";
        String s2 = "Guzeldir";
        String s3 = "";
        String s4 = " ";

        int sayi1 = 4;
        int sayi2 = 3;
        System.out.println(sayi1+sayi2+s1+s4+s2);
        System.out.println(s1+s3+s2+(sayi1+sayi2));
        System.out.println(s1+(sayi1+sayi2)+s4+s2+sayi1+sayi2);

    }
  }
