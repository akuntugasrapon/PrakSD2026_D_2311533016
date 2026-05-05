package pekan5_2311533016;

public class TambahSLL_2311533016 {

    public static NodeSLL_2311533016 insertAtFront(NodeSLL_2311533016 head_3016, int value_3016) {
        NodeSLL_2311533016 new_node_3016 = new NodeSLL_2311533016(value_3016);
        new_node_3016.next_3016 = head_3016;
        return new_node_3016;
    }

    public static NodeSLL_2311533016 insertAtEnd(NodeSLL_2311533016 head_3016, int value_3016) {

        NodeSLL_2311533016 newNode_3016 = new NodeSLL_2311533016(value_3016);

        if (head_3016 == null) {
            return newNode_3016;
        }

        NodeSLL_2311533016 last_3016 = head_3016;

        while (last_3016.next_3016 != null) {
            last_3016 = last_3016.next_3016;
        }

        last_3016.next_3016 = newNode_3016;

        return head_3016;
    }

    static NodeSLL_2311533016 GetNode(int data_3016) {
        return new NodeSLL_2311533016(data_3016);
    }

    static NodeSLL_2311533016 insertPos(NodeSLL_2311533016 headNode_3016, int position_3016, int value_3016) {

        NodeSLL_2311533016 head_3016 = headNode_3016;

        if (position_3016 < 1)
            System.out.print("Invalid position");

        if (position_3016 == 1) {
            NodeSLL_2311533016 new_node_3016 = new NodeSLL_2311533016(value_3016);
            new_node_3016.next_3016 = head_3016;
            return new_node_3016;
        } else {

            while (position_3016-- != 0) {

                if (position_3016 == 1) {
                    NodeSLL_2311533016 newNode_3016 = GetNode(value_3016);

                    newNode_3016.next_3016 = headNode_3016.next_3016;
                    headNode_3016.next_3016 = newNode_3016;
                    break;
                }

                headNode_3016 = headNode_3016.next_3016;
            }

            if (position_3016 != 1)
                System.out.print("Posisi di luar jangkauan");

            return head_3016;
        }
    }

    public static void printList(NodeSLL_2311533016 head_3016) {

        NodeSLL_2311533016 curr_3016 = head_3016;

        while (curr_3016.next_3016 != null) {
            System.out.print(curr_3016.data_3016 + " -> ");
            curr_3016 = curr_3016.next_3016;
        }

        if (curr_3016.next_3016 == null) {
            System.out.print(curr_3016.data_3016);
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // buat linked list 2->3->5->6
        NodeSLL_2311533016 head_3016 = new NodeSLL_2311533016(2);
        head_3016.next_3016 = new NodeSLL_2311533016(3);
        head_3016.next_3016.next_3016 = new NodeSLL_2311533016(5);
        head_3016.next_3016.next_3016.next_3016 = new NodeSLL_2311533016(6);

        // cetak list asli
        System.out.print("Senarai berantai awal: ");
        printList(head_3016);

        // tambah di depan
        System.out.print("Tambah 1 simpul di depan: ");
        int data_3016 = 1;
        head_3016 = insertAtFront(head_3016, data_3016);
        printList(head_3016);

        // tambah di belakang
        System.out.print("Tambah 1 simpul di belakang: ");
        int data2_3016 = 7;
        head_3016 = insertAtEnd(head_3016, data2_3016);
        printList(head_3016);

        // tambah di posisi tertentu
        System.out.print("Tambah 1 simpul ke data 4: ");
        int data3_3016 = 4;
        int pos_3016 = 4;
        head_3016 = insertPos(head_3016, pos_3016, data3_3016);
        printList(head_3016);
    }
}