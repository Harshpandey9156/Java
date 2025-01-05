package Resurssion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibformula(3));
    }
    public static int fibformula(int n){
      return (int ) (Math.pow(((1+Math.sqrt(5))/2), n)/Math.sqrt(5));
    }


    public static int  fib( int n){
      if(n<2){
        return n;
      }
      return fib(n-1)+fib(n-2);
    }

}
