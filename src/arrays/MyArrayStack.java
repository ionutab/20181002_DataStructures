package arrays;

public class MyArrayStack {

    public static final int MAX_CAPACITY = 8;

    int[] data;

    // >= 0 cand am valor sau -1 cand nu am valori
    Integer top;

    public MyArrayStack() {
        this.data = new int[MAX_CAPACITY];
    }

    /*
     * retureaza urmatoarea valoare din stiva
     * TODO: implement and change return condition
     * */
    public int peek() {
        return 0;
    }

    /*
     * insereaza o valoare in stiva
     * TODO: implement
     * */
    public void push() {

    }

    /*
     * returneaza urmatoarea valoare din stiva si elibereaza locatia
     * TODO: implement and change return condition
     * */
    public int pop() {
        return 0;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void showStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
