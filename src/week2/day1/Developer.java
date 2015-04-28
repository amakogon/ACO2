package week2.day1;

public class Developer extends Employee {

  private String languageType;

  public Developer(String name, int salary) {
    super(name, salary);
  }

  public void writeCode() {
    System.out.println("I am writing code....");
  }

  public void setLanguageType(String languageType) {
    this.languageType = languageType;
  }

  public String getLanguageType() {
    return languageType;
  }

  public String asString() {
//    String s = "Name = " + name + ", salary = " + salary
//      + ", " + languageType;
//    return s;
    return "Name = " + getName() + ", salary = " + getSalary()
      + ", " + languageType;
  }

  public boolean isSame(Developer developer){
   return getName().equals(developer.getName())
      && getSalary() == developer.getSalary()
     && languageType.equals(developer.getLanguageType());
  }

  public void doWork(){
    System.out.println("I am writing code....");
  }

  public String toString(){
    return "Name = " + getName() + ", salary = " + getSalary()
      + ", " + languageType;
  }
}
