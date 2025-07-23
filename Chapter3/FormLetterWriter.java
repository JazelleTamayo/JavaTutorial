import java.util.Scanner;

public class FormLetterWriter {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter your First Name: ");
      String firstName =  input.nextLine();
      System.out.print("Enter your Last Name: ");
      String lastName = input.nextLine();
      
      displaySalutation(firstName);
      displaySalutation(firstName, lastName);
      
   }
   
   public static void displaySalutation(String firstName) {
      System.out.println("Dear " +firstName+ ";");
      
   }
   
   public static void displaySalutation(String firstName, String lastName) {
      System.out.println("Dear " +firstName+ " " +lastName+ ";");
      System.out.println("Thank you for your recent order. ");
   }
}