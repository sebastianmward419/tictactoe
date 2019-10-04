import java.util.concurrent.ThreadLocalRandom;
import java.io.*;
import java.util.Scanner;

public class Game {

    public static String     gameName    = "Tic-Tac-Toe";
    public static String[][] board       = null;
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

         board = new Board ().createBoard(3, 3);
    }

    private static void initalizeplayers () {
        Scanner input = new Scanner (System.in);
        String  player1Name;
        String  player2Name;
        int     player1Color;
        int     player2Color;

        System.out.print ("Player 1 enter a name: ");
        player1Name = input.next ();

        System.out.println ("Pick a color: \n 1. Blue \n 2. Yellow \n 3. Green \n 4. Red \n");
        
        player1Color = input.nextInt ();
        player1  = new Player (player1Name, getColor (player1Color));  
        System.out.println (player1.color + player1.name + " profile created");
        
       // player1 (player1Name, )
        
    }

    private static String getColor (int color) {
        switch (color) 
            {
                case 1: 
                    return "\u001B[34m";
                case 2: 
                    return "\u001B[93m";
                case 3: 
                    return "\u001B[92m";
                case 4: 
                    return "\u001B[91m";
                default:
                    return "\u001B[95m";
            }
    }

    protected static int randomNumberRanged (int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
    public static void main (String args[]) {
        initalizeGame (gameName);
        initalizeplayers();


    }
}
