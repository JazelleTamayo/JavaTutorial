import java.util.Scanner;

public class JobPricing {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter the name of the job: ");
      String jobName = input.nextLine();
      System.out.print("Enter the cost of materials: ");
      double cost = input.nextDouble();
      System.out.print("Enter the number of work hours: ");
      int workHours = input.nextInt();
      System.out.print("Enter the number of travel hours: ");
      int travelHours = input.nextInt();
      
      double jobCost = calcCost(cost, workHours, travelHours); 
      System.out.println("The job cost is " +jobCost);  
   }
   
   public static double calcCost(double cost, int workHours, int travelHours) {
      double jobCost = (double) cost + (workHours * 35) + (travelHours * 12);
      return jobCost;
   }
}