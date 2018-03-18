package CTCI.CH3;

import dataStrucs.MyQueue;

public class q6 {
    public class Animal{
        private boolean isDog;
        private int sequence;

        public Animal(boolean isDog, int sequence) {
            this.isDog = isDog;
            this.sequence = sequence;
        }

        public boolean isDog() {
            return isDog;
        }

        public void setDog(boolean dog) {
            isDog = dog;
        }

        public int getSequence() {
            return sequence;
        }

        public void setSequence(int sequence) {
            this.sequence = sequence;
        }

    }

    private int sequence;
    private MyQueue<Animal> dogQueue;
    private MyQueue<Animal> catQueue;

    public q6(){
        dogQueue = new MyQueue<Animal>();
        catQueue = new MyQueue<Animal>();
        sequence = 0;
    }

    public void enqueue(Animal animal, boolean isDog){
        sequence +=1;
        animal.sequence = sequence;
        if(isDog) dogQueue.add(animal);
        else catQueue.add(animal);
    }

    public Animal dequeue(){
        if(dogQueue.peek().sequence > catQueue.peek().sequence) return dogQueue.remove();
        else return catQueue.remove();

    }

    public Animal dequeue(boolean isDog){
        if(isDog) return dogQueue.remove();
        else return catQueue.remove();
    }
}
