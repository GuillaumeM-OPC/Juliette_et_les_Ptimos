/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import Poker.BestHand;
import Poker.Deck;
import Poker.Card;
import Poker.Hands;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testPair() {
        Hands bestHand = BestHand.besthand(combination(new String[]{"c9","dk","s1","hq","h1"}));
        if (bestHand != null) assertEquals("Pair", bestHand.getName());
        else assertEquals("", "No hand");
    }
    @Test public void testTwoPair() {
        Hands bestHand = BestHand.besthand(combination(new String[]{"s1","dk","c6","hk","c1"}));
        if (bestHand != null) assertEquals("TwoPair", bestHand.getName());
        else assertEquals("", "No hand");
    }
    @Test public void testThreeOfAKind() {
        Hands bestHand = BestHand.besthand(combination(new String[]{"sk","c1","hk","dk","d5"}));
        if (bestHand != null) assertEquals("ThreeOfAKind", bestHand.getName());
        else assertEquals("", "No hand");
    }
    @Test public void testStraight() {
        Hands bestHand = BestHand.besthand(combination(new String[]{"h3","d4","s1","c2","d5"}));
        if (bestHand != null) assertEquals("Straight", bestHand.getName());
        else  assertEquals("", "No hand");
    }
    @Test public void testStraightAce() {
        Hands bestHand = BestHand.besthand(combination(new String[]{"dk","c10","s1","dq","hj"}));
        if (bestHand != null) assertEquals("Straight", bestHand.getName());
        else assertEquals("", "No hand");
    }
    @Test public void testFlush() {
        Hands bestHand = BestHand.besthand(combination(new String[]{"s8","s3","s5","s2","sk"}));
        if (bestHand != null) assertEquals("Flush", bestHand.getName());
        else assertEquals("", "No hand");
    }
    @Test public void testFullHouse() {
        Hands bestHand = BestHand.besthand(combination(new String[]{"s4","hq","cq","c4","sq"}));
        if (bestHand != null) assertEquals("FullHouse", bestHand.getName());
        else assertEquals("", "No hand");
    }
    @Test public void testFourOfAKind() {
        Hands bestHand = BestHand.besthand(combination(new String[]{"s4","hq","cq","dq","sq"}));
        if (bestHand != null) assertEquals("FourOfAKind", bestHand.getName());
        else assertEquals("", "No hand");
    }
    @Test public void testStraightFlush() {
        Hands bestHand = BestHand.besthand(combination(new String[]{"s4","s5","s6","s7","s8"}));
        if (bestHand != null) assertEquals("StraightFlush", bestHand.getName());
        else assertEquals("", "No hand");
    }
    @Test public void testRoyalFlush() {
        Hands bestHand = BestHand.besthand(combination(new String[]{"sj","s10","s1","sk","sq"}));
        if (bestHand != null) assertEquals("RoyalFlush", bestHand.getName());
        else assertEquals("", "No hand");
    }
    public Card[] combination(String[] values) {
        Deck deck = Deck.getInstance();
        Card[] cards = new Card[5];
        cards[0] = deck.getCard(values[0]);
        cards[1] = deck.getCard(values[1]);
        cards[2] = deck.getCard(values[2]);
        cards[3] = deck.getCard(values[3]);
        cards[4] = deck.getCard(values[4]);
        deck.addCardToDeck(cards);
        return cards;
    }
}