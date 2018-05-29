package CTCI.CH7.q7_8;

public class Othello
{
  private Piece[][] gameBoard;

  boolean currentPlayer = false;

  public Othello(){
    gameBoard = new Piece[8][8];
//    3,4
//    Inital board state
    gameBoard[3][4] = new Piece(Piece.Color.BLACK, 3, 4);
    gameBoard[4][3] = new Piece(Piece.Color.BLACK, 4, 3);
    gameBoard[3][3] = new Piece(Piece.Color.WHITE, 3, 3);
    gameBoard[4][4] = new Piece(Piece.Color.WHITE, 4, 4);
  }

  public void makeMove(int x, int y){
    Piece.Color currentPlayerColor = Piece.Color.BLACK;
    if(currentPlayer){
      currentPlayerColor = Piece.Color.WHITE;
    }
  }

  /**
   * This validates the move before committing it to the board
   * Reversi requries that the move be played around already played pieces
   * @param x location on the board
   * @param y location on the board
   * @return boolean on whether that was a valid move
   */
  public Boolean validMove(int x, int y){
    return false;
  }

  /**
   * This method will check the valid flips and reverse the pieces when played
   * This method will have access to the game board and be able to flip values if neccessary
   */
  public void validateFlips(){
//    if for each of the squares on board, there is a value then we call gameCompletion
    gameCompletion();
  }

  /**
   * This method will be called by validateFlips once it verifies that all game pieces has been played
   * and no more valid moves can occur
   * @return
   */
  public int[] gameCompletion(){
    return null;
  }
}
