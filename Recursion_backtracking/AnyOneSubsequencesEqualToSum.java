package Recursion_backtracking;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class AnyOneSubsequencesEqualToSum {

    static boolean printAnyOneSubsequencesEqualToSum(int a[], int i, int n, ArrayList<Integer> list, int sum, int tempSum){
       if(i>=n){
           if(tempSum == sum){
               System.out.println(list.stream().map(String::valueOf).collect(Collectors.joining(" ")));
               return true;
           }
           else {
               return false;
           }
       }
       list.add(a[i]);
       tempSum += a[i];
       if(printAnyOneSubsequencesEqualToSum(a, i+1, n, list, sum, tempSum) == true)
           return true;
       list.remove(list.size()- 1);
       tempSum -= a[i];
       if(printAnyOneSubsequencesEqualToSum(a, i+1, n, list, sum, tempSum) == true)
           return true;
       return false;
    }

public static void main(String args[]){
    int a[] = {1,2,1};
    int targetSum = 2;
    int temporarySum = 0;
    ArrayList<Integer> l = new ArrayList<Integer>();
    printAnyOneSubsequencesEqualToSum(a, 0, a.length, l, targetSum, temporarySum);
}
}
