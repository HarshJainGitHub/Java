package GettingStarted;

import java.util.Scanner;

public class GCD {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n1 = s.nextInt();
    int n2 = s.nextInt();
    int res, on1 =n1, on2 =n2;
    while(n1 % n2 != 0) {
      res = n2 % n1;
      n2 = n1;
      n1 = res;
    }
    int gcd = n2;
    int lcm = (on1 * on2) / gcd;
    System.out.println("The GCD is "+n2);
    System.out.println("The LCM is "+lcm);
    s.close();
  }
}
