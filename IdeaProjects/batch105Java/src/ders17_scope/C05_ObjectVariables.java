package ders17_scope;

public class C05_ObjectVariables {
    public static void main(String[] args) {
        C03_0bjectVariables pers1=new C03_0bjectVariables();
        System.out.println(pers1.persIsmi);
        System.out.println(pers1.persYasi);
        pers1.persIsmi="Suleyman";
        pers1.persYasi=35;
        pers1.PersTelefonu="55544446665";
        System.out.println(pers1.persIsmi);
        System.out.println(pers1.persYasi);
        C03_0bjectVariables pers2=new C03_0bjectVariables();
        pers2.persIsmi="latife";
        pers2.persYasi=32;
        pers2.PersTelefonu="55545555444";

        System.out.println(pers1.persIsmi);
        System.out.println(pers1.persIsmi);
        C03_0bjectVariables pers3=new C03_0bjectVariables();
        pers3.persIsmi="heysem";
        pers3.persYasi=36;
        pers3.PersTelefonu="3125454554";
        System.out.println(pers1.persIsmi);

    }
}
