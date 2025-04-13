package AbstractDemo;

public class Daughter extends Parent {

    public Daughter(int age){
        this.age=age;
    }

    @Override
    void career() {
        System.out.println("i am an doughter");
    }

    @Override
    void Partner() {
        System.out.println("i am doughter Partner");

    }
}
