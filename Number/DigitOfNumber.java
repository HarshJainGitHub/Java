package Number;

import java.util.Scanner;

public class DigitOfNumber {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    Solution(n);
    scn.close();
  }

  private static void Solution(int n) {
    int dig = 0;
    int temp = n;

    while (temp != 0) {
      temp = temp / 10;
      dig++;
    }

    int div = (int) Math.pow(10, dig - 1);
    while(div != 0) {
      temp = n / div;
      n = n % div;
      div = div / 10;
      System.out.println(n);
    }
  }
}
