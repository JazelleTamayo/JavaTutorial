import java.util.Scanner;

public class YummyMotto {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
    
      System.out.println("*************************************************");
      System.out.println("*  Yummy makes the food that makes it a party.  *");
      System.out.println("*************************************************");
      
      System.out.print("Enter the number of guests attending: ");
      int guest = input.nextInt();
       
      int totalPrice = guest * 35;
      System.out.println("Guest " +guest);
      
      boolean isLarge = guest >= 50;
      System.out.println("It is a large event? " +isLarge); 
      
      System.out.println("Price per guest: 35");
      System.out.println("Total price: " +totalPrice);    
            
   }
}