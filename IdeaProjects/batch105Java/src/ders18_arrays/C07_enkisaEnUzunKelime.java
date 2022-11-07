package ders18_arrays;

public class C07_enkisaEnUzunKelime {
    public static void main(String[] args) {
    //Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method olusturun.
    String[]arr={"hasan","adem","Senturk","omer faruk"};

}
public static void enUzunKisaIsimleriYazdir(String[]arr){
        String enuzunKelime=arr[0];
        String enKisaKelime=arr[0];
    for (int i = 1; i < arr.length ; i++) {
        if(arr[i].length()>=enuzunKelime.length()) {
            enuzunKelime = arr[i];
        }
        if (arr[i].length()<=enKisaKelime.length()){
            enKisaKelime=arr[i];
        }
    }
    System.out.println("en uzun kelime:"+enuzunKelime);
    System.out.println("en kisa kelime:"+enKisaKelime);
    }
}
