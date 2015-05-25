package week6.io;

import java.io.File;
import java.io.IOException;

public class Ex3 {
  public static void main(String[] args) {
    File file = new File("/home/amakogon/TempFile");
    System.out.println(file.exists());
    System.out.println(file.getAbsolutePath());
    try {
      boolean isCreated = file.createNewFile();
      System.out.println(isCreated);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
