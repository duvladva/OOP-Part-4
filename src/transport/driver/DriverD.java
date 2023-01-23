package transport.driver;

public class DriverD extends Driver { // класс DriverD - это класс производный от класса Driver

    public DriverD (String name, Boolean hasDriverLicense, int driverExperience) {
        super(name, hasDriverLicense, driverExperience); // при создании экземпляра класса DriverD значения полей передаются в конструктор базового класса
    }

    @Override
    public void startMove() {// переопределяем метод базового класса
        System.out.println("Водитель категории D " + getName() + " начал движение");

    }

    @Override
    public void finishMove() {// переопределяем метод базового класса
        System.out.println("Водитель категории D " + getName() + " завержил движение");

    }

    @Override
    public void refuel() {// переопределяем метод базового класса
        System.out.println("Водитель категории D " + getName() + " заправил заправился");

    }
}
