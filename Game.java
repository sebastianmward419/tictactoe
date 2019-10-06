import java.util.concurrent.ThreadLocalRandom;
import java.io.*;
import java.util.Scanner;

public class Game {

    public static String     gameName    = "Tic-Tac-Toe";
    public static Board      board       = null;
    public static String     defaultANSI = "\u001B[0m";

    public static String[] rainbowColors = 
        {
         "\u001B[31m", "\u001B[32m", "\u001B[33m", "\u001B[34m", "\u001B[35m", "\u001B[36m", "\u001B[37m", 
         "\u001B[91m", "\u001B[92m", "\u001B[93m", "\u001B[94m", "\u001B[95m", "\u001B[96m", "\u001B[97m"
        };

    public static Player player1;
    public static Player player2;

    private static void initalizeGame (String gameName) {
         int gameNameLength = gameName.length ();

         for (int i = 0; i < gameNameLength; i++) {
             String randomColor = rainbowColors[randomNumberRanged(0, gameNameLength - 1)];
             System.out.print (randomColor + gameName.charAt (i));
         }
         System.out.print (defaultANSI + "\n");

         board = new Board ();
         board.createBoard (3, 3);
         board.placePiece (3, "x");
    }

    private static void initalizePlayers () { 
        player1 = new Player (1); 
        player1.init (); 
        player2 = new Player (2);
        player2.init ();
       
        player1.input.close ();
        player2.input.close ();
  
    }

    protected static int randomNumberRanged (int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
    public static void main (String args[]) {
        initalizeGame (gameName);
       // initalizePlayers ();


    }
}
