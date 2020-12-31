import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // int, char, boolean, double, float...
        Node example1;
        Node example2;

        example1 = new Node(1);
        example2 = new Node(2);
        Node example3 = new Node(3);
        Node example4 = new Node(4);

        example1.data = 1;

        //to link together

        example1.address = example2;
        example2.address = example3;
        example3.address = example4;

        System.out.println(example1);

        System.out.println("Reading list of integers");
        for (String next : args) {
            System.out.println(next);
        }



    }
}
