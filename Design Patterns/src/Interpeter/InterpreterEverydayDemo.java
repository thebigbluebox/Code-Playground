package Interpeter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InterpreterEverydayDemo
{
  public static void main(String[] args)
  {
    // Our sentence that conforms to the language that we set
    String input = "Lions, and tigers, and bears! Oh, my!";

    // Now we define our pattern which is a regular expression, our grammar here is very specific and case specific
    Pattern p = Pattern.compile("(lion|cat|dog|wolf|bear|human|tiger|liger|Lion)");
    Matcher m = p.matcher(input);

    while(m.find())
    {
      System.out.println("Found a " + m.group() + ".");
    }
  }
}
