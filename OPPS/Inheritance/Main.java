package OPPS.Inheritance;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Inheritance Inhert= new Inheritance(4,8,0);


        System.out.println(Inhert.l+ " "+ Inhert.b + "  "  + Inhert.h);

        Weight Box=new Weight(3,5,6,6);
        System.out.println(Box.l+" "+Box.b+" "+Box.h+" "+Box.weights);


        Inheritance abc= new Weight(3,4,6,7);
        System.out.println(abc.l);


        WeightPrice Name=new WeightPrice(78.25);
        System.out.println(Name.name);

        WeightPrice abcc=new WeightPrice(5 ,8,5,8);

        WeightPrice ab2 = new WeightPrice( 2,4,6,6);



    }
}
