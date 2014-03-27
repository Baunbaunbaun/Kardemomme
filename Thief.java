/**
 * Created by baunbaun on 20/03/14.
 */
public class Thief extends Person {


    public boolean canStealOrNot = true;
    public int injury = 4;

    public Thief(String name) {
        super(name);
    }

    public void setCanStealOrNot(boolean canStealOrNot) {
        this.canStealOrNot = canStealOrNot;
    }

    public boolean getCanStealOrNot() {

        if (this.injury != 4) {
            this.injury -= 1;

            if (this.injury == 0) {
                this.injury = 4;
                canStealOrNot = true;
            }
        }
        return this.canStealOrNot;

    }

    public void caughtByCop(Person cop) {

        //while (this.getBelongings().size() != 0){
            cop.addBelongings(this.steal());
            System.out.println("caught!");
        //}

        //take all thieves items
        this.getBelongings().clear();

    }
    @Override
    public String toString(){
        return ("Name: " + this.getName() + "\n can steal?" + this.getCanStealOrNot() + "\n Injury :" + injury + "\n Belongings: " + getBelongings() + "\n");
    }
}
