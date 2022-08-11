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

        int i = 100;
        while (i !=0){
            int percent = getNum(1, i);
            int breed = getNum(0, BREEDS.length-1);

            // this has a chance of repeating breeds, albeit unlikely.
            System.out.println(percent + "% " + BREEDS[breed]);
            i -= percent;
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



}