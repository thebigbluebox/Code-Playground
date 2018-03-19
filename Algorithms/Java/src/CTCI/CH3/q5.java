package CTCI.CH3;

import dataStrucs.MyStack;

public class q5 {
    public class sortedStack{
        MyStack<Integer> stack;
        MyStack<Integer> tempStack;

        public sortedStack() {
            stack = new MyStack<>();
            tempStack = new MyStack<>();
        }

        public void push(Integer value){
            if(stack.isEmpty()){
                stack.push(value);
            }
            while(!stack.isEmpty()){
                if(stack.peek().intValue() > value){
                    stack.push(value);
                    break;
                }
                tempStack.push(stack.pop());
            }
            while(!tempStack.isEmpty()){
                stack.push(tempStack.pop());
            }

        }

        public Integer pop(){
            return stack.pop();
        }

        public Integer peek(){
            return stack.peek();
        }

        public boolean isEmpty(){
            return stack.isEmpty();
        }
    }
}
