package week2.day2.geometry;

public class Circle extends Figure{
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public double square() {
    return Math.PI * radius * radius;
  }
}
