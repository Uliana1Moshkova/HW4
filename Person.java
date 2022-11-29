package cafe;

public abstract class Person implements Nameable {


    public void setName(String name) {
        this.name = name;
    }

    private String name;


    public String getName() {
        return name;
    }

    public abstract void Hi();

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public abstract void mood();
}
