package CTCI.CH7;

import java.util.Iterator;

public class q7_9<T> implements Iterable<T>
{
  T data[];
  int rotatedIndex = 0;
  public q7_9(T data[]){
    this.data = data;
  }

  public void rotate(int rotatedIndex){
    this.rotatedIndex = rotatedIndex;
  }

  @Override public Iterator<T> iterator()
  {
    Iterator<T> it = new Iterator<T>(){
      private int currentIndex = rotatedIndex;
      @Override

      public boolean hasNext() {
        if (currentIndex + 1 == rotatedIndex)
          return false;
        return (currentIndex < data.length || currentIndex < rotatedIndex) && data[currentIndex] != null;
      }

      @Override
      public T next() {
        if(currentIndex + 1 >= data.length){
          currentIndex = 0;
          return data[currentIndex];
        }
        return data[currentIndex++];
      }

      @Override
      public void remove() {
        throw new UnsupportedOperationException();
      }
    };
    return it;
  }
}
