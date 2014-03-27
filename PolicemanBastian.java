import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class PolicemanBastian extends Person {

    public PolicemanBastian() {
        super("Policeman Bastian");
    }

    public void steal(Person thief) {

        Random rand = new Random();

        if (0 == rand.nextInt(3)) {
            System.out.println("Caught by cop !!! " + thief.getName());

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
/*
        String loot = "dust";
        String[] thingsToSteal = KardemommeTown.pawnbroker.getBoutiquetItems();

        Random random = new Random();

        while (!this.getBelongings().contains(loot)) {
            loot = thingsToSteal[random.nextInt(thingsToSteal.length)];
        }
        this.removeBelonging(loot);
        System.out.println("loot Cop: " + loot);
        return loot;
    }*/
}

