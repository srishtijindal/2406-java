public class TwelveInts
{
    public static void main (String args[])
    {
        int[] numbers = {10, 15, 24, 23, 26, 29, 31, 34, 39, 45, 49, 52};
        int i;
        for (i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + "  ");
        System.out.println();
        for (i = numbers.length - 1; i >= 0; i--)
            System.out.print("" + numbers[i] + "  ");
        System.out.println();
    }
}

