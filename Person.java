import java.util.HashSet;

abstract public class Person {

    private String name;
    protected HashSet<String> belongings = new HashSet<String>();

    //constructor
    public Person(String name) {
        this.name = name;
    }

    //get name method
    public String getName() {
        return this.name;
    }

    public HashSet<String> getBelongings() {
        return this.belongings;
    }

    abstract public void steal(Person p);

    @Override
    public String toString() {
        return ("Name: " + this.name + "\n Belongings: " + this.belongings + "\n");
    }
}
