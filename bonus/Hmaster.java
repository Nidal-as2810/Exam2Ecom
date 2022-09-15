package bonus;

import java.util.ArrayList;

public class Hmaster extends LandAnimal{
    @Override
    public void eat() {
        System.out.println("I eat carrots!");
    }

    @Override
    public void sleep() {
        System.out.println("I sleep all night time! ");
    }

    private Cat enemy;

    public Hmaster(Cat enemy) {
        this.enemy = enemy;
    }

    public Cat getEnemy() {
        return enemy;
    }

    public void setEnemy(Cat enemy) {
        this.enemy = enemy;
    }
}
