import java.util.Scanner;

public class FuelCosts
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double galCapacity = 0;
        double fuelEff = 0;
        double galCost = 0;
        double hundCost = 0;
        String trash = "";
        boolean done = false;
        boolean galDone = false;
        boolean fuelDone = false;
        boolean costDone = false;

        do
        {
            System.out.print("Enter your gallon capacity: ");
            if (in.hasNextDouble())
            {
                galCapacity = in.nextDouble();
                in.nextLine();

                System.out.print("Enter your fuel efficiency in mile per gallon: ");
                if (in.hasNextDouble())
                {
                    fuelEff = in.nextDouble();
                    in.nextLine();

                    System.out.println("Enter the price of gas per gallon: ");
                    if (in.hasNextDouble())
                    {
                        galCost = in.nextDouble();
                        in.nextLine();

                        hundCost = 100/galCost;
                        System.out.println("The cost to drive 100 miles on an empty tank is $" + hundCost);


                    }
                    else
                    {
                        trash = in.nextLine();
                        System.out.println(trash + " is not a valid output, try again!");
                    }
                }
                else
                {
                    trash = in.nextLine();
                    System.out.println(trash + " is not a valid output, try again!");
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println(trash + " is not a valid output, try again!");
            }
        }while(!done);
    }
}
