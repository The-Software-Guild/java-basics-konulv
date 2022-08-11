import java.util.Scanner;

public class RockPaperScissors{  
    static final int MAX_ROUNDS = 10;
    static final int MIN_ROUNDS = 1;
        //there is a reason for the specific order bellow, makes logic cleaner
    static final String[] MOVES = {"rock", "scissors", "paper"};


    public static void main(String[] args){
        int wins = 0; //for the player
        int loss = 0;
        int draw = 0;
        Scanner in = new Scanner(System.in);

        
        int userChoice;
        int PcChoice;
        int result;
        int rounds = 0;
        boolean keep_playing = false;
        do{
            System.out.println("how many rounds would you like to play \"Rock, Paper, Scissors\"?");
            rounds = in.nextInt();
            if (rounds < MIN_ROUNDS || rounds > MAX_ROUNDS){ //i.e. outide of allowed range
                in.close();
                System.exit(0);
            }

            for(int i = 0; i < rounds; i++){
                System.out.printf("beginning round %d\n", (i+1));
                userChoice = user_choice(in);
                PcChoice = getNum(0, 2);
                result = userChoice - PcChoice;
                
                System.out.print("PC has chosen " + MOVES[PcChoice]+ "\nyou have ");
                if (result == 0){
                    System.out.println("a draw");
                    draw++;
                } else if(result == -1 || result == 2){ //this logic taken form my other project, but it works.
                    System.out.println("won this round");
                    wins++;
                } else { 
                    System.out.println("lost this round");
                    loss++;
                }

                System.out.println(""); // there for formatting reasons
            }

            System.out.printf("you have:\nWon %d times\nLost %d times\nDrew %d times\n", wins, loss, draw);
            showWinner(wins, loss);

            System.out.print("Would you like to keep playing? Yes/No: ");
            String kek = in.next().toLowerCase();
            keep_playing = kek.equals("yes");

        }while(keep_playing);

        System.out.println("thank you for playing");
        in.close();


    }

    /**
     * Given the values, produces a random number within specified range (inclusive).
     * Might not work with negative values
     * @param min - minimum value
     * @param max - maximum value
     * 
     * @return number in range [from:to]
     */
    public static int getNum(int min, int max){
        int num = (int)(Math.random() * ((max) - min + 1) + min);
        return num;
    }

    /**
     * Taking user input for Rock/Paper/Scissors.
     * Due to special logic, the input needs to be changed to
     * a one in usable form.
     * @param in - scanner for taking user input
     * 
     * @return int of correct value
     */
    public static int user_choice(Scanner in){
        System.out.println("Please enter a number for your choice:");
        System.out.println("1: Rock\n2: Paper\n3: Scissors");
        int[] allowed_choices = {1,2,3};
        int[] converted_choice = {0,2,1};
        int answer = in.nextInt();
        while(!in(answer, allowed_choices)){
            System.out.print("The answer given is outside the range, please try again: ");
            answer = in.nextInt();
        }

        return converted_choice[answer-1];
    }

    /**
     * This function should be a semi replacement for '1 in {1,2,3}'
     * sort of expressions.
     * @param val - value that one is looking for
     * @param arr - array of values to be checked
     * 
     * @return boolean of whatever value exists in the array
     */
    public static boolean in(int val, int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == val){
                return true;
            }
        }
        return false;
    }

    /**
     * arguably this is unecessery, but i wanted a cleaner main function
     * 
     * @param win - number of wins the player has
     * @param loss - number of times player lost
     */
    public static void showWinner(int win, int loss){
        String winner;
        if (win == loss){
            winner = "No one";
        }else if (win > loss){
            winner = "Player";
        }else{
            winner = "Computer";
        }
        System.out.println(winner + " has won this time");


    }

    
}