package CTCI.CH7.q7_6;

public class Puzzle
{
  private int height;
  private int width;
  private Piece[][] solutions_array;

  public Puzzle(int height, int width)
  {
    this.height = height;
    this.width = width;
    this.solutions_array = new Piece[width][height];
  }

  public Piece getPiece(int x, int y)
  {
    if (x < width - 1 && y < height - 1 && solutions_array[x][y] != null)
      return solutions_array[x][y];
    return null;
  }

  public void setPiece(Piece piece, int x, int y)
  {
    if (x < width - 1 && y < height - 1)
      this.solutions_array[x][y] = piece;
  }

  public boolean verifyPuzzle()
  {
    for (int x = 0; x < width; x++)
    {
      for (int y = 0; y < height; y++)
      {
        Piece currentPiece = solutions_array[x][y];
        Piece temp;
        Edge bottom = currentPiece.getBottom();
        Edge left = currentPiece.getLeft();
        Edge right = currentPiece.getRight();
        Edge top = currentPiece.getTop();
        if (x > 0)
        {
          temp = solutions_array[x - 1][y];
          if (temp.getLeft().equals(left))
            return false;
        }
        if (x < width)
        {
          temp = solutions_array[x + 1][y];
          if (temp.getRight().equals(right))
            return false;
        }
        if (y > 0)
        {
          temp = solutions_array[x][y - 1];
          if (temp.getTop().equals(top))
            return false;
        }
        if (y < height)
        {
          temp = solutions_array[x][y + 1];
          if (temp.getBottom().equals(bottom))
            return false;
        }
      }
    }
//    if it goes through all of the pieces then it should be a correct solution
    return true;
  }
}
