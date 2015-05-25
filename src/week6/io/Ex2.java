package week6.io;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class Ex2 {
  public static void main(String[] args) throws IOException {
    Reader reader
      = new InputStreamReader(new FileInputStream("/home/amakogon/TempFile"));
    StringBuilder builder = new StringBuilder();
    char[] buffer = new char[3];
    int next = reader.read(buffer);
    while(next != -1){
      for (int i = 0; i < next; i++) {
        builder.append(buffer[i]);
      }
      next = reader.read(buffer);
    }
    System.out.println(builder);

    Writer writer
      = new OutputStreamWriter(new FileOutputStream("/home/amakogon/TempFile", true));
    writer.write("Using writer");
    writer.flush();

  }
}
