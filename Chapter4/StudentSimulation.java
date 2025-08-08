import java.util.Scanner;

public class StudentSimulation {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Please enter your first name: ");
      String firstName = input.nextLine();
      System.out.print("Please enter your last name: ");
      String lastName = input.nextLine();
      System.out.print("Please enter year: ");
      int year = input.nextInt();
      input.nextLine();
      System.out.print("Please enter course: ");
      String course = input.nextLine();
      System.out.print("Please enter section: ");
      String section = input.nextLine();
      System.out.print("Please enter midterm grade: ");
      float midGrade = input.nextFloat();
      System.out.print("Please enter final grade: ");
      float finalGrade = input.nextFloat();
      
      Student info = new Student(firstName, lastName, year, course, section, midGrade, finalGrade);
      info.introduceSelf();
      info.evaluateGrade();
      
      
   }
}