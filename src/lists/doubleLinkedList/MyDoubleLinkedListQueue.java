package lists.doubleLinkedList;

public class MyDoubleLinkedListQueue {

    Node top;

    Node bottom;

    /*
     * TODO: implement and change return condition
     * */
    public int peek() {
        return 0;
    }

    /*
     * TODO: implement
     * */
    public void push() {

    }

    /*
     * TODO: implement and change return condition
     * */
    public int pop() {
        return 0;
    }

    public void showQueue() {
        Node n = bottom;
        while (n != null) {
            System.out.print(n.data + " ");
        }
        System.out.println();
    }

}
