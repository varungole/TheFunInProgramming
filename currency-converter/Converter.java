import java.util.Scanner;
import java.util.*;


public class Converter
{
       public static void main(String[] args) {
        System.out.println();
        System.out.println("Welcome to currency converter!");
        System.out.println();
        System.out.println("These are the currencies we have available!");
        System.out.println();
        System.out.println("1.INR 2.USD 3.Yen 4.Rubel 5.Euro 6.Pounds 7.Franc");

        System.out.println("Please enter your choice for the first currency");
        Scanner sc = new Scanner(System.in);
        int choice1 = sc.nextInt();
        System.out.println("Please enter the second choice for currency");
        int choice2 = sc.nextInt();
        sc.close();


       }
       
}