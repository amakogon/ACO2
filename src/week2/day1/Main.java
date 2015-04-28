package week2.day1;

public class Main {
  public static void main(String[] args) {
    Developer dev1 = new Developer("Valera", 200);

    System.out.println(dev1.asString());

//    dev1.setName("Valera");
//    dev1.setSalary(200);
    dev1.setLanguageType("Java");
    dev1.writeCode();
    System.out.println(dev1.asString());

    System.out.println("~~~~~~~~~~~~");
    Tester tester1 = new Tester("Alla", 500);

    tester1.setTesterType("Manual");
    System.out.println(tester1.asString());
    tester1.test();


  }
}
