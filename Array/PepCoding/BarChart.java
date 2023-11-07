package PepCoding;

import java.util.Scanner;

public class BarChart {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int size = s.nextInt();
    int arr[] = new int[size];
    for(int i=0; i<arr.length;i++){
      arr[i] = s.nextInt();
    }
    int max = arr[0];
    for(int i=1; i < arr[i]; i++) {
      if(max < arr[i]) {
        max = arr[i];
      }
    }
    for(int floor=max; floor >= 1; floor--){
      for(int i=0 ; i<arr.length;i++){
        if(arr[i] >= floor) {
          System.out.print("* ");
        }
        else {
          System.out.print("- ");
        }
      }
      System.out.println();
    }
    s.close();
  }
}
