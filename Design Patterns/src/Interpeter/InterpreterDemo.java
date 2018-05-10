package Interpeter;

public class InterpreterDemo
{
//  This is our grammar here where we are only looking in the beginning for Lions
  static Expression buildInterpreterTree()
  {
//    Expression terminal1 = null;
//    This will be a terminal expression that is looking for Lions
    Expression terminal1 = new TerminalExpression("Lions");
//    These aren't being used right now in a compound expression
    Expression terminal2 = new TerminalExpression("Tigers");
    Expression terminal3 = new TerminalExpression("Bears");

//    Now we use the alterations of where we use our new expressions
//    Tigers and Bears
    Expression alternation1 = new AndExpression(terminal2, terminal3);
//    Lions or (Tigers and Bears)
    Expression alternation2 = new OrExpression(terminal1, alternation1);

//    return terminal1;

    return new AndExpression(terminal3, alternation2);
  }

  /**
   * main method - build the interpreter and then interpret a specific sequence
   * @param args
   */
  public static void main(String[] args)
  {
//    String context = "Lions";
//        String context = "Tigers";
    //    String context = "Bears";
//        String context = "Lions Tigers";
        String context = "Lions Bears";
//        String context = "Tigers Bears";

    Expression define = buildInterpreterTree();

    System.out.println(context + " is " + define.interpret(context));
  }
}
