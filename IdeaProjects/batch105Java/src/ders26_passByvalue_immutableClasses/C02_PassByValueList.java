package ders26_passByvalue_immutableClasses;
import java.util.ArrayList;
import java.util.List;

public interface C02_PassByValueList {
    public static void main(String[] args) {
        List<Integer>sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        elementleri5artir(sayilar);
        System.out.println(sayilar);
    }
    public static void elementleri5artir(List<Integer>sayilar){
        for (int i = 0; i <sayilar.size() ; i++) {
            sayilar.set(i,sayilar.get(i)+5);
        }
        System.out.println(sayilar);
    }

}
    // bir method olusturalim ve method'da list'deki sayilari 5 artiralim
    // ve method'da listenin son halini yazdiralim



