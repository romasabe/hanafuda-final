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
            new Cards(3, "Chaff", 12, "n/a", "March chaff 2"),
            new Cards(4, "Seed", 13, "n/a", "April seed"),
            new Cards(4, "Slip", 14, "n/a", "April slip"),
            new Cards(4, "Chaff", 15, "n/a", "April chaff1"),
            new Cards(4, "Chaff", 16, "n/a", "April chaff2"),
            new Cards(5, "Seed", 17, "n/a", "May seed"),
            new Cards(5, "Slip", 18, "n/a", "May slip"),
            new Cards(5, "Chaff", 19, "n/a", "May chaff1"),
            new Cards(5, "Chaff", 20, "n/a", "May chaff2"),
            new Cards(6, "Seed", 21, "BDB", "June Butterfly"),
            new Cards(6, "Slip", 22, "Blue", "June blue slip"),
            new Cards(6, "Chaff", 23, "n/a", "June chaff1"),
            new Cards(6, "Chaff", 24, "n/a", "June chaff2"),
            new Cards(7, "Seed", 21, "BDB", "July Boar"),
            new Cards(7, "Slip", 22, "n/a", "July slip"),
            new Cards(7, "Chaff", 23, "n/a", "July chaff1"),
            new Cards(7, "Chaff", 24, "n/a", "July chaff2"),
            new Cards(8 , "Light", 25, "View", "August moon"), 
            new Cards(8, "Seed", 26, "Poet", "August seed"), 
            new Cards(8, "Chaff", 27, "n/a", "Aug Chaff 1"),
            new Cards(8, "Chaff", 28, "n/a", "Aug Chaff 2"),
        }
        
    }
}