package week6.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileHelper {

  public static String read(String filePath) throws IOException {
    return read(new File(filePath));
  }

  public static String read(File file) throws IOException {

    BufferedReader reader = null;
    StringBuilder stringBuilder;
    try {
      reader = new BufferedReader(new FileReader(file));
      stringBuilder = new StringBuilder();
      while (reader.ready()) {
        stringBuilder.append(reader.readLine()).append('\n');
      }
    } finally {
      if (reader != null) {
        reader.close();
      }
    }
    return stringBuilder.toString();
  }

}
