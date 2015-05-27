package week1.contactBook.io;

import week1.contactBook.ContactList;

import java.io.File;
import java.io.IOException;

public interface ISaver {

   void save(ContactList contactList, File destination) throws IOException;
}
