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
        this.gameBoard[0][1] = piece;
    }
    
    public static void main (String args) {
        
    }
}