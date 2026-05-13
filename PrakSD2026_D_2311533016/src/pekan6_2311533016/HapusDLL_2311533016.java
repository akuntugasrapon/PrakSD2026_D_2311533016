package pekan6_2311533016;

public class HapusDLL_2311533016 {

    public static NodeDLL_2311533016 delHead_3016(
            NodeDLL_2311533016 head_3016) {

        if (head_3016 == null) {
            return null;
        }

        NodeDLL_2311533016 temp_3016 = head_3016;

        head_3016 = head_3016.next_3016;

        if (head_3016 != null) {
            head_3016.prev_3016 = null;
        }

        return head_3016;
    }

    public static NodeDLL_2311533016 delLast(
            NodeDLL_2311533016 head_3016) {

        if (head_3016 == null) {
            return null;
        }

        if (head_3016.next_3016 == null) {
            return null;
        }

        NodeDLL_2311533016 curr_3016 = head_3016;

        while (curr_3016.next_3016 != null) {
            curr_3016 = curr_3016.next_3016;
        }

        if (curr_3016.prev_3016 != null) {
            curr_3016.prev_3016.next_3016 = null;
        }

        return head_3016;
    }

    public static NodeDLL_2311533016 delPos_3016(
            NodeDLL_2311533016 head_3016,
            int pos_3016) {

        if (head_3016 == null) {
            return head_3016;
        }

        NodeDLL_2311533016 curr_3016 = head_3016;

        for (int i_3016 = 1;
                curr_3016 != null && i_3016 < pos_3016;
                ++i_3016) {

            curr_3016 = curr_3016.next_3016;
        }

        if (curr_3016 == null) {
            return head_3016;
        }

        if (curr_3016.prev_3016 != null) {
            curr_3016.prev_3016.next_3016 =
                    curr_3016.next_3016;
        }

        if (curr_3016.next_3016 != null) {
            curr_3016.next_3016.prev_3016 =
                    curr_3016.prev_3016;
        }

        if (head_3016 == curr_3016) {
            head_3016 = curr_3016.next_3016;
        }

        return head_3016;
    }

    public static void printList(NodeDLL_2311533016 head_3016) {

        NodeDLL_2311533016 curr_3016 = head_3016;

        while (curr_3016 != null) {

            System.out.print(curr_3016.data_3016 + " ");

            curr_3016 = curr_3016.next_3016;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        NodeDLL_2311533016 head_3016 =
                new NodeDLL_2311533016(1);

        head_3016.next_3016 =
                new NodeDLL_2311533016(2);

        head_3016.next_3016.prev_3016 =
                head_3016;

        head_3016.next_3016.next_3016 =
                new NodeDLL_2311533016(3);

        head_3016.next_3016.next_3016.prev_3016 =
                head_3016.next_3016;

        head_3016.next_3016.next_3016.next_3016 =
                new NodeDLL_2311533016(4);

        head_3016.next_3016.next_3016.next_3016.prev_3016 =
                head_3016.next_3016.next_3016;

        head_3016.next_3016.next_3016.next_3016.next_3016 =
                new NodeDLL_2311533016(5);

        head_3016.next_3016.next_3016.next_3016.next_3016.prev_3016 =
                head_3016.next_3016.next_3016.next_3016;

        System.out.print("DLL Awal: ");
        printList(head_3016);

        System.out.print("Setelah head dihapus: ");
        head_3016 = delHead_3016(head_3016);
        printList(head_3016);

        System.out.print("Setelah node terakhir dihapus: ");
        head_3016 = delLast(head_3016);
        printList(head_3016);

        System.out.print("Menghapus posisi ke-2: ");
        head_3016 = delPos_3016(head_3016, 2);
        printList(head_3016);
    }
}