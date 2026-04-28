package pekan4_2311533016;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class IterasiQueue_2311533016 {
    public static void main(String args[]) {

        Queue<String> q_3016 = new LinkedList<>();

        q_3016.add("Praktikum");
        q_3016.add("Struktur");
        q_3016.add("Data");
        q_3016.add("Dan");
        q_3016.add("Algoritma");

        Iterator<String> iterator = q_3016.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}