package pekan5_2311533016;

public class PencarianSLL_2311533016 {

    static boolean searchKey(NodeSLL_2311533016 head_3016, int key_3016) {

        NodeSLL_2311533016 curr_3016 = head_3016;

        while (curr_3016 != null) {
            if (curr_3016.data_3016 == key_3016)
                return true;

            curr_3016 = curr_3016.next_3016;
        }

        return false;
    }

    public static void traversal(NodeSLL_2311533016 head_3016) {

        NodeSLL_2311533016 curr_3016 = head_3016;

        while (curr_3016 != null) {
            System.out.print(" " + curr_3016.data_3016);
            curr_3016 = curr_3016.next_3016;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        NodeSLL_2311533016 head_3016 = new NodeSLL_2311533016(14);
        head_3016.next_3016 = new NodeSLL_2311533016(21);
        head_3016.next_3016.next_3016 = new NodeSLL_2311533016(13);
        head_3016.next_3016.next_3016.next_3016 = new NodeSLL_2311533016(30);
        head_3016.next_3016.next_3016.next_3016.next_3016 = new NodeSLL_2311533016(10);

        System.out.print("Penelusuran SLL : ");
        traversal(head_3016);

        // data yang akan dicari
        int key_3016 = 30;

        System.out.print("Cari data " + key_3016 + " = ");

        if (searchKey(head_3016, key_3016))
            System.out.println("ketemu");
        else
            System.out.println("tidak ada");
    }
}