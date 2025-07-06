import java.util.Scanner;

public class InchesToFeet {
   public static void main(String[] args) {
      final int feetToInch = 12;
      
      Scanner input = new Scanner(System.in);
      
      System.out.print("Please enter the number of inch you want to convert into feet: ");
      int inch = input.nextInt();
      int feet = inch / feetToInch;
      int exceedInch = inch % feetToInch;
      
      System.out.println(inch+ " inch becomes " +feet+ " feet and " +exceedInch+ " inch");
      
   }
}