package week2.day1;

public class EmployeeCreateTest {
  public static void main(String[] args) {
//    Employee employee = new Employee();
    Tester tester = new Tester("Igor", 150);
    System.out.println(tester.asString());
    Developer dev1 = new Developer("Andrew", 100);
    dev1.setLanguageType("Java");
    Developer dev2 = new Developer("Andrew", 100);
    dev2.setLanguageType("Java");
    Developer dev3 = new Developer("Panas", 100);

    System.out.println(dev1.isSame(dev2));
    System.out.println(dev1.isSame(dev3));
    System.out.println("~~~~~~~~~~~~~~~~~~~~");
    System.out.println(dev1.equals(dev2));
    System.out.println(dev1.toString());

  }
}
