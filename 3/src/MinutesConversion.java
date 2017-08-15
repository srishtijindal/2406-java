import java.util.Scanner;
import javax.swing.JOptionPane;




public class MinutesConversion

{

    public static void main (String[] args)

    {

        Scanner sc = new Scanner (System.in);


        //Get user to input number of minutes.

        int minutes = 60;

        int totalhours =  minutes / 60;

        int Minutes = totalhours % 60;

        int totalHours = totalhours / 60;

        int hours = totalHours % 24;

        int totalDays = totalHours / 24;

        int days = totalDays % 7;

        String input;

        {

            input = JOptionPane.showInputDialog("Enter minutes: ");

            minutes = Integer.parseInt(input);





            if (minutes < 60)

            {

                int seconds = minutes - hours;

                //Process the number of minutes and convert to hours, days





                System.out.println ("The time " + hours + " and " + days + " is " + days + " days, " + hours +
                        " hours, " + Minutes + " minutes");



            }





            if (Minutes > 60)

            {





                //Get the minutes.

                input = JOptionPane.showInputDialog("Enter minutes: ");

                Minutes = Integer.parseInt(input);


                //Process the number of seconds and convert to hours minutes and seconds





                System.out.println ("The time " + hours + " and " + days + " is " + days + " days, " + hours +
                        " hours, " + Minutes + " minutes");



            }


        }

    }

}