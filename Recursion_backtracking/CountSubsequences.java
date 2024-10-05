package Recursion_backtracking;

import java.util.ArrayList;

public class CountSubsequences {

    static Integer countofAllSubsequncesEqualToSum(int a[] , int i, int n, int sum, int tempSum, ArrayList<Integer> list){
      if(i>=n){
          if(tempSum == sum)
              return 1;
          else
              return 0;
      }
      tempSum += a[i];
      int l = countofAllSubsequncesEqualToSum(a,i+1, n, sum, tempSum, list);
      tempSum -= a[i];
      int r = countofAllSubsequncesEqualToSum(a, i+1, n, sum, tempSum, list);
      return l + r;
    }

   public static void main(String args[]) {
    int a[] = {1,2,1};
    int sum = 2;
    int tempSum = 0;
    ArrayList l = new ArrayList<Integer>();
    int result = countofAllSubsequncesEqualToSum(a, 0, a.length, sum, tempSum, l);
    System.out.println(result);
   }
}
