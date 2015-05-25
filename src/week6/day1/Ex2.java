package week6.day1;

public class Ex2 {
  public static void main(String[] args) throws MyCustomException {
    try{
      if(Math.random() < 0.5) {
        throw  new MyCustomException("alarma");
      }
    } finally {
      System.out.println("After alarma");
    }
  }
}
