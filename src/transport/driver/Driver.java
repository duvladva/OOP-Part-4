package transport.driver; // зачем эта строка? При её отсутствии выводится сообщение "Missing package statement: 'transport.driver'" (Отсутствует оператор пакета: «transport.driver»)

public abstract class Driver { // Базовый класс "Водитель", он абстрактный так как в нем имеется хотя бы один абстрактный метод. Таких тут три: startMove(), finishMove() и refuel().
    private String name;
    private Boolean isDriverLicense;
    private int driverExperience;

    public Driver(String name, Boolean isDriverLicense, int driverExperience) { // конструктор класса Driver - базовый класс для классов DriverB, DriverD, DriverC
        this.name = name;
        this.isDriverLicense = isDriverLicense;
        this.driverExperience = driverExperience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean isDriverLicense() {
        return isDriverLicense;
    }

    public void setHasDriverLicense(Boolean hasDriverLicense) {
        this.isDriverLicense = hasDriverLicense;
    }

    public int getDriverExperience() {
        return driverExperience;
    }

    public void setDriverExperience(int driverExperience) {
        this.driverExperience = driverExperience;
    }

    public abstract void startMove(); // абстрактные методы, предназначены для их переопределения в производных классах
    public abstract void finishMove();
    public abstract void refuel();

    @Override
    public String toString() {
        return "Водитель " + name;
    }
}
