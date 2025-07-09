import java.util.Scanner;

public class Madlib {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter a noun: ");
      String noun = input.nextLine();
      System.out.print("Enter another noun: ");
      String noun2 = input.nextLine();
      System.out.print("Enter an adjective: ");
      String adjective = input.nextLine();
      System.out.print("Enter a pas-tense verb: ");
      String verb = input.nextLine();
      
      System.out.println("Mary had a little " +noun+ 
                        "\nIts " +noun2+ " was " +adjective+
                        "\nAnd everywhere that Mary " +verb+
                        "\nThe " +noun+ " was sure to go");
                        
      
      
   }
}