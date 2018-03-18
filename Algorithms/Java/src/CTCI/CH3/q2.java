package CTCI.CH3;

import java.util.EmptyStackException;

public class q2 {
    private static class StackNode{
        private Integer data;
        private Integer minData;
        private StackNode next;

        public StackNode(Integer data)
        {
            this.data = data;
            this.minData = data;
        }

        private StackNode top;

        public Integer pop()
        {
            if(top == null) throw new EmptyStackException();
            Integer item = top.data;
            top = top.next;
            return item;
        }

        public void push (Integer item)
        {
            StackNode itemNode = new StackNode(item);
            itemNode.next = top;

            if(item.intValue() < itemNode.next.data.intValue()){
                minData = item;
            }
            else
            {
                minData = itemNode.next.minData;
            }
            top = itemNode;
        }

        public Integer peek()
        {
            if(top == null) throw new EmptyStackException();
            return top.data;
        }

        public boolean isEmpty()
        {
            return top == null;
        }

        public Integer minimum()
        {
            return top.minData;
        }

    }
}
