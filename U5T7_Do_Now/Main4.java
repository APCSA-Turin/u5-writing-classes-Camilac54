public class Main4 {
    public static void main(String[] args) {
         // creating a Rectangle object and getting its area
         // using the area instance method
         Rectangle2 myRect = new Rectangle2(3, 10);
         double rectArea = myRect.area(); // calling the area instance method
         System.out.println(rectArea);

         // converting feet to inches using the
         // feetToInches static "utility" method
         double inches = Rectangle2.feetToInches(6.5); // calling the feetToInches STATIC method
         System.out.println(inches);

         //1. Look at the code above; PREDICT the output -- then run to confirm.
         //   -> ANSWER Question a) what was the printed output?

         //2. Note how the area method and feetToInches are being called above;
         //   -> ANSWER Question b) how is calling the area instance method
         //      different from calling the feetToInches static method?

         //3. Compare the code for the area and feetToInches methods
         //   in the Rectangle class;
         //   -> ANSWER Question c) which method makes use of instance
         //      variables and which one doesn't?

         //4. Try adding the "static" keyword to the area method then running
         //   the code above again; what is the error? (now change the method
         //   back to non-static)
         //   -> ANSWER Question d) can static methods use instance variables?

         //5. Add a perimeter method to the Rectangle class that returns
         //   the perimeter of the Rectangle object as a double
         //   THEN ADD TEST CODE BELOW THAT USES THE METHOD TO OBTAIN
         //   AND PRINT THE PERIMETER OF the myRect object created above (should be 26.0)
         double perimeter = myRect.perimeter();
         System.out.println(perimeter);



         //6. -> ANSWER Question e) copy/paste your perimeter method and
         //      the test code you wrote above

         //7. -> ANSWER Question f) Did you write the perimeter method
         //      as an instance method or a static method? Why?
         //      If you made the method static, try making it non-static
         //      and vice versa; can it be written the other way?  Why or why not?

         //8. Add a inchesToFeet "utility" method to the Rectangle class that has
         //   a double parameter and returns that value converted to feet
         //   THEN ADD TEST CODE BELOW THAT USES THE METHOD TO OBTAIN
         //   AND PRINT 100 inches converted to feet (should be 8.333...)
        double feet = Rectangle2.inchesToFeet(100.0);
        System.out.println(feet);


         //9. -> ANSWER Question g) copy/paste your inchesToFeet method and
         //      the test code you wrote above

         //10. -> ANSWER Question h) Did you write the inchesToFeet method
         //       as an instance method or static method? Why?
         //       If you made the method static, try making it non-static
         //       and vice versa; can it be written the other way?  Why or why not?

         //11. -> ANSWER Question j) what kind of methods do you think
         //       make good candidates for instance methods and which make
         //       good candidates for static methods?

         //12. -> ANSWER Question k) inchesToFeet could have been written as
         //       a static method or instance method; in this situation,
         //       which do you think is preferred?
    }
}