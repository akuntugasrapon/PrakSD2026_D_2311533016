package pekan5_2311533016;

public class HapusSLL_2311533016 {

    // fungsi menghapus node di posisi tertentu
    public static NodeSLL_2311533016 deleteNode(NodeSLL_2311533016 head_3016, int position_3016) {

        NodeSLL_2311533016 temp_3016 = head_3016;
        NodeSLL_2311533016 prev_3016 = null;

        // jika linked list kosong
        if (temp_3016 == null)
            return head_3016;

        // kasus 1: head dihapus
        if (position_3016 == 1) {
            head_3016 = temp_3016.next_3016;
            return head_3016;
        }

        // kasus 2: hapus node di tengah / posisi tertentu
        for (int i_3016 = 1; temp_3016 != null && i_3016 < position_3016; i_3016++) {
            prev_3016 = temp_3016;
            temp_3016 = temp_3016.next_3016;
        }

        // jika ditemukan node
        if (temp_3016 != null)
            prev_3016.next_3016 = temp_3016.next_3016;
        else
            System.out.println("Data tidak ada");

        return head_3016;
    }

    // fungsi mencetak linked list
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
}