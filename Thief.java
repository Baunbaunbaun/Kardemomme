public class Thief extends Person {

    public int injuryUntil = 0;
    KardemommeTown town;

    public Thief(KardemommeTown town, String name) {
        super(name);
        this.town = town;
    }

    //is thief hurt or not by aunt Sofie
    public boolean canPlay() {

        if (this.town.getDay() > this.injuryUntil) {
            this.setInjury(0);
            return true;
        } else {
            return false;
        }
    }

    //if caught by aunt Sofie
    public void setInjury(int days) {
        this.injuryUntil = days == 0 ? 0 : (days + this.town.getDay());
    }

    //required from super class
    public void steal(Person thief) {
    }

    @Override
    public String toString() {
        return ("Name: " + this.getName() + "\n Injured until day no. " + injuryUntil + "\n Belongings: " + getBelongings() + "\n");
    }
}
