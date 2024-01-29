import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Dealer class to deal cards to the player
 * 
 * @author Reece
 * @version Jan 23
 */
public class Dealer extends Actor
{
    private Deck deck;
    private ArrayList<Card> cardsOnBoard = new ArrayList<Card>();
    private ArrayList<Integer> selectedCardsIndex = new ArrayList<Integer>();
    private Card[] cardsSelected;
    private int numCardsInDeck;
    private int triplesRemaining;
    
    private Scorekeeper scorekeeper = new Scorekeeper();
    
    public Dealer(int numCardsInDeck)
    {
        this.numCardsInDeck = numCardsInDeck;
        
        this.triplesRemaining = numCardsInDeck / 3;
        
        this.deck = new Deck(numCardsInDeck);
        
        cardsSelected = new Card[3];
        
        
    }
    
    public void addedToWorld(World world)
    {
        dealBoard();
        setUI();
    }
    
    public void dealBoard()
    {
        Greenfoot.playSound("shuffle.wav");
        for (int x = 1; x <= 3; x++)
        {
            for (int y = 1; y <= 5; y++)
            {
                int xPos = (x - 1) * 130;
                int yPos = y * 80;
                
                getWorld().addObject(deck.getTopCard(), 80 + xPos, 20 + yPos);

            }
        }
    }
    
    public void setUI()
    {
        int cardsRemaining = deck.getNumCardsInDeck();
        getWorld().showText(String.valueOf(cardsRemaining), 312, 470);
        
        getWorld().showText(String.valueOf(scorekeeper.getScore()), 312, 505);
    }
    
    public void endGame()
    {
        
    }
    
    public void checkIfTriple()
    {
        
    }
    
    public void actionIfTriple()
    {
        
    }
    
    public void setCardsSelected(ArrayList<Card> cards, Card[] cardArray, ArrayList<Integer> integers)
    {
        
    }
}
