import java.util.ArrayList;

public class Manager extends Employee {
  
  super(first, last, age, hourlyWage, hoursWorked, jobTitle);
  private ArrayList<String> directReports = new ArrayList<String>();
  private String department;
  
  //Accessors
  private String getDepartment() {
    return department;
  }
  
  private String getDirectReports() {
    return directReports;
  }
  
  private String toString() {
    return Manager.toString();
  }
  
  //Mutators
  private void addDirectReport(Employee employee) {
    directReports.add(employee);
  }
  
  private void removeDirectReport(Employee employee) {
    directreports.remove(employee);
  }
  
  private String setDepartment(String dept) {
    department = dept;
  }
}
