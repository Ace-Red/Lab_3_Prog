public class Heights {
    private int positionX;
    private int positionY;
    private int father;
    private int fullCostPath;
    private int partialCostPath;
    private int identicalNumber;

    public Heights(int positionX, int positionY, int identicalNumber, int fullCostPath, int partialCostPath) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.identicalNumber = identicalNumber;
        this.fullCostPath = fullCostPath;
        father=-1;
        this.partialCostPath=partialCostPath;
    }

    public int getFullCostPath() {
        return fullCostPath;
    }
    public int getPartialCostPath(){
        return partialCostPath;
    }
    public int getPositionX(){
        return positionX;
    }
    public int getPositionY(){
        return positionY;
    }
    public void setFather(int father){
        this.father=father;
    }

    public int getFather(){
        return father;
    }
    public int getIdenticalNumber(){
        return identicalNumber;
    }
    public void setFullCostPath(int fullCostPath){
        this.fullCostPath=fullCostPath;
    }

    public void setPartialCostPath(int partialCostPath){
        this.partialCostPath=partialCostPath;
    }
}
