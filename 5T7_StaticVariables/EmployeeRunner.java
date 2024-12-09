public class EmployeeRunner {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Jim", "Mason");
        System.out.println(employee1.employeeInfo());

        System.out.println(Employee.getMostRecentEmployeeID());
        System.out.println(Employee.getTotalEmployeesCreated());

        Employee employee2 = new Employee("Amy", "Adams");
        System.out.println(employee2.employeeInfo());

        System.out.println(Employee.getMostRecentEmployeeID());
        System.out.println(Employee.getTotalEmployeesCreated());

        Employee employee3 = new Employee("Bob", "Ross");
        System.out.println(employee3.employeeInfo());

        System.out.println(Employee.getMostRecentEmployeeID());
        System.out.println(Employee.getTotalEmployeesCreated());

        Employee employee4 = new Employee("Bob", "Ross");
        System.out.println(employee4.employeeInfo());

        System.out.println(Employee.getMostRecentEmployeeID());
        System.out.println(Employee.getTotalEmployeesCreated());
    }
}
