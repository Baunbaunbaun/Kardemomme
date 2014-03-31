import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class KardemommeTown {

    public ArrayList<Person> residents;
    public ArrayList<Thief> thieves;
    public Boutique boutique = new Boutique();
    public static int day = 1;
    public static KardemommeTown town = new KardemommeTown();

    public KardemommeTown() {

        Person[] residents = new Person[]{new OldTobias(), new AuntSofie(), new PolicemanBastian(town)};
        Thief[] thieves = new Thief[]{new Thief("Johnathan"), new Thief("Jesper"), new Thief("Kasper")};

        //from array to array list
        this.residents = new ArrayList<Person>(Arrays.asList(residents));
        this.thieves = new ArrayList<Thief>(Arrays.asList(thieves));
    }

    public static void main(String[] args) {

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
        System.out.println("Number of people in the town: " + (this.thieves.size() + this.residents.size()));
        System.out.println("Days of rampage: " + days + "\n");

        // x days goes by of looting
        for (int n = 1; n <= days; n++) {
            System.out.println("Day no. " + n + "  ---------------------------------------------------------\n");
            Collections.shuffle(this.thieves);
            Collections.shuffle(this.residents);

            for (int i = 0; i < this.residents.size(); i++) {
                if (this.thieves.get(i).canPlay()) {
                    this.residents.get(i).steal(this.thieves.get(i));
                }
                System.out.println(this.residents.get(i));
            }
            for (Thief t :
                    this.thieves) {
                System.out.println(t);
            }
            KardemommeTown.day++;
        }
    }

    public Person getResident(int number) {
        return residents.get(number);
    }
}
