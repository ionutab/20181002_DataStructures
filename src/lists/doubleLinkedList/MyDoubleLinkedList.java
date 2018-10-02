package lists.doubleLinkedList;

public class MyDoubleLinkedList {

    Node head;

    Node tail;

    /*
     * operatia ce adauga un element in lista
     * TODO: implement
     * */
    public void add(int value) {

    }

    /*
     * operatia ce insereaza un element in lista la pozitia index
     * TODO: implement
     * */
    public void insertAt(int index, int value) {

    }

    /*
     * operatia ce modifica elementul din lista de la pozitia index
     * TODO: implement
     * */
    public void setAt(int index, int value) {

    }

    /*
     * operatia ce returneaza elementul din lista de la pozitia index
     * TODO: implement
     * */
    public void getAt(int index) {

    }

    /*
     * operatia ce returneaza elementul din lista de la pozitia index
     * TODO: implement and modify return statement
     * */
    public boolean isEmpty() {
        return true || false;
    }

    /*
     * operatia ce returneaza dimensiunea listei
     * TODO: implement and modify return statement
     * */
    public int getSize() {
        return 0;
    }

    public void showListForward() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
        }
        System.out.println();
    }

    /*
     * TODO: implement
     * */
    public void showListBackward() {
    }


}
