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
        Iterator<String> iterOne = thief.getBelongings().iterator();

        if (0 == rand.nextInt(3)) {
            System.out.println("Caught by cop !!! mr. " + thief.getName());

            for (int i = 0; i < thief.belongings.size(); i++) {

                if (iterOne.hasNext()) {
                    this.town.getResident(0).belongings.add(iterOne.next());
                }
                if (iterOne.hasNext()) {
                    this.belongings.add(iterOne.next());
                }
            }
            thief.getBelongings().clear();
        } else

        {
            Iterator<String> iterTwo = this.getBelongings().iterator();

            if (iterTwo.hasNext()) {
                String loot = iterTwo.next();
                getBelongings().remove(loot);
                thief.getBelongings().add(loot);
            }
        }
    }
}

