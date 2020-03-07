import java.util.ArrayList;

// A Purse holds a collection of Coins
public class Purse {
    private ArrayList coins;

    public Purse() {
        coins = new ArrayList();
    }

    // adds aCoin to the purse
    public void add(Coin aCoin) {
        coins.add(aCoin);
    }

    // returns total value of all coins in purse
    public double getTotal() {
        double sum = 0;
        for (int i = 0; i <= coins.size(); i++) {
            Coin myCoin = (Coin) coins.get(i);
            sum += myCoin.getValue();
        }
        return sum;
    }

    // (both myName & myValue)
    public int count(Coin aCoin) {
        for (int i = 0; i <= coins.size(); i++) {
            Coin myCoin = (Coin) coins.get(i);
        }
        return coin;
    }
}