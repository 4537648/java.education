package ru.gpbtest.distance;

import static java.lang.Math.sqrt;

public class DistanceChecker {
  public static void main(String[] args) {
    Point p1 = new Point((double)getRandomNumber(1,100), (double)getRandomNumber(1,100));
    Point p2 = new Point((double)getRandomNumber(1,100), (double)getRandomNumber(1,100));
    System.out.println("Point One is (X, Y): " + p1.x + ", " + p1.y);
    System.out.println("Point Two is (X, Y): " + p2.x + ", " + p2.y);
    System.out.println("Distance between points: " + String.format("%.2f", distance(p1, p2)) );
  }

  public static double distance(Point p1, Point p2) {
    return sqrt(getSquared(p1.x - p2.x) + getSquared(p1.y - p2.y));
  }

  public static double getSquared(double a) {
    return a * a;
  }

  public static int getRandomNumber(int min, int max) {
    return (int) ((Math.random() * (max - min)) + min);
  }

}
