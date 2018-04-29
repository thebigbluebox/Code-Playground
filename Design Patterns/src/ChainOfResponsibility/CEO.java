package ChainOfResponsibility;

public class CEO extends Handler
{
  @Override public void handleRequest(Request request)
  {
    //Need to make sure that we allow this to keep building on top, and not just stop at this.
    System.out.println("Approved By the CEO");
  }
}
