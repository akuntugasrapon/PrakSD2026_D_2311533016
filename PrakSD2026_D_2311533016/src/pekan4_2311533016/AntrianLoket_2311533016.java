package pekan4_2311533016;

import java.util.Scanner;

public class AntrianLoket_2311533016 {

    int front_3016, rear_3016, max_3016;
    String queue_3016[];

    public AntrianLoket_2311533016(int max_3016) {
        this.max_3016 = max_3016;
        front_3016 = 0;
        rear_3016 = -1;
        queue_3016 = new String[max_3016];
    }

    boolean isEmpty() {
        return (rear_3016 < front_3016);
    }

    boolean isFull() {
        return (rear_3016 == max_3016 - 1);
    }

    void enqueue(String data_3016) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
        } else {
            rear_3016++;
            queue_3016[rear_3016] = data_3016;
            System.out.println("Data berhasil ditambahkan ke antrian");
        }
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println(queue_3016[front_3016] + " telah dilayani");
            front_3016++;
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Isi antrian:");
            for (int i_3016 = front_3016; i_3016 <= rear_3016; i_3016++) {
                System.out.println((i_3016 - front_3016 + 1) + ". " + queue_3016[i_3016]);
            }
        }
    }

    void reverse() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            int start_3016 = front_3016;
            int end_3016 = rear_3016;

            while (start_3016 < end_3016) {
                String temp_3016 = queue_3016[start_3016];
                queue_3016[start_3016] = queue_3016[end_3016];
                queue_3016[end_3016] = temp_3016;

                start_3016++;
                end_3016--;
            }

            System.out.println("Antrian berhasil dibalik");
        }
    }

    public static void main(String[] args) {
        Scanner input_3016 = new Scanner(System.in);

        AntrianLoket_2311533016 antrian_3016 = new AntrianLoket_2311533016(10);

        int pilihan_3016;

        do {
            System.out.println("\n=== PROGRAM ANTRIAN LOKET ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Hapus Antrian");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Reverse");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");

            pilihan_3016 = input_3016.nextInt();
            input_3016.nextLine();

            switch (pilihan_3016) {
                case 1:
                    System.out.print("Masukkan nama pelanggan: ");
                    String nama_3016 = input_3016.nextLine();
                    antrian_3016.enqueue(nama_3016);
                    break;

                case 2:
                    antrian_3016.dequeue();
                    break;

                case 3:
                    antrian_3016.display();
                    break;

                case 4:
                    antrian_3016.reverse();
                    break;

                case 5:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan_3016 != 5);

        input_3016.close();
    }
}