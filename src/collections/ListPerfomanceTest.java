package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListPerfomanceTest {


    public static void arrayListTime() {
        ArrayList<Integer> list = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Arraylist add time: " + (end - start));

        long  start1 = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        long end1 = System.currentTimeMillis();
        System.out.println("Arraylist get time: " + (end1 - start1));
    }

    public static void linkedListTime() {
        LinkedList<Integer> list = new LinkedList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Linkedlist add time: " + (end - start));

        long  start1 = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        long end1 = System.currentTimeMillis();
        System.out.println("Linkedlist get time: " + (end1 - start1));
    }

    public static void main(String[] args) {

        arrayListTime();
        linkedListTime();
    }


}
