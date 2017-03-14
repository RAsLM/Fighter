/**
 * Created by Ruslan on 07.03.2017.
 */
public class Fighter {
    private String name;
    private int health;
    private int strength;

    Fighter(String name){
        this.name = name;
        health = (int) (Math.random() * 80 + Math.random() * 120);
        strength = (int) (Math.random() * 5 + Math.random() * 15);
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getHealth() {
        return health;
    }

    public void kick(Fighter firstFighter){

    }
}
