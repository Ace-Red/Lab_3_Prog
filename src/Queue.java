
import java.util.ArrayList;

public class Queue {
    private Heights[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 16;

    public Queue() {
        this(DEFAULT_CAPACITY);
    }

    public Queue(int capacity) {
        elements = new Heights[capacity];

    }

    public void push(Heights value) {
        if (size >= elements.length) {
            Heights[] temp = new Heights[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }


    public Heights pop() {
        return elements[--size];
    }

    public Heights peek() {
        return elements[size - 1];
}

    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public Heights front(int position){
        Heights firstElement =  elements[position];
        if (size - 1 - position >= 0) System.arraycopy(elements, position + 1, elements, position, size - 1 - position);
        size--;
        return firstElement;
    }

    public Heights showPosition(int position){
        return elements[position];
    }

    public int findMinimum(){
        int minimum = 0;
        for (int k=size-1;k>0;k--){
            if(elements[minimum].getFullCostPath()>elements[k].getFullCostPath())
                minimum=k;
        }
        return minimum;
    }
    public int existNeighbour(int x, int y){
        for (int k=0;k<size;k++){
            if (elements[k].getPositionX()==x&&elements[k].getPositionY()==y)
                return k;
        }
        return -1;
    }

    public boolean isEmpty(){
        return size==0;
    }
}
