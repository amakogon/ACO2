package week1.contactBook;

public class ContactList {
  private Contact[] contacts = new Contact[16];
  private int index;

  public void addContact(Contact contact) {
    if (index >= contacts.length) {
      //create new array
      //copy elemenets into new array
    }
    contacts[index++] = contact;
  }

  public void showContacts() {
    for (int i = 0; i < index; i++) {
      contacts[i].printInfo();
    }
  }

  public void removeLastContact() {
    index--;
  }

  public Contact find(String contactName) {
    for (int i = 0; i < size(); i++) {
      if (contacts[i].getName().equals(contactName)) {
        return contacts[i];
      }
    }
    return null;
  }

  public void showFirstFiveContacts() {
    for (int i = 0; i < 5 && i < size(); i++) {
      contacts[i].printInfo();
    }
  }

  public void showLastFiveContacts() {
    for (int i = size() - 1; i > size() - 6 && i >= 0; i--) {
      contacts[i].printInfo();
    }
  }

  public void showByOperator(String[] codes) {
    for (int i = 0; i < size(); i++) {
      for (int j = 0; j < codes.length; j++) {
        if (contacts[i].getPhoneNumber().substring(0, 3).equals(codes[j])) {
          contacts[i].printInfo();
        }
      }
    }
  }


  public int size() {
    return index;
  }

  public void showSortedContacts() {
    for (int i = 0; i < size(); i++) {
      for (int j = 0; j < size() - 1 - i; j++) {
        if (contacts[j].compareTo(contacts[j + 1]) > 0) {
          Contact temp = contacts[j];
          contacts[j] = contacts[j + 1];
          contacts[j + 1] = temp;
        }
      }
    }
    showContacts();
  }
}
