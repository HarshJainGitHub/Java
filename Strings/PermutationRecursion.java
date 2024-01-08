package Strings;

import java.util.Scanner;

public class PermutationRecursion {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    Solution(str, "");
    scn.close();
  }

  private static void Solution(String str, String asf) {
    if (str.length() == 0) {
      System.out.println(asf);
      return;
    }
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      String lpart = str.substring(0, i);
      String rpart = str.substring(i+1, str.length());
      String rstr = lpart + rpart;
      Solution(rstr, asf + ch);
    }
  }
}
