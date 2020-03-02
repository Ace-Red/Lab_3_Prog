public class SetStep {
    public static char[][] stepInLabirint(char[][] labirint,Queue coordinates){
        for (int i = 0;i<coordinates.getSize();i++){
            if(i<10) {
                labirint[coordinates.showPosition(i).getPositionX()][coordinates.showPosition(i).getPositionY()] = (char) ('0' + i);
            }
            else{
                labirint[coordinates.showPosition(i).getPositionX()][coordinates.showPosition(i).getPositionY()] = (char) ('a' + (i-10));
            }
        }
    return labirint;
    }
}
