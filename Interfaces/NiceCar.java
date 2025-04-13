package Interfaces;

public class NiceCar {

    private Engine engine;
    private  Media player=new CDPlayer();

    public NiceCar(){
        engine =new PoweEngine();

    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void StartMusic(){
        player.start();

    }
    public void StopMusic(){
        player.stop();

    }

    public void upgradeEngine(){
        this.engine=new ElectricCar();
    }

}
