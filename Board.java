public class Board {
    
    String[][] createBoard (int columns, int rows) {
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

        return board;
    }
    
    public static void main (String args) {
        
    }
}