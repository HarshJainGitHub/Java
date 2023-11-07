package GettingStarted;
import java.util.Scanner;

public class PerfectSquare {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    for (int i = 1; i * i <= n; i++)
    {
      System.out.println(i * i);
    }
    scn.close();
  }
}