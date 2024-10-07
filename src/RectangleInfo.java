import java.util.Scanner;

public class RectangleInfo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double length = 0;
        double width = 0;
        double perimeter = 0;
        double diagonal = 0;
        String trash = "";
        boolean done = false;
        boolean lengDone = false;
        boolean widDone = false;


        do
        {
            do
            {
                System.out.print("Enter the length of you rectangle: ");
                if (in.hasNextDouble()) {
                    length = in.nextDouble();
                    in.nextLine();
                    lengDone = true;

                    do
                    {
                        System.out.print("Enter the width of your rectangle: ");
                        if (in.hasNextDouble()) {
                            width = in.nextDouble();
                            in.nextLine();
                            widDone = true;

                            perimeter = 2 * length + 2 * width;
                            diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));

                            System.out.println("The perimeter of this rectangle is " + perimeter);
                            System.out.println("The diagonal distance of this rectangle is " + diagonal);

                            done = true;
                        }
                        else
                        {
                            trash = in.nextLine();
                            System.out.println("This is not a valid input, try again!");
                        }
                    } while (!widDone);
                }
                else
                {
                    trash = in.nextLine();
                    System.out.println("This is not a valid input, try again!");
                }

            }while(!lengDone);
        }while(!done);
    }
}