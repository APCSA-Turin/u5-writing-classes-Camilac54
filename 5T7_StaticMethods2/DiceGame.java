public class DiceGame {
    private Dice dice;

    public DiceGame(int rollTimes, int rollMax, int target) {
        this.dice = new Dice(rollTimes, rollMax, target);
    }

    public void start () {
        System.out.println(Dice.introduction() + "\n");

        System.out.println("\nBeginning...\n");
        System.out.println("\nProcessing...\n");
        System.out.println(dice.rollOnce());
        System.out.println(dice.rollOnceEven());
        System.out.println(dice.rollTimes());
        if (dice.targetChecker()) {
            System.out.println("You have reached -or exceeded- your target!");
        } else {
            System.out.println("You did not reach your target. Better luck next time!");
        }

        System.out.println(dice.info());
    }
}