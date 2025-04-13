package Interfaces;

public class Car implements Engine,Break,Media {


    int a =10;
    @Override
    public void Break() {
        System.out.println("Break");
    }

    @Override
    public void start() {
        System.out.println("start");

    }

    @Override
    public void stop() {
        System.out.println("stop");

    }


//    @Override
//    public void harsh() {
//        System.out.println("harsh");
//
//    }

    @Override
    public void acc() {
        System.out.println("acc");

    }
}
