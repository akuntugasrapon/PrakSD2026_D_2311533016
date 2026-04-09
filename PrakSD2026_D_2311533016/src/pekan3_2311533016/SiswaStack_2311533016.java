package pekan3_2311533016;

import java.util.ArrayList;

class Siswa {
    String nama;
    int nim;

    public Siswa(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }

    @Override
    public String toString() {
        return "Nim: " + nim + ", Nama: " + nama;
    }
}

public class SiswaStack_2311533016 {
    private ArrayList<Siswa> stack;

    public SiswaStack_2311533016() {
        stack = new ArrayList<>();
    }

    public void push(Siswa mhs) {
        stack.add(mhs);
    }

    public Siswa pop() {
        if (!isEmpty()) {
            return stack.remove(stack.size() - 1);
        }
        return null;
    }

    public Siswa peek() {
        if (!isEmpty()) {
            return stack.get(stack.size() - 1);
        }
        return null;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void tampilkanSiswa() {
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println(stack.get(i));
        }
    }

    public static void main(String[] args) {
        SiswaStack_2311533016 studentStack = new SiswaStack_2311533016();

        Siswa mhs1 = new Siswa("Ali", 1);
        Siswa mhs2 = new Siswa("Boby", 2);
        Siswa mhs3 = new Siswa("Charles", 3);

        studentStack.push(mhs1);
        studentStack.push(mhs2);
        studentStack.push(mhs3);

        // === SESUAI FOTO TERAKHIR ===
        System.out.println("Siswa di dalam stack:");
        studentStack.tampilkanSiswa();

        System.out.println("Siswa teratas " + studentStack.peek());
        System.out.println("Mengeluarkan siswa teratas dari stack: " + studentStack.pop());

        System.out.println("Daftar siswa setelah di pop:");
        studentStack.tampilkanSiswa();
    }
}