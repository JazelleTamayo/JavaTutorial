import java.util.Scanner;

public class BookstoreCredit {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter your name: ");
      String name = input.nextLine();
      System.out.print("Enter your Grade: ");
      float grade = input.nextFloat();
      
      showCredit(name, grade);
   }
   
   public static void showCredit(String name, float grade) {
      int credit = (int) (grade * 10);
      
      System.out.println(name+ ", your credit is " +credit);
   }
}