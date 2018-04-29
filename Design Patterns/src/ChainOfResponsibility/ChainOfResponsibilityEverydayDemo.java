package ChainOfResponsibility;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChainOfResponsibilityEverydayDemo
{
  private static final Logger logger = Logger.getLogger(ChainOfResponsibilityEverydayDemo.class.getName());

  public static void main(String[] args)
  {
    //level to log at this is the handler level
    logger.setLevel(Level.FINER);

    //now we have a new handler for console handler
    ConsoleHandler handler = new ConsoleHandler();
    //level to publish at, our chain ends at finer
    handler.setLevel(Level.FINER);
    logger.addHandler(handler);

    logger.finest("Finest level of logging");
    logger.finer("Finer level, but not as fine as finest");
    logger.fine("Fine, but not as fine as finer or finest");
  }
}
