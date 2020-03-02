public class SetStep {
    public static char[][] stepInLabirint(char[][] labirint,Queue coordinates){
        for (int i = 0;i<coordinates.getSize();i++){
            if(i<10) {
                labirint[coordinates.showPosition(i).getPositionX()][coordinates.showPosition(i).getPositionY()] = (char) ('0' + i);
            }
            else{
                labirint[coordinates.showPosition(i).getPositionX()][coordinates.showPosition(i).getPositionY()] = (char) (('z'-'a' + (i-9))%('z'-'a' + 1)+'a');
            }
        }
    return labirint;
    }
}
