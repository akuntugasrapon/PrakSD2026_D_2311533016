package pekan6_2311533016;

public class PenulusuranDLL_2311533016 {

    static void forwardTraversal(NodeDLL_2311533016 head_3016) {

        NodeDLL_2311533016 curr_3016 = head_3016;

        while (curr_3016 != null) {

            System.out.print(curr_3016.data_3016 + " <-> ");

            curr_3016 = curr_3016.next_3016;
        }

        System.out.println();
    }

    static void backwardTraversal(NodeDLL_2311533016 tail_3016) {

        NodeDLL_2311533016 curr_3016 = tail_3016;

        while (curr_3016 != null) {

            System.out.print(curr_3016.data_3016 + " <-> ");

            curr_3016 = curr_3016.prev_3016;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        NodeDLL_2311533016 head_3016 =
                new NodeDLL_2311533016(1);

        NodeDLL_2311533016 second_3016 =
                new NodeDLL_2311533016(2);

        NodeDLL_2311533016 third_3016 =
                new NodeDLL_2311533016(3);

        head_3016.next_3016 = second_3016;
        second_3016.prev_3016 = head_3016;

        second_3016.next_3016 = third_3016;
        third_3016.prev_3016 = second_3016;

        System.out.println("Penulusuran maju:");
        forwardTraversal(head_3016);

        System.out.println("Penulusuran mundur:");
        backwardTraversal(third_3016);
    }
}