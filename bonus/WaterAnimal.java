package bonus;

public abstract class WaterAnimal implements Animal{
    private String name;
    private String family;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WaterAnimal(String name, String family) {
        this.name = name;
        this.family = family;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void swimTo(){
        System.out.println("I'm swimming all the time");
    }
}
