import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args)throws FileNotFoundException {
        char[][] labirint = ReadWrite.read_file("/Users/nikitasakun/Desktop/Java project/Lab_2_Prog/Test/file_labirint");
        ReadWrite.out_labirint(labirint);
    }
}
