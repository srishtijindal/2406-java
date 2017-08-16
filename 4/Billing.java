/**
 * Created by sony on 15/8/2017.
 */

public class Billing {
    private static final double TAX = 0.08;
    private static double photoBookPrice;
    private static int booksOrdered;
    public static void main(String[] args)
    {
        computeBill(15.99);
        computeBill(15.99, 15);
        computeBill(15.99, 15, 10.00);
    }
    public static void computeBill(double price)
    {
        photoBookPrice = price;
        double booksBill = (photoBookPrice * TAX) + photoBookPrice;
        System.out.println("Total cost for your order is " + booksBill);
    }
    public static void computeBill(double price, int ordered)
    {
        photoBookPrice = price;
        booksOrdered = ordered;
        double booksBill = (photoBookPrice * booksOrdered * TAX) + (photoBookPrice * booksOrdered);
        System.out.println("Total cost for your order is " + booksBill);
    }
    public static void computeBill(double price, int ordered, double discount)
    {
        photoBookPrice = price;
        booksOrdered = ordered;
        double booksBill = (photoBookPrice * booksOrdered * TAX - discount) + (photoBookPrice * booksOrdered);
        System.out.println("Total cost for your order is " + booksBill);
    }

}
