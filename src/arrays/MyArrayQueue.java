package arrays;

public class MyArrayQueue {

    public static final int MAX_CAPACITY = 8;

    int[] data;
    // >= 0 cand am valor sau -1 cand nu am valori
    int top;
    int bottom;

    public void shiftLeft() {
        // testez daca am valori libere in stanga
        if (bottom > 0) {
            // iterez prin valorile din array iar pentru ca voi muta spre stanga,
            // trebuie sa mut valorile de la stanga la dreapta
            for (int i = bottom; i < data.length; i++) {
                // asignez valoarea de la pozitia veche la pozita noua
                data[i - bottom] = data[i];
            }
            // bottom devine 0
            bottom = 0;
            // top devine top - bottom sau lungimea cozii
            top = top - bottom;
            // "eliberez" valorile din dreapta
            for (int i = top + 1; i < data.length; i++) {
                data[i] = 0;
            }
        }
    }

    public MyArrayQueue() {
        data = new int[MAX_CAPACITY];
        top = -1;
        bottom = -1;
    }

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

    public boolean isEmpty() {
        return top == -1;
    }

    public void showQueue() {
        for (int i = bottom; i <= top; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
