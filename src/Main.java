public class Main {

    public static void main(String[] args)  {
        char[][] labirint = ReadWrite.read_file("Test/file_labirint");
        int[] finish = new int[2];
        finish[0] = 1;
        finish[1] = 6;
        Queue path = AStar.findPath(labirint, 6, 1, finish);
        for (int k = 0; k < path.getSize(); k++) {
            System.out.println("(" + path.showPosition(k).getPositionX() + ", " + path.showPosition(k).getPositionY() + ")");
        }
    }
}
