package week6.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex1 {
  public static void main(String[] args) throws IOException {
    InputStream inputStream
      = new FileInputStream("/home/amakogon/TempFile");

    StringBuilder builder = new StringBuilder();
    int next = inputStream.read();
    while(next != -1){
      builder.append((char) next);
      next = inputStream.read();
    }
    System.out.println(builder);


    OutputStream outputStream
      = new FileOutputStream("/home/amakogon/TempFile", true);
    outputStream.write('!');
  }
}
