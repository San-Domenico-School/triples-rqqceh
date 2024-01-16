import greenfoot.*;

/**
 * Write a description of class Scorekeeper here.
 * 
 * @author Reece
 * @version Jan 16 24
 */
public class Scorekeeper  
{
    

    private static int deckSize;
    private static int score;
    private static long startTime =  System.currentTimeMillis();
    
    public static void setDeckSize(int newDeckSize)
    {
        deckSize = newDeckSize;
    }
    
    public static void updateScore()
    {
        score++;
    }
    
    public static int getScore()
    {
        return score;
    }
}
