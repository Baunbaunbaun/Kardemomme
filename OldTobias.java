import java.util.Random;

public class OldTobias extends Person {


    public OldTobias(String name) {
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
        System.out.println("loot Oldy: " + loot);
        return loot;
    }
}
