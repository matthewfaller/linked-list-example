import com.sun.istack.internal.Nullable;

/**
 * Created by faller.matthew on 12/30/20.
 */
public class LinkedList /*implements Iterable<Integer>*/ {

    // A private piece of data that hides away the ugliness of the data structure from our users aka the programmers
    @Nullable
    private Node zeroethNode;
    private int count;

    /**
     * Appends a new element to the end of the list
     * */
    public void appendData(int newData) {
       // Node notEmpty;
        count++;
        if (this.isEmpty()) {
            zeroethNode = new Node(newData);
        } else {
            this.zeroethNode.addreData(newData);
        }
    }

    /**
     *  Returns true if no elements are present in the list
     * */
    public boolean isEmpty() {
        if (zeroethNode != null) {
            return false;
        }
        return true;
    }

    /**
     * Returns the current number of items in the list
     * */
    public int getCount() {

        return count;
    }

    /**
     * Removes the first element from the list and returns the data value
     * */
    public int removeFirst() {
        count--;
        return 0;
    }

    /**
     * Removes the last element from the list and returns the data value
     * */
    public int removeLast() {
        count--;
        if (this.isEmpty()) {
            zeroethNode = null;
        } else {
            this.zeroethNode.lastGone(this.zeroethNode.data);
        }
        return this.zeroethNode.data;
    }

    /**
     * Removes all elements
     * */
    public void removeAll() {
        zeroethNode.address = null;
        zeroethNode = null;
        count = 0;
    }

    /**
     * Adds all of the elements from the linked list to this list
     * */

    public void addData(LinkedList list) {
        //no idea wtf is going here, psych... i have to append 1 list to another
   }

    public void copyData(LinkedList list) {
        this.zeroethNode = list.zeroethNode;// this is wrong, because the addresses are the same
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }

        return zeroethNode.toString();
    }
}
