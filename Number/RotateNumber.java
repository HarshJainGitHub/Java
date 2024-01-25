package Number;

import java.util.Scanner;

public class RotateNumber {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int k = scn.nextInt();
    int nod = 0;
    int temp = n;
    while (temp > 0) {
      temp = temp / 10;
      nod++;
    }
    Solution(n, k, nod);
    scn.close();
  }

  private static void Solution(int n, int k, int nod) {
    int div = 1;
    int mul = 1;

    // special case if k is greater than number of digits
    k = k % nod;

    // if rotation number k is negative
    if (k < 0) {
      k = k + nod;
    }

    for (int i = 1; i <= nod; i++) {
      if (i <= k) {
        div = div * 10;
      } else {
        mul = mul * 10;
      }
    }

    int q = n / div;
    int r = n % div;
    int rot = r * mul + q;
    System.out.println(rot);
  }
}
