import java.util.Scanner;

public class MethodsThatUseEmployee {
   public static void main(String[] args) {
      Employee myEmployee = getEmployeeData();
      displayEmployee(myEmployee);
   }
   
   public static Employee getEmployeeData() {
      Employee tempEmp = new Employee();
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter Employee ID: ");
      int id = input.nextInt();
      tempEmp.setEmpNum(id);
      
      System.out.print("Enter Employee Salary: ");
      double sal = input.nextDouble();
      tempEmp.setEmpSalary(sal);
      return tempEmp;   
   
   }
   
   public static void displayEmployee(Employee myEmployee) {
      System.out.println("\nEmployee #" +myEmployee.getEmpNum()+ " \nSalary is " +myEmployee.getEmpSalary());
   
   }
}