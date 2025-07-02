import javax.swing.JOptionPane;

public class SalaryDialog {
   public static void main(String[] args) {
   
      final double HOURS_IN_WEEK = 37.5;
      String wageString = JOptionPane.showInputDialog(null, "Enter employee''s hourly wage", "Salary dialog 1", JOptionPane.INFORMATION_MESSAGE);
      double weeklyPay = Double.parseDouble(wageString) * HOURS_IN_WEEK;
      
      String dependentString = JOptionPane.showInputDialog(null, "How many dependents?", "Salary Dialog 2", JOptionPane.QUESTION_MESSAGE);
      int dependents = Integer.parseInt(dependentString);
      
      JOptionPane.showMessageDialog(null, "Weekly salary is $" +weeklyPay+ "\nDeductions will be made for " +dependents+ " dependents");
   }
}