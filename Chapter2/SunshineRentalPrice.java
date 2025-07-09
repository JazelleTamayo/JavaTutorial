import java.util.Scanner;

public class SunshineRentalPrice {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Please enter the number of minutes: ");
      int minute = input.nextInt();
      
      int hour = minute / 60;
      int leftMinute = minute % 60;
      
      int price = hour * 40;
      int totalPrice = leftMinute + price;
      
      System.out.println("Hour: " +hour);
      System.out.println("Minute: " +leftMinute);
      System.out.println("Total Price: " +totalPrice);
      
   }
}