import java.util.Iterator;

public class OldTobias extends Person {

    public OldTobias() {
        super("Old Tobias");
    }

    public void steal(Person thief) {

        Iterator<String> iter = this.getBelongings().iterator();

        if (iter.hasNext()) {
            String loot = iter.next();
            getBelongings().remove(loot);
            thief.getBelongings().add(loot);
        }
    }
}
