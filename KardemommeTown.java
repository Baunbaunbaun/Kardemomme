import java.util.HashMap;
import java.util.Random;

public class KardemommeTown {

    //empty array of citizens
    private Person[] citizens;

    //arry of thieves
    public Thief[] thieves;

    //array of recidents
    public Person[] recidents;

    //empty array of things in the shop
    private String[] listOfItems;

    public HashMap<Thief, Person> visits;

    public Boutique pawnbroker;

    //random generator
    private static Random random = new Random();


    public static void main(String[] args) {

        KardemommeTown town = new KardemommeTown();

        town.setup();

        town.simulate();

    }

    public void simulate() {

        //print status
        System.out.println("\n First dawn ... \n");
        for (int i = 0; i < this.citizens.length; i++) {
            System.out.println(this.citizens[i]);
        }

        //number of days to loot
        int lootDays = 7;

        //a week goes by of looting
        for (int days = 0; days < lootDays; days++) {
            System.out.println("Day no. " + days + "\n");


            //Every night, the thieves visit a random house (thieves 0,1,2, recidents 3,4,5)
            //this nights looting order

            System.out.println(thieves[0]);

            int rand = random.nextInt(3);
            Thief firstThief = this.thieves[rand % 3];
            Thief secondThief = this.thieves[(rand + 1) % 3];
            Thief thirdThief = this.thieves[(rand + 2) % 3];

            //Random thieves steals from random residents

        }

        System.out.println("\n A new dawn ... \n");
        for (int i = 0; i < citizens.length; i++) {
            System.out.println(this.citizens[i].getName() + " " + citizens[i].getBelongings());
        }

    }

    public void setup() {

        //citizens in Kardemomme Town
        Thief kasper = new Thief("Kasper");
        Thief jesper = new Thief("Jesper");
        Thief johnathan = new Thief("Johnathan");
        AuntSofie aunty = new AuntSofie("Aunt Sofie");
        OldTobias oldy = new OldTobias("Old Tobias");
        PolicemanBastian copper = new PolicemanBastian("Policeman Bastian");

        //array of citizens
        Person[] citizens = {kasper, jesper, johnathan, aunty, oldy, copper};
        this.citizens = citizens;

        //array of thieves
        Thief[] thieves = {kasper, jesper, johnathan};
        this.thieves = thieves;

        //array of recidents
        Person[] recidents = {aunty, oldy, copper};
        this.recidents = recidents;

        //shop with goods
        this.pawnbroker = new Boutique("Pawnbroker");

        //list of things in the shop
        this.listOfItems = this.pawnbroker.getBoutiquetItems();

        //distribute goods
        for (int item = 0; item < listOfItems.length; item++) {
            citizens[random.nextInt(6)].addBelongings(listOfItems[item]);
        }
    }

    public void randomVisits() {

        int firstThief = random.nextInt(thieves.length);

        //visits.putAll(, recidents);


        //visits.put(this.kasper, )

        for (int i = 0; i < thieves.length; i++) {
            visits.put(this.thieves[i], this.recidents[random.nextInt(recidents.length)]);
            System.out.println(visits.get(this.thieves[i]));
        }


    }
    public Boutique getPawnbroker() {
        return pawnbroker;
    }
}
