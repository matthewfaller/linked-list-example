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

        //example1.data = 2;

        //to link together

        example1.address = example2;
        example2.address = example3;
        example3.address = example4;

//        System.out.println(example1);

        // The goal:

        LinkedList lister = new LinkedList();
        lister.appendData(1);
        lister.appendData(2);
        lister.appendData(8);
        System.out.println(lister);

        System.out.println(lister.getCount());
        lister.removeAll();
        System.out.println(lister);
        System.out.println(lister.getCount());// to check if this was reset also
        System.out.println();


        //deleted everything, will the below work?
        lister.appendData(7);
        lister.appendData(9);
        lister.appendData(42);
        lister.appendData(77);
        System.out.println(lister);
        System.out.print(lister.getCount());// to check if this was reset also
        System.out.println();
        System.out.println();
       /*
       LinkedList newCopy = new LinkedList();
        newCopy.copyData(lister);
        System.out.println(newCopy);

        */
        int placeholder = lister.removeLast();
        System.out.println(placeholder);
        System.out.println(lister);


//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//
//        for (Integer next : list) {
//            System.out.println(next);
//        }
    }
}
