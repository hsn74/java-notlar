package ders43_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C01_Deque {
    public static void main(String[] args) {
        Deque<String>dq1=new LinkedList<>();
        dq1.add("K");
        dq1.add("B");
        dq1.addLast("F");
        System.out.println(dq1);
        System.out.println(dq1.getFirst());
        System.out.println(dq1.remove());
        System.out.println(dq1.poll());
        System.out.println(dq1);

    }
}
