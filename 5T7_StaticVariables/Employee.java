public class Employee {
    private String firstName;
    private String lastName;
    private int employeeID;

    private static int mostRecentEmployeeID = 99;
    private static int totalEmployeesCreated = 0;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        mostRecentEmployeeID ++;
        employeeID = mostRecentEmployeeID;
        totalEmployeesCreated ++;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getId() {
        return employeeID;
    }

    public static int getMostRecentEmployeeID() {
        return mostRecentEmployeeID;
    }

    public static int getTotalEmployeesCreated() {
        return totalEmployeesCreated;
    }

    public String employeeInfo() {
        String str = "--------------------------\n";
        str += "Employee full name: " + getFullName() + "\n";
        str += "Employee ID: " + getId() + "\n";
        str += "Most recent ID assigned: " + getMostRecentEmployeeID() + "\n";
        str += "Total employees hired: " + getTotalEmployeesCreated() + "\n";
        str += "--------------------------\n";
        return str;
    }
}