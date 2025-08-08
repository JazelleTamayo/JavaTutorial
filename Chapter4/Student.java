public class Student {
   String firstName, lastName, course, section;
   int year;
   float midGrade, finalGrade;
   
   Student(String firstName, String lastName, int year, String course, String section, float midGrade, float finalGrade) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.year = year;
      this.course = course;
      this.section = section;
      this.midGrade = midGrade;
      this.finalGrade = finalGrade;
      
   }
   
   public void introduceSelf() {
      System.out.println("Name: " +firstName+ " " +lastName);
      System.out.println("Course: " +course);
      System.out.println("Section: " +section);
      
   }
   
   public void evaluateGrade() {
      float average = (midGrade + finalGrade) / 2;
      
      if (average <= 2.0) {
         System.out.println("Standing: Honor!");
      }else if (average <= 3.0) {
         System.out.println("Standing: Pass!");
      }else{
         System.out.println("Standing: Failed!");
      }   
      
   }
   
   
}