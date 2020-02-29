public class SetStep {
    public static char[][] stepInLabirint(char[][] labirint,int[][]way){
        for (int i = 0;i<way.length;i++){
            if(i<10) {
                labirint[way[i][0]][way[i][1]] = (char) ('0' + i);
            }
            else{
                labirint[way[i][0]][way[i][1]] = (char) ('a' + (i-10));
            }
        }
    return labirint;
    }
}
