import java.util.Scanner;

public class RockPaperScissors{  
    
    static final int MAX_ROUNDS = 10;
    static final int MIN_ROUNDS = 1;
        //there is a reason for the specific order bellow, makes logic cleaner
    static final String[] MOVES = {"rock", "scissors", "paper"};
    public static void main(String[] args){
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

    public static int user_choice(Scanner in){
        System.out.println("Please enter a number for your choice:");
        System.out.println("1: Rock\n2: Paper\n3: Scissors");
        int[] allowed_choices = {1,2,3};
        int[] converted_choice = {1,3,2};
        int answer = in.nextInt();
        while(!in(allowed_choices, answer)){
            System.out.print("The answer given is outside range, please try again: ");
            answer = in.nextInt();
        }

        return converted_choice[answer-1];
    }


    public static boolean in(Object[] obj, Object val){
        for(int i = 0; i < obj.length; i++){
            if(obj[i] == val){
                return true;
            }
        }
        return false;
    }
    public static boolean in(int[] obj, int val){
        for(int i = 0; i < obj.length; i++){
            if(obj[i] == val){
                return true;
            }
        }
        return false;
    }

    
}