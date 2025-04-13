package OPPS.SingletonClass;

public class singleton {


    private singleton(){

    }

    private static singleton instance;

    public static singleton getInstance(){
      //check wheather  obj is created or not
        if(instance==null){
            instance= new singleton();

        }
        return instance;
    }
}
