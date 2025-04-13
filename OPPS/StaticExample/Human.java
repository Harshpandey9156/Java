package OPPS.StaticExample;

public class Human {
    int age;
    String Name;
    int salary;
    boolean married;

     static long population;

     static void fun(){
         System.out.println("hellow Name");
//         System.out.println(this.age);  // this is non static fun we cannot call this function in the static method
     }

    Human(int age, String name, int salary , boolean married){
        this.age=age;
        this.Name=name;
        this.salary=salary;
        this.married=married;

        Human.population+=1;



    }
}
