public class Cards{
    int month;
    String type;
    int artNumb;
    String extra;
    String name;

    public Cards(int monthGroup, String cardType, int artWork, String extraAtrribute, String cardName){
        this.month = monthGroup;
        this.type = cardType;
        this.artNumb = artWork;
        this.extra = extraAtrribute;
        this.name = cardName;
    }

    public int getMonth(){
        return month;
    }

    public String getType(){
        return type;
    }

    public int getArtWork(){
        return artNumb;
    }

    public String getExtra(){
        return extra;
    }

    public String getName(){
        return name;
    }

    public void displayAtrributes(){
        System.out.println("Month: " + month + ", Type: " + type + ", ")
    }

    public static void main(String[] args) {

        public static void createCardList(){
            Cards[] cardList = {
                new Cards(1 , "light", 1, "n/a", "Jan Crane"), //January Crane
                new Cards(1, "slip", 2, "poet", "Jan Poet Slip"), // Jan Poetry Slip
                new Cards(1, "chaff", 3, "n/a", "Jan Chaff 1"), // jan chaff1
                new Cards(1, "chaff", 4, "n/a", "Jan Chaff 2"), // janChaff 2
                new Cards(2 , "seed", 5, "n/a", "Feb Seed"), // Feb seed
                new Cards(2 , "slip", 6, "poet", "Feb Poet Slip"), // feb poet slip
                new Cards(2 , "chaff", 7, "n/a", "Feb Chaff 1"), // feb chaff
                new Cards(2 , "chaff", 8, "n/a", "Feb Chaff 2"), // feb Chaff
                new Cards(3, "light", 9, "cherryView", "March Blossom"),
                new Cards(3, "slip", 10, "poet", "March poet slip"),
                new Cards(3, "chaff", 11, "n/a", "March chaff 1"),
                new Cards(3, "chaff", 12, "n/a", "March chaff 2"),
                new Cards(4, "seed", 13, "n/a", "April seed"),
                new Cards(4, "slip", 14, "n/a", "April slip"),
                new Cards(4, "chaff", 15, "n/a", "April chaff1"),
                new Cards(4, "chaff", 16, "n/a", "April chaff2"),
                new Cards(5, "seed", 17, "n/a", "May seed"),
                new Cards(5, "slip", 18, "n/a", "May slip"),
                new Cards(5, "chaff", 19, "n/a", "May chaff1"),
                new Cards(5, "chaff", 20, "n/a", "May chaff2"),
                new Cards(6, "seed", 21, "bdb", "June Butterfly"),
                new Cards(6, "slip", 22, "blue", "June blue slip"),
                new Cards(6, "chaff", 23, "n/a", "June chaff1"),
                new Cards(6, "chaff", 24, "n/a", "June chaff2"),
                new Cards(7, "seed", 25, "bdb", "July Boar"),
                new Cards(7, "slip", 26, "n/a", "July slip"),
                new Cards(7, "chaff", 27, "n/a", "July chaff1"),
                new Cards(7, "chaff", 28, "n/a", "July chaff2"),
                new Cards(8, "light", 29, "moonView", "August moon"), 
                new Cards(8, "seed", 30, "poet", "August seed"), 
                new Cards(8, "chaff", 31, "n/a", "Aug Chaff 1"),
                new Cards(8, "chaff", 32, "n/a", "Aug Chaff 2"),
                new Cards(9, "seed", 33, "chrysView", "Sept viewing"),
                new Cards(9, "slip", 34, "blue", "Sept blue slip"),
                new Cards(9, "chaff", 35, "n/a", "Sept chaff 1"),
                new Cards(9, "chaff", 36, "n/a", "Sept chaff 2"),
                new Cards(10, "seed", 37, "bdb", "Oct deer"),
                new Cards(10, "slip", 38, "blue", "Oct blue slip"),
                new Cards(10, "chaff", 39, "n/a", "Oct chaff 1"),
                new Cards(10, "chaff", 40, "n/a", "Oct chaff 2"),
                new Cards(11, "light", 41, "rain", "November parasol"),
                new Cards(11, "seed", 42, "n/a", "Nov seed"),
                new Cards(11, "slip", 43, "n/a", "Nov seed"),
                new Cards(11, "chaff", 44, "n/a", "Nov chaff"),
                new Cards(12, "light", 45, "n/a", "Dec Hawk"),
                new Cards(12, "chaff", 46, "n/a", "Dec chaff 1"),
                new Cards(12, "chaff", 47, "n/a", "Dec chaff 2"),
                new Cards(12, "chaff", 48, "n/a", "Dec chaff 1"),
        }
        }
        
        // light is most points, then slips, then seeds, then chaff
    }
}