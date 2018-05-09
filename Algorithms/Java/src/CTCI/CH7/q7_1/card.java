package CTCI.CH7.q7_1;

/**
 * This class describes a single card
 */
public abstract class card <T>{
    T value;
    public card(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }
}