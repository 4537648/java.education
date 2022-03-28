package ru.gpbtest.distance;

import static java.lang.Math.sqrt;
import static ru.gpbtest.distance.Common.getSquared;

public class Point {

  public double x;
  public double y;

  public Point (double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double distance(Point p2) {
    return sqrt(getSquared(this.x - p2.x) + getSquared(this.y - p2.y));
  }
}
