import java.util.*;

public  class Wordle {


    public static int wordPresent(char c, String word, char[] map, boolean[] check) {
        for (int i = 0; i < 5; i++) {
            if (map[i] == c && !check[i]) {
                check[i] = true;
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Hello and welcome to your daily wordle");

        String[] words = {
                "APPLE", "BANANA", "CHAIR", "DANCE", "EAGLE", "FANCY", "GRAPE", "HATCH", "IGLOO", "JELLY",
                "KITTY", "LEMON", "MONEY", "NURSE", "OLIVE", "PIZZA", "QUEEN", "RIVER", "SNAKE", "TRAIN",
                "UNCLE", "VIVID", "WATCH", "ZEBRA", "ANGEL", "BEACH", "CLOUD", "DREAM", "FUDGE", "GLASS"
        };

        Random random = new Random();
        int upper = 29;
        int index = random.nextInt(upper);
        
        String answer = words[index];
        Scanner sc = new Scanner(System.in);
        int flag = 0;
        int strikes = 6;

        char[] map = new char[5];
        for(int i = 0 ; i < 5 ; i++)
        {
            map[i] = answer.charAt(i);
        }

        boolean[] check = new boolean[5];

        boolean win = false;
        char[] answer_array = {'_' , '_' , '_' , '_' , '_'};

        while(flag < 5 && strikes > 0)
        {
            System.out.println("Please enter your first guess");
            char c = sc.next().toUpperCase().charAt(0);
            int temp = 5 - flag;
            int curr = wordPresent(c, answer, map, check);
            if(curr != -1)
            {
                curr++;
                System.out.println("Good job! " + temp + " to go!");
                System.out.println();
                int temp_curr = curr-1;
                answer_array[temp_curr] = c;
                for(char df : answer_array)
                {
                    System.out.print(df);
                }
                System.out.println();
                flag++;
                if(flag == 5)
                {
                    win = true;
                }
            }
            else {
                strikes--;
                System.out.println("Bad luck, strike 1. Total strikes remaining are " + strikes);
                for(char df : answer_array)
                {
                    System.out.print(df);
                }
                System.out.println();
            }
        }

        if(win)
        {
            System.out.println("You won! The word was " + answer);
        }
        else
        {
            System.out.println("You lost sadly lmao get rekt, the word was " + answer);
        }
        sc.close();

    }
}
