import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Proccesses player actions
 * 
 * @author Reece
 * @version Jan 29 24
 */
public class Player extends Actor
{
    Dealer dealer;
    Card[] cardsSelected;
    ArrayList<Card> cardsOnBoard;
    ArrayList<Integer> selectedCardsIndex;
    
    Player(Dealer dealer)
    {
        this.dealer = dealer;
        cardsSelected = new Card[3];
    }
    
    public void act()
    {
        selectCards();
        
        boolean threeCardsHaveBeenSelected = setCardsSelected();
        
        if (threeCardsHaveBeenSelected)
        {
            dealer.setCardsSelected(cardsOnBoard, cardsSelected, selectedCardsIndex);
            
            dealer.checkIfTriple();
            
            resetCardsSelected();
        }
    }
    
    public void addedToWorld(World world)
    {
        cardsOnBoard = (ArrayList) getWorld().getObjects(Card.class);
    }
    
    private void selectCards()
    {
        for (int index = 0; index < cardsOnBoard.size(); index++)
        {
            Card card = cardsOnBoard.get(index);
            
            if (Greenfoot.mouseClicked(card))
            {
                card.setIsSelected(false);
                card.setImage(card.getCardImage());
                selectedCardsIndex.remove(index);
            }
            else
            {
                card.setIsSelected(true);
                card.setImage(card.getSelectedCardImage());
                selectedCardsIndex.add(index);
            }
        }
    }
    
    private void resetCardsSelected()
    {
        for (int index = 0; index < cardsOnBoard.size(); index++)
        {
           Card card = cardsOnBoard.get(index);
           
           card.setImage(card.getCardImage());
           
           card.setIsSelected(false);
        }
        
        selectedCardsIndex.clear();
    }
    
    private boolean setCardsSelected()
    {
        if (cardsSelected.length == 3)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
