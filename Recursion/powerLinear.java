package Recursion;

import java.util.Scanner;

public class powerLinear {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int p = scn.nextInt();
    System.out.println(pl(n,p));
    scn.close();
  }
  private static int pl(int n, int p) {
    if(p==0) {
      return 1;
    }
    int power = pl(n, p-1);
    int res = n * power;
    return res;
  }
}
