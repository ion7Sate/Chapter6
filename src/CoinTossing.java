import java.util.Scanner;
import java.security.SecureRandom;
public class CoinTossing {

    private enum Coin {HEAD, TAIL} ;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int choice;
        int tailFrequency = 0;
        int headFrequency = 0;

        do {
            System.out.println("Enter 1 for toss coin  or enter other digit for exit");
            choice = input.nextInt();

            if (choice != 1)
                break;

            Coin coinValue = throwingTheCoin();
            System.out.println("Result of coin throwing is " + coinValue);

            if (coinValue == Coin.HEAD) {
                headFrequency++;
            } else {
                tailFrequency++;
            }
        } while (choice == 1);

        System.out.println("HEAD appears " + headFrequency + " times");
        System.out.println("TAIL appears " + tailFrequency + " times");
    }

    public static Coin throwingTheCoin() {
        SecureRandom randomFlip = new SecureRandom();
        int flipValue = randomFlip.nextInt(2);
        return flipValue == 1 ? Coin.TAIL : Coin.HEAD;
    }

}
