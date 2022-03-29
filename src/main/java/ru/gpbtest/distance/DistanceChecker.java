package ru.gpbtest.distance;

import static ru.gpbtest.distance.Common.*;

public class DistanceChecker {
  public static void main(String[] args) {
    Point p1 = new Point(getRandomNumber(1,100), getRandomNumber(1,100));
    Point p2 = new Point(getRandomNumber(1,100), getRandomNumber(1,100));
    System.out.println("Point One is (X, Y): " + p1.x + ", " + p1.y);
    System.out.println("Point Two is (X, Y): " + p2.x + ", " + p2.y);
    System.out.println("Distance between points (main-class):  " + String.format("%.2f", distance(p1, p2)) );
    System.out.println("Distance between points (Point-class): " + String.format("%.2f", p1.distance(p2)) );
  }

  public static double distance(Point p1, Point p2) {
    return Math.sqrt(getSquared(p1.x - p2.x) + getSquared(p1.y - p2.y));
  }

}
