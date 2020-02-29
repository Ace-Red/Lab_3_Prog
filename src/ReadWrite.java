import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class ReadWrite {
    public static char[][] readFile(String file_name) {
        File info = new File(file_name);
        Scanner scanner;
        try {
            scanner = new Scanner(info);
            String first = scanner.nextLine();
            char[][] labirint = new char[(first.length() / 2) + 1][(first.length() / 2) + 1];
            Arrays.fill(labirint[0], 'X');
            for (int i = 1; i < labirint.length; i++) {
                String char_arr = scanner.nextLine();
                int counter = 0;
                for (int j = 0; j < char_arr.length(); j += 2) {
                    labirint[i][counter] = char_arr.charAt(j);
                    counter++;
                }
            }
            return labirint;
        } catch (FileNotFoundException ex) {
            System.out.println("Your path is incorrect!\n" + ex);
            return new char[0][0];
        }


    }

    public static void outLabirint(char[][] matrix, String file_name) {
        try{
        File file = new File(file_name);
        PrintWriter pw = new PrintWriter(file);
        pw.println("Вот ваш конечный лабиринт: ");
        for (char[] chars : matrix) {
            for (char aChar : chars) {
                pw.printf(" %c", aChar);
            }
            pw.println();
        }
        pw.close();}
        catch (FileNotFoundException ex) {
            System.out.println("Your path is incorrect!\n" + ex);
        }
    }

}
