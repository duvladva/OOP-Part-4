package transport.driver;

public class DriverC extends Driver { // класс DriverС - это класс производный от класса Driver

    public DriverC (String name, Boolean hasDriverLicense, int driverExperience) {
        super(name, hasDriverLicense, driverExperience); // при создании экземпляра класса DriverC значения полей передаются в конструктор базового класса
    }

    @Override
    public void startMove() {// переопределяем метод базового класса
        System.out.println("Водитель категории C " + getName() + " начал движение");

    }

    @Override
    public void finishMove() {// переопределяем метод базового класса
        System.out.println("Водитель категории C " + getName() + " завержил движение");

    }

    @Override
    public void refuel() {// переопределяем метод базового класса
        System.out.println("Водитель категории C " + getName() + " заправил заправился");

    }
}
