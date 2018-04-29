package ChainOfResponsibility;

public class Director extends Handler
{
  @Override
  public void handleRequest(Request request)
  {
    // As a director we can approve conferences
    if(request.getRequestType() == RequestType.CONFERENCE) {
      System.out.println("Directors can approve conferences");
    } else {
      // else we have to give the request to our next
      successor.handleRequest(request);
    }
  }
}
