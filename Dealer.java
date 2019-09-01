import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class Dealer extends Human {
  protected ArrayList<Integer> cards = new ArrayList<Integer>();
  public int open() {
    int sumMyCards = 0;
    for(Integer value : myCards) {
      sumMyCards += value;
    }
    return sumMyCards;

  }
  public void setCard(ArrayList<Integer> cards) {
    for(Integer value : cards) {
      this.myCards.add(value);
    }
    
  }
  public boolean checkSum() {
    boolean answer = false;
    int sumMyCards = 0;
    for(Integer value : myCards) {
      sumMyCards += value;
    }
    if (sumMyCards < 16) {
      answer = true;
    }
    return answer;
  }
  public Dealer(){
    for(int i = 0; i < 4; i++) {
      cards.add(1);
      cards.add(2);
      cards.add(3);
      cards.add(4);
      cards.add(5);
      cards.add(6);
      cards.add(7);
      cards.add(8);
      cards.add(9);
      cards.add(10);
      cards.add(11);
      cards.add(12);
      cards.add(13);
    }
    Collections.shuffle(cards);
  }
  public ArrayList<Integer> deal(ArrayList<Integer> cards) {
    ArrayList<Integer> returnCards = new ArrayList<Integer>();
    returnCards.add(cards.get(0));
    returnCards.add(cards.get(1));
    cards.remove(0);
    cards.remove(1);
    return returnCards;
  }

   public ArrayList<Integer> hit(ArrayList<Integer> cards) {
    ArrayList<Integer> returnCards = new ArrayList<Integer>();
    returnCards.add(cards.get(0));
    cards.remove(0);
    return returnCards;
  }
  
}