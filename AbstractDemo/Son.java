package AbstractDemo;

public class Son extends Parent{

    public Son(int age){
        this.age=age;
    }

    @Override
    void career() {
        System.out.println("I am in Son career");
    }

    @Override
    void Partner() {
        System.out.println("I am in the Son pARTNER");

    }

    public void age() {
        System.out.println(age);
    }
}

