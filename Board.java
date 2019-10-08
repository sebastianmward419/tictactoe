import java.util.Arrays;

public class Board {

    public String[][] gameBoard = null;
    
    public void createBoard (int columns, int rows) {
        String[][] board = new String[columns][rows];

        for (int i = 0; i < board.length; i++) {
            System.out.println ((i == 0) ? "\u001B[96m" + "------------" : "\u001B[96m" + "\n------------");

            for (int j = 0; j < board[i].length; j++) {
                System.out.print ("\u001B[97m" + "|  |");
                board[i][j] = "";
            }
        }
        System.out.println ("\n------------");
        System.out.print ("\u001B[0m");

        this.gameBoard = board;
    }

    public void placePiece (int position, String piece) {
        int count = 0;

        for (int i = 0; i < this.gameBoard.length; i++) {
            for (int j = 0; j < this.gameBoard[i].length; j++) {
                count++;
                if (count == position) {
                    this.gameBoard[i][j] = piece;
                }
            }
        }

        showMatrix ();
    }

    protected void showMatrix () {
        for (int i = 0; i < gameBoard.length; i++) {
            System.out.println (Arrays.toString (gameBoard[i]));
        }
    }
    
    public static void main (String args) {
        
    }
}