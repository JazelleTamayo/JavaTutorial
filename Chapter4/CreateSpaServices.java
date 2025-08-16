import java.util.Scanner;

public class CreateSpaService {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
   
      SpaService firstService = new SpaService();
      SpaService secondService = new SpaService();
   
      firstService = getData(firstService);
      System.out.println("Service: " +firstService.getServiceDescription());
      System.out.println("Price: " +firstService.getPrice());

      secondService = getData(secondService);
      System.out.println("Service: " +secondService.getServiceDescription());
      System.out.println("Price: " +secondService.getPrice());       
   
  }
  
   public static SpaService getData(SpaService service) {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter service: ");
      String serviceDescription = input.nextLine();
      System.out.print("Enter price: ");
      double price = input.nextDouble();
      input.nextLine();
      
      service.setServiceDescription(serviceDescription);
      service.setPrice(price);
      return service;
  
  }
}
