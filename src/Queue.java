
import java.util.ArrayList;

public class Queue {
    ArrayList<int[]> queue;
    private int len;

    public Queue(){
        queue = new ArrayList<>();
        len = 0;
    }
    public void add(int x,int y){
        int[] element = new int[2];
        element[0] = x;
        element[1] = y;
        queue.add(element);
        len++;
    }
    public void remove(){
        queue.remove(0);
        len--;
    }
    public int getLen(){
        return len;
    }
    public void outQueue(){
        for(int i = 0;i<len;i++){
            System.out.println(queue);
        }
    }
}
