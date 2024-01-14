package Strings;

import java.util.Scanner;

public class PermutationIteratative {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    Solution(str);
    scn.close();
  }

  private static void Solution(String str) {
    int strlen = str.length();
    int fact = factorial(strlen);
    for (int i = 0; i < fact; i++) {
      int temp = i;
      StringBuilder sb = new StringBuilder(str);
      for (int div = strlen; div >= 1; div--) {
        int q = temp / div;
        int r = temp % div;
        System.out.print(sb.charAt(r));
        sb.deleteCharAt(r);
        temp = q;
      }
      System.out.println();
    }
  }

  private static int factorial(int n) {
    int val = 1;
    for (int i = 2; i <= n; i++) {
      val *= i;
    }
    return val;
  }
}
