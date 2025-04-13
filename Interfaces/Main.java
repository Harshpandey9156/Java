package Interfaces;

public class Main {
    public static void main(String[] args) {
        Engine car= new Car();
        car.acc();
        car.start();
//        System.out.println(car.a);
//        car.harsh();
//        PoweEngine powercar=new PoweEngine();

//        powercar.acc();

        NiceCar niceCar=new NiceCar();
        niceCar.start();
        niceCar.stop();
        niceCar.StartMusic();
        niceCar.StopMusic();
        niceCar.upgradeEngine();
        niceCar.start();


    }
}
