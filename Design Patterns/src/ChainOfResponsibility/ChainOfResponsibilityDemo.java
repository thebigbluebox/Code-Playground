package ChainOfResponsibility;

public class ChainOfResponsibilityDemo
{
  public static void main(String[] args){
    Director bryan = new Director();
    VP crystal = new VP();
    CEO jeff = new CEO();

    // if Bryan cannot approve crystal will take on this
    bryan.setSuccessor(crystal);
    crystal.setSuccessor(jeff);

    Request request = new Request(RequestType.CONFERENCE, 500);
    bryan.handleRequest(request);

    request = new Request(RequestType.PURCHASE, 1000);
    //below we can either swap it with bryan or crystal, as in the demo we show that VP still ended up being called
    bryan.handleRequest(request);

    request = new Request(RequestType.PURCHASE, 2000);
    bryan.handleRequest(request);

  }
}
