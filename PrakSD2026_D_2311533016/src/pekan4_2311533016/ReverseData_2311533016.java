package pekan4_2311533016;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseData_2311533016 {
    public static void main(String[] args) {

        Queue<Integer> q_3016 = new LinkedList<Integer>();
        q_3016.add(1);
        q_3016.add(2);
        q_3016.add(3); // [1, 2, 3]

        System.out.println("sebelum reverse " + q_3016);

        Stack<Integer> s_3016 = new Stack<Integer>();

        while (!q_3016.isEmpty()) { // Q -> S
            s_3016.push(q_3016.remove());
        }

        while (!s_3016.isEmpty()) { // S -> Q
            q_3016.add(s_3016.pop());
        }

        System.out.println("sesudah reverse = " + q_3016); // [3, 2, 1]
    }
}