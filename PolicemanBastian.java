import java.util.Iterator;
import java.util.Random;


public class PolicemanBastian extends Person {

    public KardemommeTown town;

    public PolicemanBastian(KardemommeTown town) {

        super("Policeman Bastian");
        this.town = town;
    }

    public void steal(Person thief) {

        Random rand = new Random();
        Iterator<String> iter = thief.getBelongings().iterator();

        if (0 == rand.nextInt(3)) {
            System.out.println("Caught by cop !!! mr. " + thief.getName());

            for (int i = 0; i < thief.belongings.size(); i++) {

                if (iter.hasNext()) {
                    this.town.getResident(0).belongings.add(iter.next());
                }
                if (iter.hasNext()) {
                    this.belongings.add(iter.next());
                }
            }
            thief.getBelongings().clear();
        } else

        {
            if (iter.hasNext()) {
                String loot = iter.next();
                getBelongings().remove(loot);
                thief.getBelongings().add(loot);
            }
        }
    }
}

