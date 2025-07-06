import java.util.Scanner;

public class QuartsToGallon {
   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
      final int quartsInGallon = 4;
      
      System.out.print("Please enter the number of quartz you want to convert in gallon: ");
      float quarts = input.nextFloat();
      
      float gallon = (float)(quarts / quartsInGallon);
      System.out.println(quarts+ " quarts to gallon is " +gallon+ " gallon");
      
      
      
       
   }
}