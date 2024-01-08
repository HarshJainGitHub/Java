package Strings;

import java.util.Scanner;

public class StringCompression {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    System.out.println(compression(str));
    System.out.println(compression2(str));
    scn.close();
  }

  private static String compression(String str) {
    String s = Character.toString(str.charAt(0));
    for (int i = 1; i < str.length(); i++) {
      char curr = str.charAt(i);
      char prev = str.charAt(i - 1);
      if (curr != prev) {
        s += curr;
      }
    }
    return s;
  }

  private static String compression2(String str) {
    String s = Character.toString(str.charAt(0));
    int count = 1;

    for (int i = 1; i < str.length(); i++) {
      char curr = str.charAt(i);
      char prev = str.charAt(i - 1);
      if (curr == prev) {
        count++;
      } else {
        if (count > 1) {
          s += count;
          count = 1;
        }
        s += curr;
      }
    }
    if (count > 1) {
      s += count;
      count = 1;
    }
    return s;
  }
}
