package methods_encapsulation.representation_invariants;

/**
 *
 * @author ayoubfalah
 */
public class CardHand 
{
    public Card[] cards;
    public int handValue;

    public CardHand(Card... cards)
    {
        this.cards = cards;
        for (Card card : cards)
            handValue += card.getVal();
    }
    
    private int getVal()
    {
        return  handValue;
    }
}
