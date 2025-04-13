package OPPS.Inheritance;

import java.sql.SQLOutput;

public class Weight extends Inheritance {
//    public static void main(String[] args) {
//        Inheritance inherit =new Inheritance();
//        System.out.println(inherit.h +" " +inherit.b +" " + inherit.l);
//    }

    double weights ;
    Weight(){
        this.weights=4;
    }

    Weight(double weights){
        this.weights=weights;

    }

    public Weight(double l,double h,double b,double weights){
        super(l, b, h);
        this.weights=weights;
    }

//    public Weight (String name){
//        super(l);
//    }

}
