import java.io.FileNotFoundException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        char[][] maze = ReadWrite.read_file("Test/file_labirint");
        ReadWrite.out_labirint(maze);
        int[] finish = new int[2];
        finish[0] = 1;
        finish[1] = 6;
        System.out.println(Arrays.deepToString(AStar.findPath(maze, 6, 1, finish)));
    }
}
