import java.util.ArrayList;
import java.util.List;
abstract class Human{
  protected ArrayList<Integer> myCards = new ArrayList<Integer>();
  abstract int open();
  abstract void setCard(ArrayList<Integer> cards);
  abstract boolean checkSum();
}