package OPPS.StaticExample;

public class main {
    public static   void main(String[] args) {
        Human harsh =new Human(22,"Harsh PAndey", 1000,false);
        Human abc =new Human(21,"harsh",2000,true);

        System.out.println(Human.population);
        Human abcd =new Human(21,"harsh",2000,true);

        System.out.println(Human.population);
        greating();
    }

    static void greating(){
        System.out.println("harsh");
    }
}
