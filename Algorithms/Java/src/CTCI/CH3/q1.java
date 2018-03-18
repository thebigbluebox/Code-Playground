package CTCI.CH3;

import java.util.NoSuchElementException;

public class q1 {

    public class tripleStack{
        private Integer[] array;
        private int stack2start,stack3start
                ,stack1fill, stack2fill, stack3fill;

        public tripleStack(int stackSize){
            array = new Integer[stackSize*3];
            stack2start = stackSize;
            stack3start = stackSize * 2;
            stack1fill = 0;
            stack2fill = 0;
            stack3fill = 0;
        }

        public void push(Integer value, int which) throws NoSuchElementException
        {
            switch(which){
                case 1:
                    if (isGoingToOverFlow(which)) {
                        array[stack1fill] = value;
                        stack1fill += 1;
                    }
                    break;
                case 2:
                    if (isGoingToOverFlow(2)){
                        array[stack2fill+stack2fill] = value;
                        stack2fill+=1;
                    }
                    break;
                case 3:
                    if (isGoingToOverFlow(3)){
                        array[stack3fill+stack3fill] = value;
                        stack3fill+=1;
                    }
                    break;
                default:
                    throw new NoSuchElementException();
            }

        }

        public Integer pop(Integer value, int which)
        {
            Integer result;
            switch(which){
                case 1:
                    result = array[stack1fill];
                    array[stack1fill] = null;
                    stack1fill--;
                    break;
                case 2:
                    result = array[stack2start + stack2fill];
                    array[stack2start + stack2fill] = null;
                    stack2fill--;
                    break;
                case 3:
                    result = array[stack3start + stack3fill];
                    array[stack3start + stack3fill] = null;
                    stack3fill--;
                    break;
                default:
                    return null;
            }
            return result;
        }

        public Integer peek(int which)
        {
            Integer result;
            switch(which){
                case 1:
                    result = array[stack1fill];
                    break;
                case 2:
                    result = array[stack2start + stack2fill];
                    break;
                case 3:
                    result = array[stack3start + stack3fill];
                    break;
                default:
                    return null;
            }
            return result;
        }

        public boolean isEmpty(int which) throws NoSuchElementException
        {
            int start, end;
            switch(which){
                case 1:
                    start = 0;
                    end = stack2start;
                    break;
                case 2:
                    start = stack2start;
                    end = stack3start;
                    break;
                case 3:
                    start = stack3start;
                    end = array.length;
                    break;
                default:
                    throw new NoSuchElementException();
            }
            while(start<end){
                if(array[start] != null){
                    return false;
                }
                start ++;
            }
            return true;
        }

        private boolean isGoingToOverFlow(int which) throws NoSuchElementException{
            switch(which){
                case 1:
                    if(stack1fill+1>=stack2start){
                        return false;
                    }
                    break;
                case 2:
                    if(stack2fill+1>=stack3start){
                        return false;
                    }
                    break;
                case 3:
                    if(stack3fill+1>=array.length){
                        return false;
                    }
                    break;
                default:
                    throw new NoSuchElementException();
            }
            return true;
        }
    }
}
