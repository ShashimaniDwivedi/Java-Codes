import java.util.Scanner;

class Guesser
{
    int guessNum;

    int gussingNumber()//method
    {
        System.out.println("Guesser guess the number :");
        Scanner scan = new Scanner(System.in);
        guessNum = scan.nextInt();
        return guessNum;
    }
}

class Player {
    int guessNum;

    int gussingNumber()
    {
        System.out.println(" Player Guess the number");
        Scanner scan = new Scanner(System.in);
        guessNum = scan.nextInt();
        return guessNum;
    }
}

   class Umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;


    void collectNumberFromGuesser()
    {
        Guesser g = new Guesser();//object making

        numFromGuesser = g.gussingNumber();//method call
    }

    void collectNumberFromPlayer()
    {
        Player p1 = new Player();//object making

        Player p2 = new Player();

        Player p3 = new Player();
        numFromPlayer1 = p1.gussingNumber();//method call

        numFromPlayer2 = p2.gussingNumber();

        numFromPlayer3 = p3.gussingNumber();

    }

    void compare()
    {
        if (numFromGuesser == numFromPlayer1)
        {
            if (numFromGuesser == numFromPlayer2 && numFromPlayer2 == numFromPlayer3)
            {
                System.out.println("All Player won the game");
            }
            else if (numFromGuesser == numFromPlayer2)
            {
                System.out.println("Player1&Player2 won the game");
            }
            else if (numFromGuesser == numFromPlayer3)
            {
                System.out.println("Player1&Player3 won the game");
            } else
            {
                System.out.println("Player1 won the game");
            }
        }
        else if (numFromGuesser == numFromPlayer2)
        {
            if (numFromGuesser == numFromPlayer3)
            {
                System.out.println("Player2&Player3 won the game");
            } else {
                System.out.println("Player2 won the game");
            }

        }
        else if (numFromGuesser == numFromPlayer3)
        {
            System.out.println("Player3 won the game");
        }
        else
        {
            System.out.println("************Game lost Try Again**********");
        }

    }
}

           public class LaunchGame
           {
             public static void main(String[] args)
             {
                System.out.println("********************Game Started****************");
                 Umpire u = new Umpire();//object making

                u.collectNumberFromGuesser();

                u.collectNumberFromPlayer();

                 u.compare();

            }
         }
