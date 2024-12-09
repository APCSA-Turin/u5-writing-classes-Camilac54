public class Student {
    private String firstName;
    private int points;
    private static int greatestPoints = 0;
    private static int totalPoints = 0;

    public Student(String firstName) {
        this.firstName = firstName;
        points = 0;
    }

    public void addPoints(int val) {
        points += val;
        totalPoints += val;

        if (points > greatestPoints) {
            greatestPoints = points;
        }

    }

    public static int getTotalPointsEarned() {
        return totalPoints;
    }

    public static int getGreatestPoints() {
        return greatestPoints;
    }

    public String studentInfo() {
        String str = "Student: " + firstName + "\n";
        str += "Student's Points: " + points;
        return str;
    }

    public static String classInfo() {
        String str = "Total points earned by all students: " + totalPoints + "\n";
        str += "Most points earned by any student: " + greatestPoints;
        return str;
    }
}