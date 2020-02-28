
import java.util.ArrayList;

public class Queue {
    ArrayList<Character> queue;
    private int len;

    public Queue(){
        queue = new ArrayList<>();
        len = 0;
    }
    public void add(char element){
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
