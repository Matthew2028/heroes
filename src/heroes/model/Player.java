package heroes.model;

public class Player {
    private int gold;
    private int mana;

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public Player(Difficulty difficulty) {
        switch (difficulty) {
            case EASY -> setGold(1300);
            case NORMAL -> setGold(1000);
            case HARD -> setGold(700);
        }
    }
}
