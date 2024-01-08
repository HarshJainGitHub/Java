package Strings;

import java.util.Scanner;

public class PalindromicSubStrings {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String s1 = scn.next();
    for (int i = 0; i < s1.length(); i++) {
      for (int j = i + 1; j <= s1.length(); j++) {
        String ss = s1.substring(i, j);
        if (isPalindrome(ss)) {
          System.out.println(ss);
        }
      }
    }
    scn.close();
  }

  private static boolean isPalindrome(String ss) {
    int i = 0;
    int j = ss.length() - 1;
    while (i <= j) {
      char c1 = ss.charAt(i);
      char c2 = ss.charAt(j);
      if (c1 != c2) {
        return false;
      } else {
        i++;
        j--;
      }
    }
    return true;
  }
}
