import java.util.Scanner;

public class Percentages {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter the Percentage: ");
      double percentage = input.nextDouble();
      
      System.out.print("Enter the Base: ");
      double base = input.nextDouble();
      
      computePercent(percentage, base);
      
   }
   
   public static void computePercent(double percentage, double base) {
      double rate = percentage / base;
      int rateWhole = (int) (rate * 100);
      System.out.println(percentage+ " is " +rateWhole+ " percent of " +base);
      
      
   }
}