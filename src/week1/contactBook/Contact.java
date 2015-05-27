package week1.contactBook;

import week2.day1.Developer;

import java.io.Serializable;

public class Contact implements Comparable<Contact>, Serializable {
  private String name;
  private String phoneNumber;
  private transient Developer dev = new Developer("s", 2);
  private int age;

  public Contact() {
//    System.out.println("in constructor");
  }

  public Contact(String contactName, String contactPhoneNumber) {
    name = contactName;
    phoneNumber = contactPhoneNumber;
  }

  public void printInfo() {
    System.out.println("Name = " + name
                         + ", phone = " + phoneNumber
                         + ",age = " + age);
  }

  public void setAge(int contactAge) {
    if (contactAge > 0) {
      age = contactAge;
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Contact contact = (Contact) o;
    return name.equals(contact.name) && phoneNumber.equals(contact.phoneNumber);
  }

  @Override
  public String toString() {
    return String.format("Name=%s, phone=%s", name, phoneNumber);
  }

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }

  public void setName(String contactName) {
    name = contactName;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String contactPhoneNumber) {
    phoneNumber = contactPhoneNumber;
  }

  @Override
  public int compareTo(Contact contact) {
    return name.compareTo(contact.name);
  }
}
