package methods_encapsulation.representation_invariants;

/**
 *
 * @author ayoubfalah
 */
public class TestCardHand 
{
    public static void main(String[] args) 
    {
        Card[] cards = new Card[2];
        cards[0] = new Card(1);
        cards[1] = new Card(2);        
        CardHand cardHand = new CardHand(cards);
        System.out.println("Hand value: " + cardHand.handValue);
        
        // Violating the representaion invariant
        cardHand.handValue = 4;
        System.out.println("Hand value: " + cardHand.handValue);
        
    }

}
