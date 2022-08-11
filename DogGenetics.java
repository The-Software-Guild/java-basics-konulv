import java.util.Scanner;

public class DogGenetics{
    // I got bored of adding more breeds
    static final String[] BREEDS = {"Affenpinscher", "Afghan Hound", "Akita Inu", "American Bulldog", 
                                    "Alaskan Malamute", "Amstaff", "Australian Shepherd", "Azawakh", 
                                    "Barbet", "Basset Artesien Normand", "Beagle", "Bearded Collie", 
                                    "Bedlington Terrier", "Belgian Shepherd Groenendael", 
                                    "Bergamasco", "Bichon Frise", "Blue Gascony Basset", 
                                    "Border Collie", "Briard", "Cesky Fousek", "Cesky Terrier", 
                                    "Chihuahua", "Chow Chow", "Chinese Crested Dog", "Dalmatian", 
                                    "Dogue De Bordeaux", "Dutch Shepherd Dog"};

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("What is your dog's name? ");
        String name = in.next();

        System.out.println("Well then, I have this highly reliable report on " + name +
                            "'s prestigious background right here.");
        
        System.out.println(name + " is: ");

        String[] breeds = {"", "", "", "", ""}; //have to premake array because default value is null
        int[] percent = new int[5];
        int total = 100;
        int k = 0;
        while (k < 4){
            int num = getNum(1, total/3);
            total -= num;
            percent[k] = num;
            k++;
        }
        percent[4] = total;

        for(int i = 0; i<5; i++){

            int breed = getNum(0, BREEDS.length-1);
            while(in(BREEDS[breed], breeds)){
                breed = getNum(0, BREEDS.length-1);
            }
            breeds[i] = BREEDS[breed];
            System.out.println(percent[i] + "% " + breeds[i]);
        }
        in.close();


    }

    /**
     * took it from RPS game, because thats whats what you do with well made functions
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
     * Also yoinked from RPS exercise
     * @param val - value that one is looking for
     * @param arr - array of values to be checked
     * 
     * @return boolean of whatever value exists in the array
     */
    public static boolean in(Object val, Object[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(val)){
                return true;
            }
        }
        return false;
    }



}