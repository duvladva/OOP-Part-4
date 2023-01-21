package transport;

import transport.driver.DriverC;

public class Truck extends Transport <DriverC> {

    FullMass fullMass; // поле перечисляемого типа
    public Truck(String brand, String model, Double engineVolume, DriverC driverC, FullMass fullMass) {

        super(brand, model, engineVolume, driverC);
        this.fullMass = fullMass;
    }

    public FullMass getFullMass() {
        return fullMass;
    }

    public void setFullMass(FullMass fullMass) {
        this.fullMass = fullMass;
    }

    @Override
    public void startMove() {
        System.out.println("Грузовик марки " + getBrand() + ", модель: " + getModel() + " начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Грузовик марки " + getBrand() + ", модель: " + getModel() + " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у грузовика " + getBrand());

    }

    @Override
    public void theBestCircleTime() {
        int minCircleTime = 200;
        int maxCircleTime = 300;
        int bestCircleTime = (int) (minCircleTime + (maxCircleTime - minCircleTime) * Math.random());
        System.out.println("Лучшее время круга для грузовика " + bestCircleTime);
    }

    @Override
    public void maxSpeed() {
        int minSpeed = 50;
        int maxSpeed = 130;
        int maxSpeedRacingCar = (int) (minSpeed + (maxSpeed - minSpeed) * Math.random());
        System.out.println("Максимальная скорость грузовика " + maxSpeedRacingCar);
    }

    @Override
    public String toString() {
        return "Грузовик: " + brand + ", модель: " + model + ", объем двигателя: " + engineVolume + ", " + fullMass;
    }

    @Override
    public void printType() {
        if (fullMass == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Кузов: " + fullMass);
        }
    }
}
