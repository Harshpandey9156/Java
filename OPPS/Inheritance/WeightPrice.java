package OPPS.Inheritance;

public class WeightPrice  extends Weight{
    String name ="Harsh Pandey";

    WeightPrice(String name){
        this.name=name;
    }

    WeightPrice(){
        this.name=name;
    }

    public WeightPrice(double weights){
        super(weights);

        System.out.println(weights);

    }
    public WeightPrice(double l ,double h,double b,double weights){
        super(l,b,h,weights);
        System.out.println(l+b+h+weights);
    }

}
