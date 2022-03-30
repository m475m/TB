public class Lesson3Ex5 {
    public static void main(String[] args) {
        char letter = 65;

        for (int spaceCounter = 5; spaceCounter >= 0; spaceCounter--) {

            for (int currentSpaceCounter = spaceCounter; currentSpaceCounter > 0; currentSpaceCounter--) {
                System.out.print(" ");
            }

            System.out.print(letter);
            for (int letterCounter = 6 - spaceCounter; letterCounter > 0; letterCounter--) {
                letter++;
                System.out.print(letter);

            }
            for (int letterCounter = 0; letterCounter < 6 - spaceCounter; letterCounter++) {
                letter--;
                System.out.print(letter);

            }
            System.out.println();
        }
        
        for (int spaceCounter = 1; spaceCounter <= 5; spaceCounter++) {

            for (int currentSpaceCounter = spaceCounter; currentSpaceCounter > 0; currentSpaceCounter--) {
                System.out.print(" ");
            }

            System.out.print(letter);
            for (int letterCounter = 6 - spaceCounter; letterCounter > 0; letterCounter--) {
                letter++;
                System.out.print(letter);

            }
            for (int letterCounter = 0; letterCounter < 6 - spaceCounter; letterCounter++) {
                letter--;
                System.out.print(letter);

            }
            System.out.println();
        }


    }
}
