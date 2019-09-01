public class BlackJack{
  public static void main(String[] args){
    System.out.println("*******ブラックジャックを始めます!*******");
    Dealer dealer = new Dealer();
    User user = new User();
    user.setCard(dealer.deal(dealer.cards));
    dealer.setCard(dealer.deal(dealer.cards));
    System.out.println("あなたの引いた1枚めのカードは" + user.myCards.get(0) + "です。");
    System.out.println("あなたの引いた2枚めのカードは" + user.myCards.get(1) + "です。");
    System.out.println("ディーラーの引いた１枚めのカードは" + dealer.myCards.get(0) + "です。");
    System.out.println("ディーラーの引いた2枚めのカードは?です。");
    System.out.println("あなたの手札の合計点は" + user.open() + "です。");
    if (user.open() >= 21 && dealer.open() >= 21) {
      System.out.println("双方バーストしたため、ディーラーの勝ちです!!!!");
    } else if (user.open() >= 21) {
      System.out.println("あなたがバーストしたため、ディーラーの勝ちです!!!!");
    } else if (dealer.open() >= 21) {
      System.out.println("ディーラーがバーストしたため、あなたの勝ちです!!!!");
    }
    int count = 3;
    while(dealer.checkSum() == true) {
    dealer.setCard(dealer.hit(dealer.cards));
      System.out.println("ディーラーの引いた" + count + "枚めのカードは" + dealer.myCards.get(count - 2) + "です。");
      count++;
    }
    System.out.println("ディーラーの手札の合計点は" + user.open() + "です。");
    if (user.open() > dealer.open()) {
      System.out.println("あなたの勝ちです!!!!");
    } else if (user.open() < dealer.open()) {
      System.out.println("ディーラーの勝ちです!!!!");
    } else {
      System.out.println("引き分けです!!!!");
    }
    
  }
}