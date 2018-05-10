package Interpeter;
import java.util.StringTokenizer;
/**
 * This class will be where we evaluate our terminal expressions, this is the end of the train of where the evaluation will be built
 */
public class TerminalExpression implements Expression
{
  private String data;

  public TerminalExpression(String data)
  {
    this.data = data;
  }

  /**
   * This is a very base level regex where we tokenize each string and then
   * run it through and check if the current String matches any of the value we are looking for
   * @param str
   * @return
   */
  public boolean interpret(String str)
  {
    StringTokenizer st = new StringTokenizer(str);
    while(st.hasMoreTokens()){
      String test = st.nextToken();
      if(test.equals(data)){
        return true;
      }
    }
    return false;
  }
}
