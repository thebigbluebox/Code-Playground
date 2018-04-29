package Command;

public class CommandEverydayDemo
{
  public static void main(String[] args)
  {
    Task task1 = new Task(10, 12); //encapsulates request
    Task task2 = new Task(11, 13);

    Thread thread1 = new Thread(task1);
    // invoker as the start is completely decoupled from the caller
    // The caller doesn't need to care about that it started the action
    thread1.start();

    Thread thread2 = new Thread(task2);
    thread2.start();
  }
}

// Runnable is the example of the command pattern/ interface
class Task implements Runnable
{
  int num1;
  int num2;

  Task(int num1, int num2)
  {
    this.num1 = num1;
    this.num2 = num2;
  }

  @Override
  public void run()
  { //Executes the command

    //Reciever can be another class, but the reciever in our case is the console
    System.out.println(num1 * num2);
  }
}