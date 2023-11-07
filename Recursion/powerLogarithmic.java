package Recursion;

import java.util.Scanner;

public class powerLogarithmic {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int x = scn.nextInt();
    int n = scn.nextInt();
    System.out.println(pl(x,n));
    scn.close();
  }

  private static int pl(int x, int n) {
    if(n == 0) {
      return 1;
    }
    int xnb2 = pl(n, n /2);
    int xn = xnb2 * xnb2;
    if(n % 2 == 1) {
      xn = xn * x;
    }
    return xn;
  }
}
