package hu.heroes.model;

public class Unit {
    private String name;
    private int price;
    private int damage;
    private int health;
    private int speed;
    private int move;
    private UnitTalent talent;

    public Unit(String name, int price, int damage, int health, int speed, int move, UnitTalent talent) {
        this.name = name;
        this.price = price;
        this.damage = damage;
        this.health = health;
        this.speed = speed;
        this.move = move;
        this.talent = talent;
    }
}
