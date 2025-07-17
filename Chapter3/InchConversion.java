import java.util.Scanner;

public class InchConversion {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter the inch you want to convert: ");
      double inch = input.nextDouble();
      
      inchToFeet(inch);
   }
   
   public static void inchToFeet(double inch) {
      double feet = inch / 12;
      System.out.println(feet+ " feet in " +inch+ " inch");
      feetToYard(feet);
   }
   
   public static void feetToYard(double feet) {
      double yard = feet / 3;
      System.out.println(yard+ " yard in " +feet+ " feet ");
   }
}