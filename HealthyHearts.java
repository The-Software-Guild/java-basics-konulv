import java.util.Scanner;

public class HealthyHearts{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("what is your age? ");
        int age = in.nextInt();
        int maxHR = 200-age;

        System.out.printf("Your maximum heart rate should be %d beats per minute\n", maxHR);
        System.out.printf("your target HR is %d - %d beats per minute\n", (int)(maxHR*0.5), (int)(maxHR*0.85));

        in.close();
    }
}