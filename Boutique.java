import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Boutique {

    private ArrayList<String> items;


    public Boutique() {

        String[] items =
                {
                        "gold watch",
                        "dog",
                        "cutlery",
                        "necklace",
                        "vintage Nike Sneakers",
                        "bottle of wine anno 1889",
                        "smoking gun",
                        "toxido",
                        "wig",
                        "stuffed baby seal",
                        "saxophone",
                        "ladybug",
                        "ming vase",
                        "tea pot",
                        "He-Man(first edition)",
                        "GitHub T-shirt",
                        "signed ACDC poster",
                        "playstation 3"
                };

        this.items = new ArrayList<String>(Arrays.asList(items));
    }

    //returns arraylist with boutique items shuffled
    public ArrayList<String> getBoutiquetItems() {
        Collections.shuffle(this.items);
        return this.items;
    }

}
