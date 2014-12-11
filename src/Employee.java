public class Employee extends Person {
  
  super(first, last, age);
  private double hourlyWage;
  private int hoursWorked;
  private String jobTitle;
  //Add new field manager of type Manager
  
  private Employee(String first, String last, int age, double hourlyWage, int hoursWorked, String jobTitle);
  //Write a constructor that takes 6 parameters - the ones from Peron and the three others.
  
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
    return Manager.toString();
  }
  
  //Mutators
  private double setWage(double newWage) {
    hourlyWage = newWage;
    return hourlyWage;
  }
  
  private int setHours(int h) {
    hours = h;
    return hours;
  }
  
  private String setJobTitle(String title) {
    jobTitle = title;
    return jobTitle;
  }
  
  private double giveRaise() {
    hourlyWage++;
    return hourlyWage;
  }
  
  private String setManager(Manager newManager) {
    Manager manager = newManager;
    return manager;
  }
}
