/**
 * Created by sony on 15/8/2017.
 */


import javax.swing.*;
public class Insurance {

    public static void main(String[] args)
    {
        String year1 = JOptionPane.showInputDialog(null, "Please enter the current year: ",
                "CURRENT YEAR", JOptionPane.QUESTION_MESSAGE);
        int year = Integer.parseInt(year1);
        String born1 = JOptionPane.showInputDialog(null, "Please enter the current year: ",
                "BIRTH YEAR", JOptionPane.QUESTION_MESSAGE);
        int born = Integer.parseInt(born1);
        JOptionPane.showMessageDialog(null, "The premium is " + calculatePremium(year, born) + ".00 dollars",
                "INSURANCE PREMIUM", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("The premium is " + calculatePremium(year, born) + " dollars.");
    }
    public static int calculatePremium(int year, int born)
    {
        int age = year - born;
        final int ADD = 15;
        final int MULTIPLY = 20;
        final int DECADE = 10;
        int decade = age / DECADE;
        System.out.println("Age: " + age);
        return ((decade + ADD) * MULTIPLY);
    }
}
