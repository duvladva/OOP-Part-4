package transport;

import transport.driver.DriverB;

public class Car extends Transport<DriverB> {

    CaseType caseType; // поле перечисляемого типа

    public Car(String brand, String model, Double engineVolume, DriverB driverB, CaseType caseType) {

        super(brand, model, engineVolume, driverB);
        this.caseType = caseType;

    }

    public CaseType getCaseType() {
        return caseType;
    }

    public void setCaseType(CaseType caseType) {
        this.caseType = caseType;
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
        return "Автомобиль: " + brand + ", модель: " + model + ", объем двигателя: " + engineVolume + ", " + caseType;
    }

    @Override
    public void printType() {
        if (caseType == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Кузов: " + caseType);
        }
    }
}



