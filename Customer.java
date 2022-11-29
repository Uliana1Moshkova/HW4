package cafe;

public class Customer extends Person implements Nameable {

    public int num_of_cups;


    @Override
    public String toString() {
        return "Customer{" +
                "num_of_cups=" + num_of_cups +
                '}';
    }

    @Override
    public void mood() {
        
    }

    @Override
    public void Hi() {
        System.out.println("I'd like two americans please");
    }


    @Override
    public String name() {
        return null;
    }
}
