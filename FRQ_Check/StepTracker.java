// type up the complete StepTracker class here

public class StepTracker {
   private int dailySteps;
   private int activeDays;
   private int totalDays;
   private int totalSteps;
   
   public StepTracker(int dailySteps) {
      this.dailySteps = dailySteps;
      activeDays = 0;
      totalDays = 0;
      totalSteps = 0;
   }

   public void addDailySteps(int steps){
      totalDays ++;
      totalSteps += steps;
      if (steps >= dailySteps) {
          activeDays ++;
      }
   }

   public int activeDays() {
      return activeDays;
   }
   public double averageSteps () {
      if (totalDays == 0) {
         return 0.0;
      }
      return (double)totalSteps/(double)totalDays;
   }
}