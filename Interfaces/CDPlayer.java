package Interfaces;

public class CDPlayer implements Media{
    @Override
    public void start() {
        System.out.println("play sound");

    }

    @Override
    public void stop() {
        System.out.println("Stop sound");

    }


}
