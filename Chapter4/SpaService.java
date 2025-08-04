public class SpaService {
   private String serviceDescription;
   private double price;
   
   public void setServiceDescription(String service) {
      serviceDescription = service;
   
   }
   
   public String getServiceDescription() {
      return serviceDescription;
   }
   
   public void setPrice(double servicePrice) {
      price = servicePrice;
   }
   
   public double getPrice() {
      return price;
   }

}