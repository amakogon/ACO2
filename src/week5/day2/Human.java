package week5.day2;

import java.util.Date;

public class Human implements Cloneable, Comparable<Human> {
  private String name;
  private int age;
  private Date birthday;

  public Human(String name) {
    this.name = name;
    birthday = new Date();
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Human{" +
      "name='" + name + '\'' +
      ", age=" + age +
      ", birthday=" + birthday +
      '}';
  }

  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }

  public Human cloneHuman() throws CloneNotSupportedException {
    String cloneName = name + "";
    Date clonedDate = (Date) birthday.clone();
    Human cloned = new Human(cloneName);
    cloned.setAge(age);
    cloned.setBirthday(clonedDate);
    return cloned;
  }

  @Override
  public int compareTo(Human o) {
    return 0;
  }
}
