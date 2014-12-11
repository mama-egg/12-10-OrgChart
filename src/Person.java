public class Person {
  
  private String first;
  private String last;
  private int age;
  
  private Person blap = new Person(); //Create a blank person
  
  private Person inpp = new Person(String x, String y, int z) { //Create a person and set their values using input
    first = x;
    last = y;
    age = z;
  }
  
  private String getFirstName() { //Return the Person's first name
    return first;
  }
  
  private void setFirstName(String x) {
    first = x;
  }
  
  private String getLastName() { //Return the Person's last name
    return last;
  }
  
  private void setLastName(String y) {
    last = y;
  }
  
  private int getAge() { //Find and return the Person's age
    return age;
  }
  
  private void setAge(int z) {
    age = z;
  }
  
  private void toString() { //Print the Person's name as last, first
    System.out.println(last + ", " + first);
  }
  
  private int recordBirthday() { //Add 1 to a Person's age
    age++;
    return age;
  }
}//End superclass Person
