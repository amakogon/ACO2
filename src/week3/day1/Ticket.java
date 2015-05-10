package week3.day1;

public class Ticket {
  private int id;
  private int place;

  private static int counter;

  public Ticket(int place) {
    this.place = place;
    id = counter++;
  }

  public static int getCounter(){
    return counter;
  }
}
