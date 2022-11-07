package ders17_scope;

public class C04_ObjectVariables {
      public static void main(String[] args) {
      System.out.println(C03_0bjectVariables.hastaneismi);
            System.out.println(C03_0bjectVariables.hastaSayisi);
    //C03 deki hastane ismini yazdirmak istersek
            C03_0bjectVariables.hastaSayisi++;
            C03_0bjectVariables.hastaSayisi++;

            System.out.println(C03_0bjectVariables.hastaSayisi);
      }
      /*Java Runtime programdir her defa kendisini yeniler.resetler.
       */
}


