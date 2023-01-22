package transport.driver; // зачем эта строка? При её отсутсвии выводится сообщение "Missing package statement: 'transport.driver'" (Отсутствует оператор пакета: «transport.driver»)

public abstract class Driver { // базовый класс "Водитель", он абстрактный так как в нем имеется хотя бы один абстрактный метод. Таких тут три: startMove(), finishMove() и refuel().
    private String name;
    private Boolean hasDriverLicense;
    private int driverExperience;

    public Driver(String name, Boolean hasDriverLicense, int driverExperience) { // конструктор класса Driver - базовый класс для классов DriverB, DriverD, DriverC
        this.name = name;
        this.hasDriverLicense = hasDriverLicense;
        this.driverExperience = driverExperience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getHasDriverLicense() {
        return hasDriverLicense;
    }

    public void setHasDriverLicense(Boolean hasDriverLicense) {
        this.hasDriverLicense = hasDriverLicense;
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



}
