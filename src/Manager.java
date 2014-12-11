import java.util.ArrayList;

public class Manager extends Employee {
  
  super(); //Actually I might not need this. Remove later.
  private ArrayList<Employee> directReports = new ArrayList<Employee>();
  private String department;
  
  //Accessors
  private String getDepartment() {
    return department;
  }
  
  private Employee getDirectReports() {
    return directReports;
  }
  
  private String toString() {
    return super.toString(manager);
  }
  
  //Mutators
  private void addDirectReport(Employee employee) {
    directReports.add(employee);
  }
  
  private void removeDirectReport(Employee employee) {
    directreports.remove(employee);
  }
  
  private void setDepartment(String dept) {
    department = dept;
  }
}
