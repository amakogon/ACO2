package week4.day2;

public class Vidrizok {

  private Point pointA;
  private Point pointB;

  public Vidrizok(int x1, int y1, int x2, int y2) {
    this.pointA = new Point(x1, y1);
    this.pointB = new Point(x2, y2);
  }

  public double length() {
    return Math.pow(pointB.x - pointA.x, 2)
      + Math.pow(pointB.y - pointA.y, 2);
  }

  public double getX1() {
    return pointA.x;
  }

  public double getX2() {
    return pointB.x;
  }

  public double getY1() {
    return pointA.y;
  }

  public double getY2() {
    return pointB.y;
  }

  private static class Point {
    private final float x;
    private final float y;

    private Point(float x, float y) {
      this.x = x;
      this.y = y;
    }

    public float getX() {
      return x;
    }

    public float getY() {
      return y;
    }

    @Override
    public String toString() {
      return String.format("[x=%f,y=%f]", x, y);
    }

    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      }
      if (null == obj) {
        return false;
      }
      if (!(obj instanceof Point)) {
        return false;
      }

      Point other = ((Point) obj);
      return x == other.x && y == other.y;
    }
  }
}
