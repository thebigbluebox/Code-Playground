package CTCI.CH7.q7_2;

public class employee {
    boolean isBusy = false;
    public employee(boolean isBusy){
        this.isBusy = isBusy;
    }

    public boolean isBusy() {
        return isBusy;
    }

    public void respond(){
        if(!isBusy){
            isBusy = true;
            System.out.print("Responded to Call");
        }
    }
}
