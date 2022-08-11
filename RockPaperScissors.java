import java.util.Scanner;

public class RockPaperScissors{    
    public static void main(String[] args){
        final int MAX_ROUNDS = 10;
        final int MIN_ROUNDS = 1;
        //there is a reason for the specific order bellow, makes logic cleaner
        final String[] MOVES = {"rock", "scissors", "paper"};


        int wins, loss, draw = 0; // for the player
        Scanner in = new Scanner(System.in);

        System.out.println("how many rounds would you like to play \"Rock, Paper, Scissors\"?");
        int rounds = in.nextInt();
        if (rounds < MIN_ROUNDS || rounds > MAX_ROUNDS){ //i.e. outide of allowed range
            in.close();
            System.exit(0);
        }

    }

    /**
     * Given the values, produces a random number within specified range (inclusive).
     * Might not work with negative values
     * 
     * @param min - minimum value
     * @param max - maximum value
     * 
     * @return number in range [from:to]
     */
    public static int getNum(int min, int max){
        int num = (int)(Math.random() * ((max) - min + 1) + min);
        return num;
    }

    
}