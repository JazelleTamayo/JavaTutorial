import java.util.Scanner;

public class ChiliToGo {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.print("How many adult are there? ");
      int numAdult = input.nextInt();
      System.out.print("How many children are there? ");
      int numChildren = input.nextInt();
            
      
      int adultMeal = numAdult * 7;
      int childMeal = numChildren * 4;
      int total = adultMeal + childMeal;
      
      System.out.println("Adult Meal Total: $" +adultMeal);
      System.out.println("Child Meal Total: $" +childMeal);
      System.out.println("OverAll Meal: $" +total);
      
      float adultProfit = (float) ((7 - 4.35) * numAdult);
      float childrenProfit = (float) ((4 - 3.10) * numChildren);
      float totalProfit = adultProfit + childrenProfit;  
      
      System.out.println("Profit in adult meal: $" +adultProfit);
      System.out.println("Profit in children meal: $" +childrenProfit);
      System.out.println("The total profit: $" +totalProfit);
             
      
         
   }
}