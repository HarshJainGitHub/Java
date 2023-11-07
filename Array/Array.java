import java.util.*;

public class Array {
  public static void fun(int[] arr) {
    arr[1] = 52;
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[5];
    arr[0] = 50;
    arr[1] = 51;
    fun(arr);
    for(int val: arr) {
      System.out.println(val);
    }
    sc.close();
  }
}