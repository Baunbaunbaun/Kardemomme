public class Thief extends Person {

    public int injuryUntil = 0;

    public Thief(String name) {
        super(name);
    }

    //is thief hurt or not by aunt Sofie
    public boolean canPlay() {

        if (KardemommeTown.day > this.injuryUntil) {
            this.setInjury(0);
            return true;
        } else {
            return false;
        }
    }

    //if caught by aunt Sofie
    public void setInjury(int days) {
        this.injuryUntil = days == 0 ? 0 : (days + KardemommeTown.day);
    }

    //required from super class
    public void steal(Person thief) {
    }

    @Override
    public String toString() {
        return ("Name: " + this.getName() + "\n InjuryUntil: " + injuryUntil + "\n Belongings: " + getBelongings() + "\n");
    }
}
