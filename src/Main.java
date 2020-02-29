import java.io.FileNotFoundException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        char[][] labirint = ReadWrite.read_file("Test/file_labirint");
        int[] finish = new int[2];
        finish[0] = 1;
        finish[1] = 6;
        char[][] finish_labirint = SetStep.stepInLabirint(labirint,AStar.findPath(labirint, 6, 1, finish));
        ReadWrite.out_labirint(finish_labirint,"Test/out_file");
    }
}
