package CTCI.CH3;
import dataStrucs.MyStack;

public class q4<T> {
    private MyStack<T> firstStack = new MyStack<T>();
    private MyStack<T> secondStack = new MyStack<T>();

    public void add (T item)
    {
        firstStack.push(item);
    }

    public T remove()
    {
        if(firstStack.isEmpty()) return null;
        while(!firstStack.isEmpty()){
            secondStack.push(firstStack.pop());
        }
        T result =  secondStack.pop();
        while(!secondStack.isEmpty()){
            firstStack.push(secondStack.pop());
        }
        return result;
    }

    public T peek()
    {
        if(firstStack.isEmpty()) return null;
        while(!firstStack.isEmpty()){
            secondStack.push(firstStack.pop());
        }
        T result =  secondStack.peek();
        while(!secondStack.isEmpty()){
            firstStack.push(secondStack.pop());
        }
        return result;
    }

    public boolean isEmpty()
    {
        return firstStack == null;
    }
}
