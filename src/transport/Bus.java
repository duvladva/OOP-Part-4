package transport;

import transport.Exeption.DiagnosticFailedExeption;
import transport.driver.DriverD;

public class Bus extends Transport <DriverD> {

    PassengerCapacity passengerCapacity; // поле перечисляемого типа
    Bus(String brand, String model, Double engineVolume, DriverD driverD, PassengerCapacity passengerCapacity) {
        super(brand, model, engineVolume, driverD);
        this.passengerCapacity = passengerCapacity;
    }

    public PassengerCapacity getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(PassengerCapacity passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public boolean diagnostics() throws DiagnosticFailedExeption {
        return false;
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
        return "Автобус: " + brand + ", модель: " + model + ", объем двигателя: " + engineVolume + ", " + passengerCapacity;
    }

    @Override
    public void printType() {
        if (passengerCapacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Кузов: " + passengerCapacity);
        }
    }
}

