import greenfoot.*;
import java.util.*;

/**
 * Write a description of class Animations here.
 * 
 * @author Reece
 * 
 * @version Jan 16 24
 */
public class Animations  
{
    public static void wobble(ArrayList<Card> CardArray)
    {
        Greenfoot.playSound("wobble.wav");
    }
    
    public static void slideAndTurn(ArrayList<Card> CardArray)
    {
         Greenfoot.playSound("swoosh.wav");
    }
}
