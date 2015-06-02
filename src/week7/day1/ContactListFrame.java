package week7.day1;

import java.awt.*;
import javax.swing.*;

public class ContactListFrame extends JFrame {

  private static final String TITLE = "Contact List";

  public ContactListFrame() {
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

    buttonPanel.add(addContact);
    buttonPanel.add(removeContact);
    buttonPanel.add(sortContacts);
    buttonPanel.add(findContact);

    JTextArea contactInfo = new JTextArea();
    contactInfo.setLineWrap(true);
    contactInfo.setEditable(false);

    getContentPane().add(contactInfo);
    getContentPane().add(buttonPanel, BorderLayout.WEST);
  }
}
