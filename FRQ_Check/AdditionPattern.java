// type up the complete AdditionPattern class here.

public class AdditionPattern{
    private int val1;
    private int increase;
    private int currentNum;

    public AdditionPattern (int val1, int increase){
       this.val1 = val1;
       this.increase = increase;
       currentNum = val1;
    }

    public int currentNumber() {
        return currentNum;
    }
   
    public void next() {
        currentNum += increase;
    } 
   
    public void prev() {
        if (currentNum - increase > 0) {
            currentNum -= increase;
        }   
    }
}



