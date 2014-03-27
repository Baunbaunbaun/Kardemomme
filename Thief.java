/**
 * Created by baunbaun on 20/03/14.
 */
public class Thief extends Person {

    public int injuryUntil = 0;

    public Thief(String name) {
        super(name);
    }

    public String steal() {
        return null;
    }
    public boolean canPlay(){
        return KardemommeTown.day >= this.injuryUntil;
    }
    public void setInjury(int days){
        this.injuryUntil = days + KardemommeTown.day;
    }

    /*public void setCanStealOrNot(boolean canStealOrNot) {
        this.canStealOrNot = canStealOrNot;
    }

    public boolean getCanStealOrNot() {

        if (this.injury != 0) {
            this.injury--;
            if (this.injury == 0) {
                this.injury = 4;
                canStealOrNot = true;
            }
        }
        return this.canStealOrNot;
    }*/

    public void caughtByCop(Person cop) {

        while (this.getBelongings().size() != 0) {
            cop.getBelongings().add(this.steal());
            System.out.println("caught!");
        }
        //take all thieves items
        this.getBelongings().clear();
    }
    public void steal(Person otherThief){

    }

    @Override
    public String toString() {
        return ("Name: " + this.getName() + "\n Belongings: " + getBelongings() + "\n");
    }
}
