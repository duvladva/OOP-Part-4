package transport;

import transport.driver.DriverD;

public class Bus extends Transport <DriverD> {


    public Bus(String brand, String model, Double engineVolume, DriverD driverD) {
        super(brand, model, engineVolume, driverD);
    }


    @Override
    public void startMove(){
        System.out.println("Автобус марки " + getBrand() + ", модель: " + getModel() +" начал движение");
    }

    @Override
    public void finishMove(){
        System.out.println("Автобус марки " + getBrand() + ", модель: " + getModel() + " закончил движение");
    }


    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у автобуса " + getBrand());

    }

    @Override
    public void theBestCircleTime() {
        int minCircleTime = 150;
        int maxCircleTime = 250;
        int bestCircleTime = (int) (minCircleTime + (maxCircleTime - minCircleTime) * Math.random());
        System.out.println("Лучшее время круга для автобуса " + bestCircleTime);
    }

    @Override
    public void maxSpeed() {
        int minSpeed = 50;
        int maxSpeed = 170;
        int maxSpeedRacingCar = (int) (minSpeed + (maxSpeed - minSpeed) * Math.random());
        System.out.println("Максимальная скорость автобуса " + maxSpeedRacingCar);
    }

    @Override
    public String toString() {
        return "Автобус " + brand + " " +model + " " + engineVolume;
    }
}

