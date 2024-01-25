package Number;

import java.util.Scanner;

public class InverseNumber {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    Solution(n);
    scn.close();
  }

  private static void Solution(int n) {
    int op = 1;
    int inv = 0;

    while (n != 0) {
      int od = n % 10;
      int id = op;
      int ip = od;

      inv = inv + id * (int) Math.pow(10, ip - 1);

      n = n / 10;
      op++;
    }
    System.out.println(inv);

  }
}
