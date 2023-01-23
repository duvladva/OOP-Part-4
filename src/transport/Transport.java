package transport; // информирует что класс Transport находится в пакете transport


import transport.Exeption.DiagnosticFailedExeption;
import transport.driver.Driver; // Импортируется класс Driver из пакета driver, входящего в пакет transport. Зачем?

public abstract class Transport<T extends Driver> implements Competing {
    public final String brand;
    public final String model;
    public Double engineVolume;
    private final T driver;

    private static final String DEFAULT_VALUE = "default";
    private static final Double DEFAULT_ENGINE_VALUE = 2.0;

    public Transport(String brand,
                     String model,
                     Double engineVolume,
                     T driver) {

        if (brand == null || brand.isBlank()) {
            this.brand = DEFAULT_VALUE;
        } else {
            this.brand = brand;
        }

        if (model == null || model.isBlank()) {
            this.model = DEFAULT_VALUE;
        } else {
            this.model = model;
        }

        setEngineVolume(engineVolume);
        this.driver = driver;

    }

    public abstract boolean diagnostics() throws DiagnosticFailedExeption; // метод для выбрасывания исключения DiagnosticFailedExeption

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Double getEngineVolume() {
        return engineVolume;
    }


    public void setEngineVolume(Double engineVolume) {
        if (engineVolume == null || engineVolume <= 0) {
            this.engineVolume = DEFAULT_ENGINE_VALUE;

        } else {
            this.engineVolume = engineVolume;
        }
    }


    public T getDriver() {
        return driver;
    }

    public void startMove() {
        System.out.println("Транспортное средство начало движение");
    }


    public void finishMove() {
        System.out.println("Транспортное средство закончило движение");
    }



    public abstract void printType();
}

