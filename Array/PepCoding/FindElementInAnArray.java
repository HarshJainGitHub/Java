package PepCoding;

import java.util.Scanner;

public class FindElementInAnArray {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int arr[] = new int[n];
    for(int i=0; i < arr.length; i++) {
      arr[i] = s.nextInt();
    }
    int distinct = s.nextInt();
    int res=-1;
    for(int j=0; j < arr.length;j++) {
      if(arr[j] == distinct) {
        res = j;
        break;
      }
    }
    System.out.println("The Index of "+distinct+" is "+res);
    s.close();
  }
}