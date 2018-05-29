package CTCI.CH7.q7_6;

public class Piece {
  private Edge top = null;
  private Edge left = null;
  private Edge bottom= null;
  private Edge right= null;

  public Piece(Edge top, Edge left, Edge bottom, Edge right){
    this.top = top;
    this.left = left;
    this.bottom = bottom;
    this.right = right;
  }

  public Edge getTop()
  {
    return top;
  }

  public void setTop(Edge top)
  {
    this.top = top;
  }

  public Edge getLeft()
  {
    return left;
  }

  public void setLeft(Edge left)
  {
    this.left = left;
  }

  public Edge getBottom()
  {
    return bottom;
  }

  public void setBottom(Edge bottom)
  {
    this.bottom = bottom;
  }

  public Edge getRight()
  {
    return right;
  }

  public void setRight(Edge right)
  {
    this.right = right;
  }

}
