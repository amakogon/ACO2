package week2.day2.geometry;

public class Kvadrat extends Figure{
  private double side;

  public Kvadrat(double side){
    this.side = side;
  }

  public double getSide() {
    return side;
  }

  public double square(){
    return side * side;
  }
}
