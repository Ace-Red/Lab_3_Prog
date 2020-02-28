import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args)throws FileNotFoundException {
        char[][] labirint = ReadWrite.read_file("Test/file_labirint");
        ReadWrite.out_labirint(labirint);
    }
}
