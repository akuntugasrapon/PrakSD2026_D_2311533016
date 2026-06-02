package pekan6_2311533016;

public class InsertDLL_2311533016 {

    static NodeDLL_2311533016 insertBegin(NodeDLL_2311533016 head_3016, int data_3016) {

        NodeDLL_2311533016 new_node_3016 = new NodeDLL_2311533016(data_3016);

        new_node_3016.next_3016 = head_3016;

        if (head_3016 != null) {
            head_3016.prev_3016 = new_node_3016;
        }

        return new_node_3016;
    }

    public static NodeDLL_2311533016 insertEnd(NodeDLL_2311533016 head_3016, int newData_3016) {

        NodeDLL_2311533016 newNode_3016 = new NodeDLL_2311533016(newData_3016);

        if (head_3016 == null) {
            head_3016 = newNode_3016;

        } else {

            NodeDLL_2311533016 curr_3016 = head_3016;

            while (curr_3016.next_3016 != null) {
                curr_3016 = curr_3016.next_3016;
            }

            curr_3016.next_3016 = newNode_3016;
            newNode_3016.prev_3016 = curr_3016;
        }

        return head_3016;
    }

    public static NodeDLL_2311533016 insertAtPosition(
            NodeDLL_2311533016 head_3016,
            int pos_3016,
            int new_data_3016) {

        NodeDLL_2311533016 new_node_3016 =
                new NodeDLL_2311533016(new_data_3016);

        if (pos_3016 == 1) {

            new_node_3016.next_3016 = head_3016;

            if (head_3016 != null) {
                head_3016.prev_3016 = new_node_3016;
            }

            head_3016 = new_node_3016;
            return head_3016;
        }

        NodeDLL_2311533016 curr_3016 = head_3016;

        for (int i_3016 = 1;
                i_3016 < pos_3016 - 1 && curr_3016 != null;
                ++i_3016) {

            curr_3016 = curr_3016.next_3016;
        }

        if (curr_3016 == null) {
            System.out.println("Posisi tidak ada");
            return head_3016;
        }

        new_node_3016.prev_3016 = curr_3016;
        new_node_3016.next_3016 = curr_3016.next_3016;

        curr_3016.next_3016 = new_node_3016;

        if (new_node_3016.next_3016 != null) {
            new_node_3016.next_3016.prev_3016 = new_node_3016;
        }

        return head_3016;
    }

    public static void printList(NodeDLL_2311533016 head_3016) {

        NodeDLL_2311533016 curr_3016 = head_3016;

        while (curr_3016 != null) {
            System.out.print(curr_3016.data_3016 + " <-> ");
            curr_3016 = curr_3016.next_3016;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        NodeDLL_2311533016 head_3016 =
                new NodeDLL_2311533016(2);

        head_3016.next_3016 =
                new NodeDLL_2311533016(3);

        head_3016.next_3016.prev_3016 = head_3016;

        head_3016.next_3016.next_3016 =
                new NodeDLL_2311533016(5);

        head_3016.next_3016.next_3016.prev_3016 =
                head_3016.next_3016;

        System.out.print("DLL awal: ");
        printList(head_3016);

        head_3016 = insertBegin(head_3016, 1);

        System.out.print("simpul 1 ditambah di awal: ");
        printList(head_3016);

        System.out.print("simpul 6 ditambah di akhir: ");

        int data_3016 = 6;

        head_3016 = insertEnd(head_3016, data_3016);

        printList(head_3016);

        System.out.print("tambah node 4 di posisi 4: ");

        int data2_3016 = 4;
        int pos_3016 = 4;

        head_3016 =
                insertAtPosition(head_3016,
                        pos_3016,
                        data2_3016);

        printList(head_3016);
    }
}