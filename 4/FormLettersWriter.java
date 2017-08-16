/**
 * Created by sony on 15/8/2017.
 */

public class FormLettersWriter {
    private static final String SALUTATION1 = "Dear Mr. or Ms. ";
    private static final String SALUTATION2 = "Dear ";
    public String lastName;
    public String firstName;
    private static final String LETTER_END = "Thank you for your recent order";
    public void displaySalutation(String last)
    {
        lastName = last;
        System.out.println(SALUTATION1 + lastName);
    }
    public void displaySalutation(String last, String first)
    {
        lastName = last;
        firstName = first;
        System.out.println(SALUTATION2 + firstName + " " + lastName);
    }
    public void displayLetter()
    {
        System.out.println(LETTER_END);
    }
    public static void main(String[] args)
    {
        FormLettersWriter test001 = new FormLettersWriter();
        FormLettersWriter test002 = new FormLettersWriter();
        test001.displaySalutation("Henry");
        test001.displayLetter();
        test002.displaySalutation("Henry", "Kimberly");
        test002.displayLetter();
    }
}
