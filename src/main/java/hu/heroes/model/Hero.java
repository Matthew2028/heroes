package hu.heroes.model;

import java.util.Arrays;
import java.util.List;

public class Hero {
    private int attack;
    private int defense;
    private int magic;
    private int knowledge;
    private int moral;
    private int luck;
    private List<Magic> magics;
    private List<Unit> units;

    public Hero() {
        this.attack = 1;
        this.defense = 1;
        this.magic = 1;
        this.knowledge = 1;
        this.moral = 1;
        this.luck = 1;
        this.magics = Arrays.asList(
                new Magic("thunderStrike", 60, 5),
                new Magic("fireball", 120, 9),
                new Magic("revive", 120, 6),
                new Magic("froze", 80, 6),
                new Magic("arcanePower", 150, 10)
        );
        this.units = Arrays.asList(
                //new Unit("Földműves", 3, 3, 3)
        );
    }

    public List<Magic> getMagics() {
        return this.magics;
    }

    public void enchant() {

    }
}
