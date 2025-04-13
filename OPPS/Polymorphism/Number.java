package OPPS.Polymorphism;




//Method Overridding exaple are here


import java.util.Arrays;

public class Number {
    int sum(int a , int b){
        return a+b;
    }

    int sum (int a , int b ,int c){
        return a+b +c;
    }

    public static void main(String[] args) {
        Number abc=new Number();

        abc.sum(2,4,5);
        System.out.println(abc.sum(2,4,5 ));
//        System.out.println(Arrays.toString());
    }
}
