package GettingStarted;
import java.util.Scanner;

public class PrimeFactorization {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();

    for(int div = 2; div * div <=n; div++) {
      while( n % div == 0) {
        n = n / div;
        System.out.print(div+" ");
      }
    }

    if(n != 1) {
      System.out.print(n);
    }
    s.close();
  }
}

// Explanation :
// we will divide n till its divided by div.
// if it fails to divide then increment div
// and div * div <= n
