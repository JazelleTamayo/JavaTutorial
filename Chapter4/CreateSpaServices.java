import java.util.Scanner;

public class CreateSpaServices {
   public static void main(String[] args) {
      String service;
      double price;
      
      SpaService firstService = new SpaService();
      SpaService secondService = new SpaService();
      Scanner input = new Scanner(System.in);
      
     
      System.out.print("Enter service: ");
      service = input.nextLine();
      System.out.print("Enter price: ");
      price = input.nextDouble();
      
      firstService.setServiceDescription(service);
      firstService.setPrice(price);
      System.out.println("First Service details:");
      System.out.println(firstService.getServiceDescription());
      System.out.println("$" +firstService.getPrice());
      
      input.nextLine();
      System.out.print("\nEnter service: ");
      service = input.nextLine();
      System.out.print("Enter price: ");
      price = input.nextDouble();

      secondService.setServiceDescription(service);
      secondService.setPrice(price);
      System.out.println("Second Service details:");
      System.out.println(secondService.getServiceDescription());
      System.out.println("$" +secondService.getPrice());
        
   }
}