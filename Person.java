import java.util.HashSet;
import java.util.Random;

abstract public class Person {


    private String name;
    private Random random = new Random();
    private HashSet<String> belongings = new HashSet<String>();

    //constructor
    public Person(String name) {

        this.name = name;
    }

    //get name method
    public String getName() {
        return name;
    }

    public HashSet<String> getBelongings() {
        return belongings;
    }

    //add belonging method
    public void addBelongings(String item) {

        this.belongings.add(item);
    }

    //remove belonging method
    public void removeBelonging(String item) {

        //this.belongings.remove(this.random.nextInt(this.belongings.size()));

        this.belongings.remove(item);
    }

    public String steal() {

        String loot = "dust";
        String[] thingsToSteal = KardemommeTown.

                .getBoutiquetItems();

        Random random = new Random();

        //while (true) {

            loot = thingsToSteal[random.nextInt(getBelongings().size())];

            System.out.println(thingsToSteal);
            System.out.println("steal!");

            if (this.belongings.contains(loot)) {
                //break;
            }
        //}
        this.removeBelonging(loot);
        return loot;
    }
    @Override
    public String toString(){
        return ("Name: " + this.getName() + "\n Belongings: " + getBelongings() + "\n");
    }
}
