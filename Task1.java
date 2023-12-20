import java.util.Scanner;
import java.util.Random;
public class Task1 
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int maxAttempts=10;
        int roundswon=0;
        boolean playagain=true;
        while(playagain)
        {
            System.out.println("Select the number between 1 to 100");
            int randomNumber=random.nextInt(100)+1;
            int attempts=0;
            while(attempts < maxAttempts)
            {
                System.out.print("Enter the user guess: ");
                int userNumber=sc.nextInt();
                attempts++;
                if (userNumber < randomNumber) 
                    System.out.println("Too low!");
                else if(userNumber > randomNumber)
                    System.out.println("Too high!");
                else
                {
                    System.out.println("You have guessed the right number in " + attempts + "attempts!!" );
                    roundswon++;
                    break;
                }
            }
            if(attempts == maxAttempts)
                System.out.println("You have reached the maximum no. of attempts!! Generated no. is " + randomNumber);

            System.out.println("Do you want to play the Number Game again (yes/no)? ");
            String input=sc.next().toLowerCase();
            playagain=input.equals("yes");
        }
        System.out.println("Rounds won: " + roundswon);
    }
    
}
