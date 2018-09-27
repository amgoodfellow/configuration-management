//This class naming convention comes from the instructions.
public class BeerSong {

    /**
     * This is the main function for the program - the entry point It calls our
     * other function: "Ninety_Nine_Bottles_of_Beer"
     */
    public static void main(String[] args) {
        Ninety_Nine_Bottles_of_Beer();
    }

    /**
     * This function's name comes from the assignment instructions. Normally, I
     * would not use snake-case to name Java methods. This function prints out the
     * 99 bottles of beer song
     */
    public static void Ninety_Nine_Bottles_of_Beer() {
        for (int i = 99; i > 1; i--) {
            String a = String.valueOf(i);
            System.out.println(a + " bottles of beer on the wall, " + a + " bottles of beer");
            if (i == 2) {
                System.out.println(
                        "take one down, pass it around " + String.valueOf(i - 1) + " bottle of beer on the wall");
            } else {
                System.out.println(
                        "take one down, pass it around " + String.valueOf(i - 1) + " bottles of beer on the wall");
            }
        }
        System.out.println("1 bottle of beer on the wall, 1 bottle of beer\n"
                + "take it down, pass it around, no more bottles of beer on the wall");
    }

}
