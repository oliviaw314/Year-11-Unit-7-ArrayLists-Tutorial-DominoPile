import java.util.ArrayList;
import java.util.Random;

public class DominoPile {
    private ArrayList<Domino> pile;

    public DominoPile() {
        pile = new ArrayList<Domino>();
    }

    public ArrayList<Domino> getPile() {
        return pile;
    }

    public void newStack6() {
        for (int i = 0; i <= 6; i++) {
            for (int j = i; j <= 6; j++) {
                pile.add(new Domino(i, j));
            }
        }
    }

    public void shuffle() {
        ArrayList<Domino> newPile = new ArrayList<Domino>();
        for (int i=0; i<=pile.size(); i++) {
            Random rand = new Random();
            int random = rand.nextInt(pile.size());
            Domino temp = pile.remove(random);
            newPile.add(temp); //remove has a return value
        }
        pile = newPile;
    }
}
