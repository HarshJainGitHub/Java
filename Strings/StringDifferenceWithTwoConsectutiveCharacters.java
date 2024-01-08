package Strings;

import java.util.Scanner;

public class StringDifferenceWithTwoConsectutiveCharacters {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    System.out.println(Solution(str));
    scn.close();
  }

  private static String Solution(String str) {
    String s = Character.toString(str.charAt(0));
    for (int i = 1; i < str.length(); i++) {
      char curr = str.charAt(i);
      char prev = str.charAt(i - 1);
      int diff = curr - prev;
      s += Integer.toString(diff) + curr;
    }
    return s;
  }
}
