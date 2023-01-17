package transport;

import transport.driver.DriverB;

public class Car extends Transport <DriverB> {

    public Car(String brand, String model, Double engineVolume, DriverB driverB) {

        super(brand, model, engineVolume, driverB);

    }




    @Override
    public void startMove() {
        System.out.println("Автомобиль марки " + getBrand() + ", модель: " + getModel() + " начал движение");
    }



    @Override
    public void finishMove() {
        System.out.println("Автомобиль марки " + getBrand() + ", модель: " + getModel() + " закончил движение");
    }


    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у автомобиля " + getBrand());

    }

    @Override
    public void theBestCircleTime() {
        int minCircleTime = 100;
        int maxCircleTime = 200;
        int bestCircleTime = (int) (minCircleTime + (maxCircleTime - minCircleTime) * Math.random());
        System.out.println("Лучшее время круга для автомобиля " + bestCircleTime);
    }

    @Override
    public void maxSpeed() {
        int minSpeed = 150;
        int maxSpeed = 270;
        int maxSpeedRacingCar = (int) (minSpeed + (maxSpeed - minSpeed) * Math.random());
        System.out.println("Максимальная скорость автомобиля " + maxSpeedRacingCar);
    }

    @Override
    public String toString() {
        return "Автомобиль " + brand + " " +model + " " + engineVolume;
    }
}
