package Recursion;

import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    System.out.println(fact(n));
    scn.close();
  }

  private static int fact(int n) {
    if(n==1) {
      return 1;
    }
    int fnm1 = fact(n-1);
    int fn = n * fnm1;
    return fn;
  }
}


/*
 * n = 5
 * fnm1 = fact(5-1);
 * fn = 5 * 4;
 * return 20
 * 
 */
