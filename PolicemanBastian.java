import java.util.Iterator;
import java.util.Random;

public class PolicemanBastian extends Person {

    public PolicemanBastian() {
        super("Policeman Bastian");
    }

    public void steal(Person thief) {

        Random rand = new Random();

        if (0 == rand.nextInt(3)) {
            System.out.println("Caught by cop !!! mr. " + thief.getName());

            this.belongings.addAll(thief.getBelongings());

            thief.getBelongings().clear();
        } else {

            Iterator<String> iter = this.getBelongings().iterator();

            if (iter.hasNext()) {
                String loot = iter.next();
                getBelongings().remove(loot);
                thief.getBelongings().add(loot);

            }
        }
    }
}

