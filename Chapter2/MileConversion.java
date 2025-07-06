import java.util.Scanner;

public class MileConversion {
   public static void main(String[] args) {
      final int mileToInch =  63360;
      final int mileToFeet = 5280;
      final int mileToYards = 1760;
      
      Scanner input = new Scanner(System.in);
      
      System.out.print("Please enter the number of mile you want to convert in inch, feet, and yards: ");
      double mile = input.nextDouble();
      
      double inch = mile * mileToInch;
      double feet = mile * mileToFeet;
      double yards = mile * mileToYards;
      
      System.out.println(mile+ " mile convert to inch is " +inch+ " inch");
      System.out.println(mile+ " mile convert to feet is " +feet+ " feet");
      System.out.println(mile+ " mile convert to yards is " +yards+ " yards");
   }
}