import java.util.Scanner;

public class Main
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
                    System.out.println("Wow that's freezing!");
                }
                if(celTemp >= 38)
                {
                    System.out.println("Wow that's boiling!");
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