package transport;

import transport.Exeption.DiagnosticFailedExeption;
import transport.driver.DriverC;

public class Truck extends Transport <DriverC> {

    private FullMass fullMass; // поле перечисляемого типа
    Truck(String brand, String model, Double engineVolume, DriverC driverC, FullMass fullMass) {

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
    public boolean diagnostics() throws DiagnosticFailedExeption { // переопределение метода diagnostics()
        if (getDriver() != null && getDriver().isDriverLicense()) {
            return true;
        } else {
            throw new DiagnosticFailedExeption();
        }

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
        return "Грузовик: " + getBrand() + ", модель: " + getModel() + ", объем двигателя: " + getEngineVolume() + ", " + fullMass;
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
