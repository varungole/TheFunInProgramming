import java.util.*;

public  class Wordle {

   private static final int WORD_LENGTH = 5;
   private static final int MAX_STRIKES = 6;

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
                "APPLE", "BLACK", "CHAIR", "DANCE", "EAGLE", "FANCY", "GRAPE", "HATCH", "IGLOO", "JELLY",
                "KITTY", "LEMON", "MONEY", "NURSE", "OLIVE", "PIZZA", "QUEEN", "RIVER", "SNAKE", "TRAIN",
                "UNCLE", "VIVID", "WATCH", "ZEBRA", "ANGEL", "BEACH", "CLOUD", "DREAM", "FUDGE", "GLASS"
        };

        Random random = new Random();

        String answer = words[random.nextInt(words.length)].toUpperCase();
        ;
        Scanner sc = new Scanner(System.in);
        int flag = 0;
        int strikes = MAX_STRIKES;

        char[] map = new char[WORD_LENGTH];
        for(int i = 0 ; i < WORD_LENGTH ; i++)
        {
            map[i] = answer.charAt(i);
        }

        boolean[] check = new boolean[WORD_LENGTH];

        boolean win = false;
        char[] answer_array = new char[WORD_LENGTH];
        Arrays.fill(answer_array, '_');

        while(flag < WORD_LENGTH && strikes > 0)
        {
            System.out.println("Please enter your first guess");
            char c = sc.next().toUpperCase().charAt(0);
            int temp = WORD_LENGTH - flag;
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
                if(flag == WORD_LENGTH)
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
