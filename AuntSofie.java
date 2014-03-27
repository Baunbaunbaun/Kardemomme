import java.util.Iterator;
import java.util.Random;

public class AuntSofie extends Person {

    public AuntSofie() {
        super("aunt Sofie");
    }

    public void steal(Person thief) {

        Random rand = new Random();

        if (0 == rand.nextInt(3)) {
            System.out.println("It's hammer time!!!! " + thief.getName());
            ((Thief) thief).setInjury(3);
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
