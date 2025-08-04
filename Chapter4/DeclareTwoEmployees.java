public class DeclareTwoEmployees { 
   public static void main(String[] args) {
      Employee clerk = new Employee();
      Employee driver = new Employee();
      
      clerk.setEmpNum(345);
      System.out.println(clerk.getEmpNum());
      driver.setEmpNum(567);
      System.out.println(driver.getEmpNum());
      
   }
}