/**
 * Created by sony on 15/8/2017.
 */

import java.util.Scanner;
public class MetricConversion
{
    public static void main(String[] args)
    {
        Scanner enter = new Scanner(System.in);
        System.out.println("Please enter any whole number --> ");
        int anyValue = enter.nextInt();
        convertAnyValueToInches(anyValue);
        convertAnyValueToGallons(anyValue);
    }
    public static void convertAnyValueToInches(int anyValue)
    {
        double centimeters = anyValue * 2.54;
        System.out.println("The whole number you entered is " + anyValue + "." +
                "  This value converted to centimeters is " + centimeters);
    }
    public static void convertAnyValueToGallons(int anyValue)
    {
        double liters = anyValue / 3.7854;
        System.out.println("The whole number you entered is " + anyValue + "." +
                "  This value converted to liters is " + liters);
    }
}

