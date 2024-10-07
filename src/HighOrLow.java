import java.util.Scanner;
import java.util.Random;

public class HighOrLow
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        int val = generator.nextInt(10) + 1;

        int guess = 0;
        String trash = "";
        boolean done = false;
        boolean guessDone = false;

        do
        {
            do
            {
                System.out.print("Try to guess my number[1-10]: ");
                if (in.hasNextInt())
                {
                   guess = in.nextInt();
                   in.nextLine();
                   guessDone = true;
                   done = true;

                    System.out.println("My number was " + val + " and your guess was " + guess);
                    if(guess > val)
                    {
                        System.out.println("Your guess was too high!");
                    }
                    else if (guess < val)
                    {
                        System.out.println("Your guess was too low!");
                    }
                    else
                    {
                        System.out.println("Good job you guessed my number!");
                    }
                }
                else
                {
                    trash = in.nextLine();
                    System.out.println("This is not a valid input, try again!");
                }
            }while(!guessDone);
        }while(!done);

    }
}
