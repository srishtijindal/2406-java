import java.util.Scanner;

/**Class to calculate price for an egg order, with set price per dozen and then per
 * individual eggs left over
 * Created by Sony on 8/08/2017.
 */

public class Eggs {
    final static double PRICE_PER_DOZEN = 3.25;
    final static double PRICE_PER_SINGLE = 0.45;
    final static int EGGS_IN_DOZEN = 12;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("How many eggs in your order today? ");

        int numEggs = input.nextInt();
        int fullDozens = numEggs / EGGS_IN_DOZEN;
        int singleEggs = numEggs % EGGS_IN_DOZEN;

        double dozenPrice = fullDozens * PRICE_PER_DOZEN;
        double singlePrice = singleEggs * PRICE_PER_SINGLE;
        double fullPrice = dozenPrice + singlePrice;

        System.out.printf("You are ordering " + numEggs + " eggs. That is " + fullDozens + " full dozens at $" + dozenPrice +
                " and " + singleEggs + " single eggs at $" + singlePrice + ".");
        System.out.printf(" Your total price is $" + fullPrice);
    }

}
