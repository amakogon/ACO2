package week2.day2.geometry;

public class Rectangular extends Figure{
  private double width;
  private double height;

  public Rectangular(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public double getHeight() {
    return height;
  }

  public double square(){
    return width * height;
  }

}
