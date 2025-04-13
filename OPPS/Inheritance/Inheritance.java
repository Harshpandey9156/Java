package OPPS.Inheritance;

public class Inheritance {
     double l;
     double b;
     double h;


     Inheritance(){
         this.b=-1;
         this.h=-1;
         this.l=-1;
      }



     //cube

    Inheritance(double square){
        this.b=square;
        this.h=square;
        this.l=square;
//        displayInfo();
    }


    Inheritance(Inheritance  old){
         this.h=old.h;
         this.l=old.l;
         this.b=old.b;

    }

    Inheritance(double l, double b, double h){
        System.out.println("parent constructor");
         this.l=l;
         this.b=b;
         this.h=h;
    }

    public void displayInfo(){
        System.out.println("Running the Box");
    }
}

