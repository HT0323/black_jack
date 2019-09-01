import java.util.ArrayList;
import java.util.List;
public class User extends Human{
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
}