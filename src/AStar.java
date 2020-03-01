import java.util.Arrays;

public class AStar {
    private static int h(int[] first, int[] second) {
        return Math.abs(first[0] - second[0]) + Math.abs(first[1] - second[1]);
    }

    public static Queue findPath(char[][] field, int startX, int startY, int[] finish) {
        Queue opened = new Queue();
        Queue closed = new Queue();
        int counter = 0;
        Heights start = new Heights(startX, startY, counter++, 0, 0);
        opened.push(start);
        while (!opened.isEmpty()) {
            int positionOfMinimum = opened.findMinimum();
            closed.push(opened.front(positionOfMinimum));
            if (closed.peek().getPositionX() == finish[0] && closed.peek().getPositionY() == finish[1])
                break;

            close(field, closed.peek().getPositionX(), closed.peek().getPositionY());
            int[][] neighbours = findOpenedNeighbour(field, closed.peek().getPositionX(), closed.peek().getPositionY());
            for (int[] neighbour : neighbours) {
                int positionOfNeighbour = opened.existNeighbour(neighbour[0], neighbour[1]);
                int partialPath = 1 + closed.peek().getPartialCostPath();
                int path = partialPath + h(finish, neighbour);
                if (positionOfNeighbour == -1) {

                    Heights point = new Heights(neighbour[0], neighbour[1], counter++, path, partialPath);
                    point.setFather(closed.peek().getIdenticalNumber());
                    opened.push(point);
                } else {

                    if (opened.front(positionOfNeighbour).getFullCostPath() > path) {
                        opened.front(positionOfNeighbour).setFullCostPath(path);
                        opened.front(positionOfNeighbour).setFather(closed.peek().getIdenticalNumber());
                        opened.front(positionOfNeighbour).setPartialCostPath(partialPath);
                    }

                }

            }
        }
        Queue path = new Queue();
        path.push(closed.peek());
        int father = closed.peek().getFather();
        for (int k = closed.getSize() - 1; k >= 0; k--) {
            if (father == closed.showPosition(k).getIdenticalNumber()) {
                path.push(closed.showPosition(k));
                father = closed.showPosition(k).getFather();
            }
        }
        return path;
    }

    private static boolean isWall(char[][] field, int[] coordinates) {
        return field[coordinates[0]][coordinates[1]] == 'X';
    }

    private static void close(char[][] field, int positionX, int positionY) {
        field[positionX][positionY] = 'X';
    }

    private static int[][] findOpenedNeighbour(char[][] field, int positionX, int positionY) {
        int[][] suspect = new int[4][2];
        suspect[0][0] = suspect[2][0] = positionX;
        suspect[0][1] = positionY - 1;
        suspect[2][1] = positionY + 1;
        suspect[1][1] = suspect[3][1] = positionY;
        suspect[1][0] = positionX - 1;
        suspect[3][0] = positionX + 1;
        int[][] neighbours = new int[4][2];
        int counter = 0;
        for (int k = 0; k < 4; k++)
            if (!isWall(field, suspect[k]))
                neighbours[counter++] = suspect[k];
        return Arrays.copyOfRange(neighbours, 0, counter);
    }
}
