package labwork3;

public class Cow {
    private final String name;
    private final int age;
    private final String breed;

    public Cow(String name, int age) {
        this.name = name;
        this.age = age;
        this.breed = "cow";
    }

    public void moo() {
        System.out.println("Moo...!");
    }
}
