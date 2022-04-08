package heroes.model;

public class Hero {
    private int attack = 1;
    private int defense = 1;
    private int magic = 1;
    private int knowledge = 1;
    private int moral = 1;
    private int luck = 1;

    public void errorMsg(){
        System.err.println("A megadott szam nem helyes!");
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        if (attack <= 10 && attack >= 1)
            this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        if (defense <= 10 && defense >= 1)
            this.defense = defense;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        if (magic <= 10 && magic >= 1)
            this.magic = magic;
    }

    public int getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(int knowledge) {
        if (knowledge <= 10 && knowledge >= 1)
            this.knowledge = knowledge;
    }

    public int getMoral() {
        return moral;
    }

    public void setMoral(int moral) {
        if (moral <= 10 && moral >= 1)
            this.moral = moral;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        if(luck <= 10 && luck >= 1)
            this.luck = luck;
    }
}
