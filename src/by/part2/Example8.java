package by.part2;

import java.util.Arrays;

public class Example8 {

  void print(double a) {
    System.out.println(a);
  }

  void print(String a) {
    System.out.println(a);
  }

  void print(int[] a) {
    System.out.println(Arrays.toString(a));
  }


  public static void main(String[] args) {
    Example8 example8 = new Example8();
    example8.print("String param");
    example8.print(100d);
    example8.print(new int[]{1, 2, 3});
  }
}
