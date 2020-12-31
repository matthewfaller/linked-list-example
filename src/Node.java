/**
 * Created by faller.matthew on 12/30/20.
 */
public class Node extends Object {

    int data; // this is the data of the node, like the actual info that we're putting into the nodes...
    Node address;
    /*
    jonathan's long ass thoughts to understand "address"...
    / this is going to be the address of the "next" node, it's "address" because it's easier to
    // understand...buuuut, actually, it is because all objects are referenced/address/pointer based,
    // this is why (the whole passed by reference thing) "address" is a node
    */
    public Node(int newData) {
        data = newData;
    }

    @Override
    public String toString() {

        String totalOutput;
        String selfOutput = "";

        selfOutput = "[Data: " + data + "]" + "\n";

        if (address != null){
            totalOutput = selfOutput + address.toString();//".toString()" is already in here, um... this is tough to
            // put into notes for future me... i'll survive
        }
        else {
            totalOutput = selfOutput;
        }

        return totalOutput;
    }
}

/*

0x0
0x1
0x2
0x3
0x4

[data, address] ->

State #1
[a, 0x1] -> [b, 0x2] -> [c, null] -> []

State #2
[a, 0x1] -> [b, 0x2] -> [c, 0x3] -> [d, null] -> []




*/
