package pekan5_2311533016;

public class HapusSLL_2311533016 {

    // hapus head
    public static NodeSLL_2311533016 deleteHead(NodeSLL_2311533016 head_3016) {
        if (head_3016 == null)
            return null;

        head_3016 = head_3016.next_3016;
        return head_3016;
    }

    // hapus node terakhir
    public static NodeSLL_2311533016 removeLastNode(NodeSLL_2311533016 head_3016) {

        if (head_3016 == null)
            return null;

        if (head_3016.next_3016 == null)
            return null;

        NodeSLL_2311533016 secondLast_3016 = head_3016;

        while (secondLast_3016.next_3016.next_3016 != null) {
            secondLast_3016 = secondLast_3016.next_3016;
        }

        secondLast_3016.next_3016 = null;

        return head_3016;
    }

    // hapus node berdasarkan posisi
    public static NodeSLL_2311533016 deleteNode(NodeSLL_2311533016 head_3016, int position_3016) {

        NodeSLL_2311533016 temp_3016 = head_3016;
        NodeSLL_2311533016 prev_3016 = null;

        if (temp_3016 == null)
            return head_3016;

        if (position_3016 == 1) {
            head_3016 = temp_3016.next_3016;
            return head_3016;
        }

        for (int i_3016 = 1; temp_3016 != null && i_3016 < position_3016; i_3016++) {
            prev_3016 = temp_3016;
            temp_3016 = temp_3016.next_3016;
        }

        if (temp_3016 != null)
            prev_3016.next_3016 = temp_3016.next_3016;
        else
            System.out.println("Data tidak ada");

        return head_3016;
    }

    // print list
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

    // ================= MAIN =================
    public static void main(String[] args) {

        // buat linked list: 1 -> 2 -> 3 -> 4 -> 5 -> 6
        NodeSLL_2311533016 head_3016 = new NodeSLL_2311533016(1);
        head_3016.next_3016 = new NodeSLL_2311533016(2);
        head_3016.next_3016.next_3016 = new NodeSLL_2311533016(3);
        head_3016.next_3016.next_3016.next_3016 = new NodeSLL_2311533016(4);
        head_3016.next_3016.next_3016.next_3016.next_3016 = new NodeSLL_2311533016(5);
        head_3016.next_3016.next_3016.next_3016.next_3016.next_3016 = new NodeSLL_2311533016(6);

        // tampilkan awal
        System.out.println("List awal:");
        printList(head_3016);

        // hapus head
        head_3016 = deleteHead(head_3016);
        System.out.println("List setelah head dihapus:");
        printList(head_3016);

        // hapus node terakhir
        head_3016 = removeLastNode(head_3016);
        System.out.println("List setelah simpul terakhir dihapus:");
        printList(head_3016);

        // hapus posisi ke-2
        int position_3016 = 2;
        head_3016 = deleteNode(head_3016, position_3016);

        System.out.println("List setelah posisi 2 dihapus:");
        printList(head_3016);
    }
}