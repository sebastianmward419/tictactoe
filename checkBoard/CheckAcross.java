public class CheckAcross implements Runnable {

    protected String[][] gameBoard = null;
    
    public boolean win = false;

    public CheckAcross (String[][] gameBoard) {
        this.gameBoard = gameBoard;
    }


    public void run () {
        for (int i = 0; i < gameBoard.length; i++) {
        if (gameBoard[i][0] == gameBoard[i][1] && gameBoard[i][1] == gameBoard[i][2]) {
            win  = true;
        }
        }
    }
    public static void main (String[] args) {

    }
}