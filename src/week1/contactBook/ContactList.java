package week1.contactBook;

public class ContactList {
  private Contact[] contacts = new Contact[16];
  private int index;

  public void addContact(Contact contact) {
    if(index >= contacts.length){
      //create new array
      //copy elemenets into new array
    }
    contacts[index] = contact;
    index++;
  }

  public void showContacts(){
    for (int i = 0; i < index; i++) {
      contacts[i].printInfo();
    }
  }
}
