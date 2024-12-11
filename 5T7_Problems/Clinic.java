public class Clinic {
    private int vaccineCount;
    private static int totalClinics = 0;
    private static int totalVaccinated = 0;
    private Person mostRecent;

    public Clinic() {
        totalClinics ++;
        vaccineCount = 0;
        mostRecent = null;
    }

    public int getVaccineCount() {
        return vaccineCount;
    } 

    public static int getTotalClinics() {
        return totalClinics;
    }

    public static int getTotalVaccinated() {
        return totalVaccinated;
    }

    public Person getMostRecent() {
        return mostRecent;
    }

    public boolean vaccinate(Person person) {
        if(!person.isVaccinated()) {
            person.setVaccinated(true);
            vaccineCount ++;
            totalVaccinated ++;
            mostRecent = person;
            return true;
        } else {
            return false;
        }
    }
}