package bonus;

public class GoldFish extends WaterAnimal{
    public GoldFish(String name, String family) {
        super(name, family);
    }

    @Override
    public void eat() {
        System.out.println("I eat smaller fishes! yam yam");
    }

    @Override
    public void sleep() {
        System.out.println("I sleep while swimming! zzzzz");
    }

    @Override
    public void swimTo(){
        super.swimTo();
        System.out.println("I swim as long as i want!");
    }
}
