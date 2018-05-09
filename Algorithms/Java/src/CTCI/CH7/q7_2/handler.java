package CTCI.CH7.q7_2;

public abstract class handler {
    protected handler successor;

    public void setSuccessor(handler successor){
        this.successor = successor;
    }

    public abstract void handleRequest(request request);
}
