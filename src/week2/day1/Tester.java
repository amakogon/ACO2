package week2.day1;

public class Tester extends Employee {

  public Tester(String name, int salary){
    super(name, salary);
  }

  private String testerType;

  public String getTesterType() {
    return testerType;
  }

  public void setTesterType(String testerType) {
    this.testerType = testerType;
  }

  public void test() {
    System.out.println("I am testing");
  }

  public String asString() {
    return "Name = " + getName() + ", salary = "
      + getSalary() + ", " + testerType;
  }

  public void doWork(){
    System.out.println("I am testing");
  }

}
