package OPPS;


public class StudentFile {

    public static void main(String[] args) {
        Student stude = new Student(14,"harsh ",25.25f); // No need for MainClass instance
        Student harsh = new Student();
        System.out.println(stude.name);
        System.out.println(stude.rollno);
        System.out.println(stude.mark);


        stude.Greating();

        Student abc;
        for (int i = 0; i < 10; i++) {
            abc= new Student();

        }

    }

    static class Student {  // Now static
        int rollno;
        String name;
        float mark;



        void Greating() {
            System.out.println("Hello " + this.name);

        }
        public Student(){
            int rollno=23;
            String name="paned";
            float mark=23.4f;

        }

        public Student(int rollno, String name, float mark) {  // Constructor
            this.rollno = rollno;
            this.name = name;
            this.mark = mark;
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("destroyed");
        }
    }
}
