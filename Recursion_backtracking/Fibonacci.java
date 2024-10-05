package Recursion_backtracking;

public class Fibonacci {

    static int fibonacciSeries(int num){
      if(num <= 1)
          return num;
      return fibonacciSeries(num - 1) + fibonacciSeries(num - 2);
    }

    public static void main(String args[]){
        int result = fibonacciSeries(4);
        System.out.println(result);
    }
}
