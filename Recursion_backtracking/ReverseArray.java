package Recursion_backtracking;

import java.util.Arrays;

public class ReverseArray {

    static void reverseArray(int a[], int i, int n){
        if(i >= n/2)
            return;
        swap(a, i, n-i-1);
        reverseArray(a, i+1, n);
    }

    static void swap(int a[] , int l, int r){
        int temp = a[l];
        a[l] = a[r];
        a[r] = temp;
    }

    public static void main(String args[]){
        int a[] = {1,2,3,4,5};
        reverseArray(a, 0, a.length);
        System.out.println(Arrays.toString(a));
     }

}
