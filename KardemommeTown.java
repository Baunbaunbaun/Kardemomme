import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class KardemommeTown {

    public ArrayList<Person> recidents;
    public ArrayList<Thief> thieves;
    public Boutique boutique = new Boutique("Pawnbroker");
    public static int day = 0;

    public KardemommeTown() {

        //this.recidents = new Person[]{new AuntSofie(), new OldTobias(), new PolicemanBastian()};
        Person[] recidents = new Person[]{new OldTobias(), new AuntSofie(), new PolicemanBastian()};
        Thief[] thieves = new Thief[]{new Thief("Kasper"), new Thief("Jesper"), new Thief("Johnathan")};

        this.recidents = new ArrayList<Person>(Arrays.asList(recidents));
        this.thieves = new ArrayList<Thief>(Arrays.asList(thieves));
        //this.thieves = new Thief[]{new Thief("Kasper"), new Thief("Jesper"), new Thief("Johnathan")};
    }

    public static void main(String[] args) {

        KardemommeTown town = new KardemommeTown();

        town.setup();

        town.simulate(7);

    }

    public void simulate(int days) {

        //print status
        System.out.println("\n First dawn ... \n");
        for (int i = 0; i < this.thieves.size(); i++) {
            System.out.println(this.thieves.get(i));
        }

        for (int i = 0; i < this.recidents.size(); i++) {
            System.out.println(this.recidents.get(i));
        }

        //a week goes by of looting
        for (int n = 0; n <= days; n++) {
            System.out.println("Day no. " + (n + 1) + "\n");
            Collections.shuffle(thieves);
            Collections.shuffle(recidents);

            for (int i = 0; i < recidents.size(); i++) {
                if (thieves.get(i).canPlay()) {
                    recidents.get(i).steal(thieves.get(i));
                }
                System.out.println(recidents.get(i));
                System.out.println(thieves.get(i));
            }
            this.day++;
        }
/*
        System.out.println("\n A new dawn ... \n");
        for (int i = 0; i < citizens.length; i++) {
            System.out.println(this.citizens[i].getName() + " " + citizens[i].getBelongings());
        }*/

    }

    public void setup() {

        ArrayList<String> items = this.boutique.getBoutiquetItems();

        ArrayList<Person> citizens = new ArrayList();
        citizens.addAll(this.thieves);
        citizens.addAll(this.recidents);

        //distribute goods
        for (int i = 0; i < items.size(); i++) {
            citizens.get(i % citizens.size()).getBelongings().add(items.get(i));
        }
    }

    /*public void randomVisits() {

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
    }*/
}
