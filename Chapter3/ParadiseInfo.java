import java.util.Scanner;

public class ParadiseInfo {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter cutoff price for discount: ");
      double price = input.nextDouble();
      System.out.print("Enter discount rate as a whole number: ");
      double discount = input.nextDouble();
      
      double savings = computerDiscountInfo(price, discount);
      
      System.out.println("Special this week on any service over " +price);
      System.out.println("Discount of " +discount+ " percent");
      System.out.println("That's a savings at least $" +savings);
      
   }
   
   public static double computerDiscountInfo(double price, double discount) {
      double savings = price * discount / 100;
      return savings;      
   }
}