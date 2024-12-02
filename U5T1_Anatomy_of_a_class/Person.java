package U5T1_Anatomy_of_a_class;

public class Person {
    private String firstName;
    private int meetings;

    public Person (String firstName, String lastName) {
        this.firstName = firstName;
        meetings = 0;
    }   

    public String getFirstName () {
        return firstName;
    }

    public int getMeetings () {
        return meetings;
    }

    public void setMeetings (int val) {
        meetings = val;
    }

    public void meet(Person secondPerson) {
        System.out.println("Hello, my name is " + firstName);
        System.out.println("Hi, my name is " + secondPerson.getFirstName ());

        meetings ++;
        secondPerson.setMeetings(secondPerson.getMeetings() + 1);
    }
 }