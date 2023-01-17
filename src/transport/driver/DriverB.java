package transport.driver;

public class DriverB extends Driver { // класс DriverB - это класс производный от класса Driver

    public DriverB(String name, Boolean hasDriverLicense, int driverExperience) {
        super(name, hasDriverLicense, driverExperience); // при создании экземпляра класса DriverB значения полей передаются в конструктор базового класса
    }

    @Override
    public void startMove() { // переопределяем метод базового класса
        System.out.println("Водитель категории В " + getName() + " начал движение");

    }

    @Override
    public void finishMove() { // переопределяем метод базового класса
        System.out.println("Водитель категории В " + getName() + " завержил движение");

    }

    @Override
    public void refuel() { // переопределяем метод базового класса
        System.out.println("Водитель категории В " + getName() + " заправился");

    }
}
