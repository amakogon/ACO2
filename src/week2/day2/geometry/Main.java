package week2.day2.geometry;

public class Main {
  public static void main(String[] args) {
    Circle circle = new Circle(1);
    Kvadrat kvadrat = new Kvadrat(2);
    Rectangular rectangular = new Rectangular(1, 2);

    Figure f = new Circle(2);
//    Figure figure = new Figure();

    System.out.println("Circle squeare = " + FigureHelper.square(circle));
    System.out.println("Kvadrat squeare = " + FigureHelper.square(kvadrat));
    System.out.println("Rectangular square = " + FigureHelper.square(rectangular));
  }
}
