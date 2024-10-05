package Recursion_backtracking;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Subsequences {

        static void printAllSubsequences(int a[], int i, int n, ArrayList<Integer> list){
            if(i>=n) {
                System.out.println(list.stream().map(String::valueOf).collect(Collectors.joining(" ")));
                if(list.size() == 0)
                    System.out.println("{}");
                return;
            }
            list.add(a[i]);
            printAllSubsequences(a, i+1, n, list); // Taking current element
            list.remove(list.size() - 1);
            printAllSubsequences(a, i+1, n, list);// Not taking current element

        }

    public static void main(String args[]){
        int a[] = {3,1,2};
        ArrayList<Integer> l = new ArrayList<Integer>();
        printAllSubsequences(a, 0, a.length, l);
    }
}
