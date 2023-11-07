package Pattern;

import java.util.Scanner;

public class Pattern4 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int sp = 0, st = n;

    for(int i =1; i <= n;i++) {
      for(int j = 1; j <= sp; j++) {
        System.out.print("_ ");
      }
      for(int k=1; k <= st; k++) {
        System.out.print("* ");
      }
      System.out.println();
      sp++;
      st--;
    }
    s.close();
  }
}
