public class RockPaperScissors{
    public final int MAX_ROUNDS = 10;
    public final int MIN_ROUNDS = 1;
    
    public static void main(String[] args){
        for(int i = 0; i <10; i++){
            System.out.println(getNum(1,10));
        }
        //Math.random()
    }
    /*
     * @return number in range [from:to]
     */
    public static int getNum(int min, int max){
        int num = (int)(Math.random() * ((max) - min + 1) + min);
        return num;
    }

    
}