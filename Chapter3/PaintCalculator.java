import java.util.Scanner;

public class PaintCalculator {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter the length in foot: ");
      double length = input.nextDouble();
      System.out.print("Enter the width in foot: ");
      double width = input.nextDouble();
      System.out.print("Enter the height foot: ");
      double height = input.nextDouble();
      
      int price = calcWallArea(length, width, height);
      System.out.print("The total price of paint is will be used in the room is $" +price);
      
   }
   
   public static int calcWallArea(double length, double width, double height) {
      double area = 2 * (length + width) * height;
      double gallon = calcGallons(area);
      System.out.println("The gallons needed are " +gallon+ " gallons.");
      int price = (int) gallon * 32;
      return price;
   }
   
   public static double calcGallons(double area) {
      double gallon = area / 350;
      return gallon;
   }
   
}