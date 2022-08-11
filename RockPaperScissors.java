import java.util.Scanner;

public class RockPaperScissors{
    public final int MAX_ROUNDS = 10;
    public final int MIN_ROUNDS = 1;
    //there is a reason for the specific order bellow, makes logic cleaner
    public final String[] moves = {"rock", "scissors", "paper"};
    
    public static void main(String[] args){
        int wins, loss, draw = 0; // for the player
        Scanner in = new Scanner(System.in);
        

        for(int i = 0; i <10; i++){
            System.out.println(getNum(1,10));
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