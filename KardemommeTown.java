import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class KardemommeTown {

    public ArrayList<Person> residents;
    public ArrayList<Thief> thieves;
    public Boutique boutique = new Boutique();
    public static int day = 1;

    public KardemommeTown() {

        Person[] residents = new Person[]{new OldTobias(), new AuntSofie(), new PolicemanBastian()};
        Thief[] thieves = new Thief[]{new Thief("Kasper"), new Thief("Jesper"), new Thief("Johnathan")};

        //from array to array list
        this.residents = new ArrayList<Person>(Arrays.asList(residents));
        this.thieves = new ArrayList<Thief>(Arrays.asList(thieves));
    }

    public static void main(String[] args) {

        KardemommeTown town = new KardemommeTown();

        town.setup();
        //enter number of days of looting
        town.simulate(7);
    }

    public void setup() {

        ArrayList<String> items = this.boutique.getBoutiquetItems();

        ArrayList<Person> citizens = new ArrayList<Person>();
        citizens.addAll(this.thieves);
        citizens.addAll(this.residents);

        //distribute goods
        for (int i = 0; i < items.size(); i++) {
            citizens.get(i % citizens.size()).getBelongings().add(items.get(i));
        }
    }

    public void simulate(int days) {

        //print status pr. day
        System.out.println("Number of people in the town: " + (this.thieves.size()+this.residents.size()));
        System.out.println("Days of rampage: " + days + "\n");

        // x days goes by of looting
        for (int n = 1; n <= days; n++) {
            System.out.println("Day no. " + n + "  ---------------------------------------------------------\n");
            Collections.shuffle(thieves);
            Collections.shuffle(residents);

            for (int i = 0; i < residents.size(); i++) {
                if (thieves.get(i).canPlay()) {
                    residents.get(i).steal(thieves.get(i));
                }
                System.out.println(residents.get(i));
                System.out.println(thieves.get(i));
            }
            KardemommeTown.day++;
        }
    }
}
