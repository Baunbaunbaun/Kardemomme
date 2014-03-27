
public class Boutique {

    private String goldWatch = "gold watch";
    private String dog = "dog";
    private String cutlery = "cutlery";
    private String necklace = "necklace";
    private String vintageNikeSneakers = "vintage Nike Sneakers";
    private String wineBottle1889 = "bottle of wine anno 1889";

    private String smokingGun = "smoking gun";
    private String toxido = "toxido";
    private String wig = "wig";
    private String stuffedBabySeal = "stuffed baby seal";
    private String saxophone = "saxophone";
    private String ladybug = "ladybug";

    private String mingVase = "ming vase";
    private String teaPot = "tea pot";
    private String heManFirstEdition = "He-Man(first edition)";
    private String gitHubTshirt = "GitHub T-shirt";
    private String signedACDCposter = "signed ACDC poster";
    private String playstation3 = "playstation 3";

    private String[] boutiquetItems = {this.dog, this.cutlery, this.necklace, this.vintageNikeSneakers, this.wineBottle1889,
            this.smokingGun, this.toxido, this.wig, this.stuffedBabySeal, this.saxophone, this.ladybug,
            this.goldWatch, this.mingVase, this.teaPot, this.heManFirstEdition, this.gitHubTshirt,
            this.signedACDCposter, this.playstation3};

    public Boutique(String name) {
        //empty constructor
    }

    public String[] getBoutiquetItems() {

        return this.boutiquetItems;
    }
}
