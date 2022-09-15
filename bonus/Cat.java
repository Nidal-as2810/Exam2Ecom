package bonus;

public class Cat extends LandAnimal {
    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    private Dog enemy;

    public Dog getEnemy() {
        return enemy;
    }

    public void setEnemy(Dog enemy) {
        this.enemy = enemy;
    }

    public Cat(Dog enemy) {
        this.enemy = enemy;
    }
}
