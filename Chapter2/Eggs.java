import java.util.Scanner;

public class Eggs {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter the number of eggs ordered: ");
      int numEggs = input.nextInt();
      
      
      int dozen = numEggs / 12;
      int numInDozen = dozen * 12;    
      int exceedEgg = numEggs - numInDozen ;
         
      double dozenSum = (double) (dozen * 3.25);
      double exceedSum = (double) (exceedEgg * 0.45);
         
      double total = dozenSum + exceedSum;
      
      System.out.println("You ordered " +numEggs+ " eggs. That's " +dozen+ " dozen at $3.25 per dozen and " +exceedEgg+ " loose eggs at 0.45 cents each for a total of $" +total);
               
      
   }
}