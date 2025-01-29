public class Cards{

    public Cards(int monthGroup, String cardType, int artWork, String extraAtrribute, String cardName){
        final int month = monthGroup;
        final String type = cardType;
        final int artNumb = artWork;
        final String extra = extraAtrribute;
        final String name = cardName;
    }
    public static void main(String[] args) {
        Cards[] cardList = {
            new Cards(1 , "Light", 1, "n/a", "Jan Crane"), //January Crane
            new Cards(1, "Slip", 2, "Poet", "Jan Poet Slip"), // Jan Poetry Slip
            new Cards(1, "Chaff", 3, "n/a", "Jan Chaff 1"), // jan chaff1
            new Cards(1, "Chaff", 4, "n/a", "Jan Chaff 2"), // janChaff 2
            new Cards(2 , "Seed", 5, "n/a", "Feb Seed"), // Feb seed
            new Cards(2 , "Slip", 6, "Poet", "Feb Poet Slip"), // feb poet slip
            new Cards(2 , "Chaff", 7, "n/a", "Feb Chaff 1"), // feb chaff
            new Cards(2 , "Chaff", 8, "n/a", "Feb Chaff 2"), // feb Chaff
            new Cards(3, "Light", 9, "View", "March Blossom"),
            new Cards(3, "Slip", 10, "Poet", "March poet slip"),
            new Cards(3, "Chaff", 11, "n/a", "March chaff 1"),
            new Cards(3, "Chaff", 12, "n/a", "March chaff 1"),
            new Cards(4, "Light", 13, "View", "March Blossom"),
        }
        
    }
}