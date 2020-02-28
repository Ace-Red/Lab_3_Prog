import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
public class ReadWrite {
    public static char[][] read_file(String file_name) throws FileNotFoundException{
        File info = new File(file_name);
        Scanner scanner = new Scanner(info);
        String first = scanner.nextLine();
        char[][] labirint = new char[(first.length()/2)+1][(first.length()/2)+1];
        Arrays.fill(labirint[0],'X');
        for(int i = 1;i<labirint.length;i++){
            String char_arr = scanner.nextLine();
            int counter = 0;
            for(int j = 0;j<char_arr.length();j+=2){
                labirint[i][counter] = char_arr.charAt(j);
                counter++;
            }
        }
        return labirint;
    }
    public static void out_labirint(char[][] matrix){
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix.length;j++){
                System.out.printf("%c",matrix[i][j]);
            }
            System.out.println();
        }
    }
}
