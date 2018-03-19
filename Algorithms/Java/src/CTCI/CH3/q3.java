package CTCI.CH3;

import dataStrucs.MyStack;

import java.util.List;

public class q3 {
    public class setOfStacks<T>{
        private List<MyStack> plates;
        private int stackSize;

        public setOfStacks(int stackSize) {
            MyStack stack = new MyStack();
            this.stackSize = stackSize;
        }

        public void enqueue(Object plate){
            if(plates.get(plates.size()).getStackLength() == stackSize){
                MyStack stack = new MyStack();
                stack.push(plate);
                plates.add(stack);
            } else {
                plates.get(plates.size()).push(plate);
            }
        }

        public Object dequeue(){
            if(plates.get(plates.size()).isEmpty() && plates.size() > 1)
                plates.remove(plates.size());
            if(plates.get(plates.size()).isEmpty() && plates.size() == 1)
                return null;
            return plates.get(plates.size()).pop();
        }

        public Object popAt(int index){
            if(index <= plates.size()){
                return plates.get(index-1).pop();
            }
            return null;
        }

        private boolean isFull(){
            return ((double)plates.size()/stackSize % 10)*10 == 0;
        }

    }
}
