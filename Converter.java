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
        System.out.println("1.INR 2.USD 3.Euro");

        System.out.println("Please enter your choice for the first currency");
        Scanner sc = new Scanner(System.in);
        int choice1 = sc.nextInt();
        System.out.println("Please enter the second choice for currency");
        int choice2 = sc.nextInt();

        System.out.println("Please enter the value for your first currency");
        float value1 = sc.nextFloat();

        if(choice1 == choice2)
        {
         System.out.println("Please enter seperate choices!");
        }


        ConversionMap currency_map = new ConversionMap();
        HashMap<Pair, Float> cmap = currency_map.map();


        Pair p = new Pair(choice1, choice2);
        Float rate = cmap.get(p);
        System.out.println(p.getKey());
        System.out.println(p.getValue());
        if (rate != null) {
         float value2 = value1 * rate;
         System.out.printf("The equivalent amount in the second currency is %.2f\n", value2);
        } else {
         System.out.println("Conversion rate not available.");
        }

        sc.close();









       }
       
}