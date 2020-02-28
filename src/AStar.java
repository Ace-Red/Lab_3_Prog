public class AStar {
    private static int h(int[] first, int[] second) {
        return Math.abs(first[0] - second[0]) + Math.abs(first[1] - second[1]);
    }

    public static int[][] findPath(char[][] field, int startX, int startY, int[] finish) {
        int[][] path = new int[field.length * field.length / 2][2];

        path[0][0] = startX;
        path[0][1] = startY;
        int numberOfPath = 1;


        while (h(path[numberOfPath-1], finish)!=0) {
            int[][] points = new int[4][3];
            int iHavePoints = 0;
            int[][] suspect = new int[4][2];
            suspect[0][0] = points[0][0] + 1;
            suspect[1][0] = points[0][0] - 1;
            suspect[0][1] = suspect[1][1] = points[0][1];

            suspect[2][1] = points[0][1] + 1;
            suspect[3][1] = points[0][1] - 1;
            suspect[2][0] = suspect[3][0] = points[0][0];

            for (int k = 0; k < 4; k++) {
                if (isWall(field, suspect[k])) {
                    points[iHavePoints] = suspect[k];
                    points[iHavePoints][2] = h(path[numberOfPath - 1], suspect[k]) + numberOfPath;
                    iHavePoints++;
                }
            }
            path[numberOfPath]=minimum(points, iHavePoints);
            numberOfPath++;
        }
        return path;
    }

    private static boolean isWall(char[][] field, int[] coordinates) {
        return field[coordinates[0]][coordinates[1]] == 'X';
    }

    private static int[] minimum(int[][] points, int iHavePoints) {
        int minimum =0 ;
        for (int k=0;k<iHavePoints;k++){
            if (points[minimum][2]>points[k][2])
                minimum=k;
        }
        int[] array = new int[2];
        System.arraycopy(points[minimum], 0, array, 0, 2);
        return array;
    }
}
