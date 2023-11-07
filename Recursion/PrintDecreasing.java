package Recursion;

import java.util.Scanner;

public class PrintDecreasing {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    printDecrease(n);
    scn.close();
  }

  private static void printDecrease(int n) {
    if(n== 0) {
      return;
    }
    System.out.println(n);
    printDecrease(n-1);
  }
}
