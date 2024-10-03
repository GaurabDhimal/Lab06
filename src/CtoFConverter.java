import java.util.Scanner;

public class CtoFConverter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int celTemp = 0;
        int ferTemp = 0;
        String trash = "";
        boolean inputNum = false;

        do
        {
            System.out.print("Enter the temperature in Celsius: ");
            if (in.hasNextInt())
            {
                celTemp = in.nextInt();
                in.nextLine();

                ferTemp = (celTemp * 9/5) + 32;

                System.out.println(celTemp + " degrees Celsius is " + ferTemp + " degrees Fahrenheit");
                if(celTemp <= 0)
                {
                    System.out.println("Water will freeze at this temperature!");
                }
                if(celTemp >= 100)
                {
                    System.out.println("Water will boil at this temperature!");
                }

                inputNum = true;
            }
            else
            {
                trash = in.nextLine();

                System.out.println(trash + " is not a valid input, try again");

            }
        }while(!inputNum);
    }
}