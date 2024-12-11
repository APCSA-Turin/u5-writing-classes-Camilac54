import java.util.Scanner;  

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter the following: ");
        System.out.println("A number between 1-9: ");
        int rollMax = myObj.nextInt();
        System.out.println("A wayyy higher number than the previous one");
        int target = myObj.nextInt();
        System.out.println("And a low number in between those two: ");
        int rollTimes = myObj.nextInt();

        Dice oneDice = new Dice(rollTimes, rollMax, target);
        System.out.println(Dice.introduction());

        System.out.println("\nBeginning...\n");
        System.out.println("\nProcessing...\n");
        oneDice.rollOnce();
        oneDice.rollOnceEven();
        oneDice.rollTimes();
        System.out.println("\nDone!\n");
        System.out.println("Did you reach your goal yet...?\n" + oneDice.targetChecker() + "\n");
        System.out.println("\n" + oneDice.info());

        myObj.close();
    }
}