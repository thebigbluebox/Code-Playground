package CTCI.CH7.q7_8;

/**
 * Should really consider making a factory pattern for this question
 * Which will make it easier to create the different pieces and keep track
 */
public class Piece
{
  public enum Color
  {
    BLACK,
    WHITE
  }

  private Color color;
  private int x;
  private int y;

//  public static Piece getNewPiece(Color color, int x, int y){
//    return new Piece(color,)
//  }

  public Piece(Color color, int x, int y)
  {
    this.color = color;
    this.x = x;
    this.y = y;
  }

  public int getX(){
    return x;
  }

  public int getY()
  {
    return y;
  }

  public void setX(int x)
  {
    this.x = x;
  }

  public void setY(int y)
  {
    this.y = y;
  }

  public void setColor(Color color)
  {
    this.color = color;
  }

  public Color getColor()
  {
    return color;
  }
}
