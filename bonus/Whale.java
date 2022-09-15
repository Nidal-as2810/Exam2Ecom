package bonus;

public class Whale extends WaterAnimal{
    public Whale(String name, String family) {
        super(name, family);
    }

    @Override
    public void eat() {
        System.out.println("I eat literally everything! ^_^");
    }

    @Override
    public void sleep() {
        System.out.println("I sleep deep down, zzzzzzzzzzz!");
    }

    @Override
    public void swimTo(){
        System.out.println("I Swim from ocean to another! ^_^");
    }
}
