package free;

public class b11 {
    /*nufus sorusuna hep beraber bakabilirsiniz
■ Her 7 saniyede bir doğum
■ Her 13 saniyede bir ölüm
■ Her 45 saniyede yeni bir göçmen gelmektedir

Gelecek beş yıl için, her bir yılın nüfus tahminlerini gösterecek bir program yazınız.//
 Şu an nüfusun 312,032,486 olduğunu ve bir yılın 365 gün olduğunu varsayalım.//


İpucu: Java’da, iki tam sayının bölümü, yine bir tamsayıdır. Ondalık kısım atılır.//
// Örneğin; 5 / 4 işleminin sonucu 1,25 yerine 1 olarak; 10 / 4 işleminin sonucu da 2,5 yerine 2 olarak ifade edilir.Eğer noktadan sonraki kısım kaybedilmek istenmiyorsa sayılardan birinin noktalı olması gerekir. Örneğin; 5.0 / 4 işleminin sonucu 1,25 ve 10 / 4.0 işleminin sonucu da 2,5’tir.
8:58
once hepimiz defterimizde algoritma kuralim
}
*/
    public static void main(String[] args) {
        double nufus=312032486-(24*60*60*7-24*60*60*13+24*60*60*24);
        System.out.println(5*nufus);

    }
}