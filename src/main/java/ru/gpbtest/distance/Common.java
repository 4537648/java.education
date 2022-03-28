package ru.gpbtest.distance;

public class Common {

  public static double getSquared(double a) {
    return a * a;
  }

  public static int getRandomNumber(int min, int max) {
    return (int) ((Math.random() * (max - min)) + min);
  }

}
