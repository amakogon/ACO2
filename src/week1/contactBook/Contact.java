package week1.contactBook;

public class Contact implements Comparable<Contact>{
  private String name;
  private String phoneNumber;
  private int age;

  public Contact(){
//    System.out.println("in constructor");
  }

  public Contact(String contactName, String contactPhoneNumber){
    name = contactName;
    phoneNumber = contactPhoneNumber;
  }

  public void printInfo(){
    System.out.println("Name = " + name
                         + ", phone = " + phoneNumber
                         + ",age = " + age);
  }

  public void setAge(int contactAge){
    if(contactAge > 0) {
      age = contactAge;
    }
  }

  public int getAge(){
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
