package by.part1.homework;

import java.util.stream.IntStream;

public class HomeWork4 {

  //  Complete the program which takes date in number format and then makes its addition of the digits until
// the last digit remains single and the print the number as lucky number.
// example if input is 777 then 7+7+7 =21 = 2+1 =3 so the answer is 3.
  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 6, 7, 8, 9, 10};

    int result = 0;

    for (int i : a) {
      if (i % 2 == 0) {
        if (i < 10) {
          if (i >= 2) {
            result += i;
          }
//          if(result > 16){
//            break;
//          }
        }
      }
    }
    System.out.println(result);

    int sum = IntStream.range(1, 10)
        .filter(x -> x % 2 == 0)
        .filter(x -> x < 10)
        .filter(x -> x >= 2)
        .map(x -> x * 2)
        .sum();
    System.out.println(sum);
  }
}
