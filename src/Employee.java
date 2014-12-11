public class Employee extends Person {
  
  super(first, last, age); ///Get the parameters from the superclass Person
  
  private double hourlyWage;
  private int hoursWorked;
  private String jobTitle;
  private Manager manager; //Add new field manager of type Manager
  
  private Employee(String first, String last, int age, double hourlyWage, int hoursWorked, String jobTitle){
    Employee.setFirstName(first);//Use the constructors and methods from superclas Person
    Employee.setLastName(last);
    Employee.setAge(age);
    
    Employee.setHourlyWage(hourlyWage);//Use the new constructors from class Employee
    Employee.setHoursWorked(hoursWorked);
    Employee.setJobTitle(jobTitle);
  }
  
  private double getWage() { //
    return hourlyWage;
  }
  
  private int getHours() { //
    return hoursWorked;
  }
  
  private double getWeeklySalary() {
    return hourlyWage*hoursWorked);
  }
  
  private double getYearlySalary() {
    return (getWeeklySalary())*52;
  }
  
  private String getJobTitle() {
    return jobTitle;
  }
  
  private String toString() {
    this.toString();
    return (Person.toString() + ": " + jobTitle + " @ $" + Employee.getYearlySalary());
  }
  
  private String getManager() {
    return manager;
  }
  
  //Mutators
  private void setWage(double newWage) {
    hourlyWage = newWage;
  }
  
  private void setHours(int h) {
    hours = h;
  }
  
  private void setJobTitle(String title) {
    jobTitle = title;
  }
  
  private void giveRaise() {
    hourlyWage++;
  }
  
  private void setManager(Manager newManager) {
    Manager manager = newManager;
    if(manager==null) {
      manager = newManager;
      Manager.addDirectReport(Employee);
    }
    else {
      Manager.removeDirectReport(Employee);
      setManager(newManager);
    }
  }
}
