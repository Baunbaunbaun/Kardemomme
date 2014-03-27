import java.util.Random;

/**
 * Created by baunbaun on 20/03/14.
 */
public class PolicemanBastian extends Person {

    public PolicemanBastian(String name){
        super(name);
    }
    public String steal() {

        String loot = "dust";
        String[] thingsToSteal = KardemommeTown.pawnbroker.getBoutiquetItems();

        Random random = new Random();

        while (!this.getBelongings().contains(loot)) {
            loot = thingsToSteal[random.nextInt(thingsToSteal.length)];
        }
        this.removeBelonging(loot);
        System.out.println("loot Cop: " + loot);
        return loot;
    }
}

