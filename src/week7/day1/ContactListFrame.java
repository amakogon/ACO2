package week7.day1;

import week1.contactBook.Contact;
import week1.contactBook.ContactList;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ContactListFrame extends JFrame {

  private static final String TITLE = "Contact List";
  private ContactList contactList;
  private JTextArea contactInfoArea;

  public ContactListFrame(ContactList contactList) {
    this.contactList = contactList;
    setTitle(TITLE);
    setSize(500, 300);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    init();

    setVisible(true);
  }

  private void init() {

    JPanel buttonPanel = new JPanel(new GridLayout(4, 1));
    JButton addContact = new JButton("Add contact");
    JButton removeContact = new JButton("Remove contact");
    JButton sortContacts = new JButton("Sort contacts");
    JButton findContact = new JButton("Find contacts");


    addContact.addActionListener(new AddContactButtonListener());
    removeContact.addActionListener(new RemoveContactButtonListener());

    buttonPanel.add(addContact);
    buttonPanel.add(removeContact);
    buttonPanel.add(sortContacts);
    buttonPanel.add(findContact);

    contactInfoArea = new JTextArea();
    contactInfoArea.setLineWrap(true);
    contactInfoArea.setEditable(false);

    getContentPane().add(contactInfoArea);
    getContentPane().add(buttonPanel, BorderLayout.WEST);

    renderContactListArea();
  }

  private void renderContactListArea() {
    //clear area first by empty string
    contactInfoArea.setText("");

    //iterate over contacts and append to textArea
    Contact[] contacts = contactList.getContacts();
    for (int i = 0; i < contacts.length; i++) {
      contactInfoArea.append(contacts[i].toString() + "\n");
    }

  }

  private class AddContactButtonListener implements ActionListener {

    // call this method when button will be clicked
    @Override
    public void actionPerformed(ActionEvent e) {
      Contact contact = new Contact("new contact","+380930930932");
      contactList.addContact(contact);
      contactInfoArea.append(contact.toString() + "\n");
    }
  }

  private class RemoveContactButtonListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
      contactList.removeLastContact();
      renderContactListArea();
    }
  }


}
