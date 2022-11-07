package free;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Dil_Secimi {
    public static void main(String[] args) {
        ArrayList<String> meslekler = new ArrayList<>();
        meslekler.add("mat");
        meslekler.add("dil");
        meslekler.add("fen");
        meslekler.add("kimya");
        System.out.println("ArrayList:" + meslekler);

        meslekler.add("fizik");
        System.out.println(meslekler);
        meslekler.remove("kimya");
        System.out.println(meslekler);

        }
    }




