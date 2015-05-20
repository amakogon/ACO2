package week5.day2;

import java.util.Date;

public class TestClone {
  public static void main(String[] args) {
    Human human = new Human("Igor");
    human.setAge(23);
    System.out.println(human);

    Human tester = null;
    try {
      tester = human.cloneHuman();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    tester.setAge(52);
    tester.setName("Adam");
    tester.setBirthday(new Date(System.currentTimeMillis() * 2));
    System.out.println("After clone");
    System.out.println(human);
    System.out.println(tester);

  }
}
