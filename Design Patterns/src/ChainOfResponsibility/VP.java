package ChainOfResponsibility;

public class VP extends Handler
{
  @Override public void handleRequest(Request request)
  {
    if (request.getAmount() <= 1000 || request.getRequestType() == RequestType.CONFERENCE)
    {
      System.out.println("This Request is approved by the VP");
    }
    else
    {
      successor.handleRequest(request);
    }
  }
}
