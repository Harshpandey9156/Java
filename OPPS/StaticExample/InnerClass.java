package OPPS.StaticExample;
 class Test{
    String Name;
    public Test(String Name){
        this.Name=Name;
    }
}
public class InnerClass {


    public static void main(String[] args) {
        Test a= new Test("harsh");
//        System.out.println(a.Name);
        Test b= new Test("pandey");

        System.out.println(a.Name);
        System.out.println(b.Name);
    }
}
