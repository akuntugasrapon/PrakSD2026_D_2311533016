package pekan3_2311533016;

public class StackArrayDriver_2311533016 {

    public static void main(String[] args) {

        StackArray_2311533016 s = new StackArray_2311533016();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s.pop() + " dikeluarkan dari stack");
        System.out.println("Elemen teratas adalah : " + s.peek());
        System.out.print("Elemen pada stack : ");

        s.print();
    }
}