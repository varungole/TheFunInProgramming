import java.util.Random;
import java.util.Scanner;

public class Guess
{
    public static void main(String[] args) {
        System.out.println("Welcome to this stupid game");
        System.out.println();
        System.out.println("I am going to tell a Man Utd player from the current squad, you will also get a chance to input a player");
        System.out.println();
        System.out.println("You will sleep when you guess correctly");
        String[] man_utd = {"Andre Onana", "Aaron Wan-Bissaka", "Harry Maguire" , "Raphael Varane", "Diogo Dalot" , "Kobbee Mainoo" , "Casemiro", "Alejandro Garnacho" , "Bruno Fernandes" , "Marcus Rashford" , "Rasmum Hojlund"};
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        System.out.println();
        while(!flag)
        {
         Random random = new Random();
         String computer_guess = man_utd[random.nextInt(man_utd.length)];
         System.out.println("Enter your guess");
         String your_guess = sc.nextLine();
         if(your_guess.equals(computer_guess))
           { 
             flag = true;
             sc.close();
           }
         else
           {
             System.out.println("Hell naw");
           }
         }
        System.out.println("Congrats! You won. You can commit the code and sleep now");
    }
}