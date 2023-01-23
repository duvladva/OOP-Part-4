package transport;

import transport.Exeption.DiagnosticFailedExeption;
import transport.driver.DriverB;
import transport.driver.DriverC;
import transport.driver.DriverD;

public class Main {
    public static void main(String[] args) {

        DriverB driverB = new DriverB("Андрей Андреевич Андреев", false, 5);
        DriverC driverC = new DriverC("Борис Борисович Борисов", true, 6);
        DriverD driverD = new DriverD("Владимир Владимирович Владимиров", true, 5);

        Car Lada = new Car("Lada", "Vesta", 1.7, driverB, CaseType.SEDAN);
        Car Audi = new Car("Audi", "", 3.0, driverB, CaseType.HATCHBACK);
        Car Bmv = new Car("BMV", "BMV Z8", 2.0, driverB, CaseType.OFFROAD);
        Car Hyundai = new Car("Hyundai", "Hyundai Avant", 1.6, driverB, CaseType.MINIVAN);

        Bus Daewoo = new Bus("Daewoo", "mod001", 3.0, driverD, PassengerCapacity.N2);
        Bus Mercedes = new Bus("Mercedes", "mod002", 2.8, driverD, PassengerCapacity.N5);
        Bus Paz = new Bus("PAZ", "mod003", 3.5, driverD, PassengerCapacity.N1);
        Bus LiAZ = new Bus("LiAZ", "5292", 3.2, driverD, PassengerCapacity.N3);

        Truck KamAZ = new Truck("KamAZ", "5320", 10.0, driverC, FullMass.N1);
        Truck MAZ = new Truck("MAZ", "5432", 11.0, driverC, FullMass.N2);
        Truck Volvo = new Truck("Volvo", "2012", 12.0, driverC, FullMass.N3);
        Truck DAF = new Truck("DAF", "105", 13.0, driverC, FullMass.N1);

        System.out.println("Создаем объекты класса Car с определенными значениями параметров:");
        System.out.println(Lada); // вывод в консоль тех параметров объекта, которые определены в методе toString
//        System.out.println("У объекта Lada в поле CaseType установлено значение \"Седан\", изменяем его на \"Хэтчбек\"");
//        Lada.setCaseType(CaseType.HATCHBACK);
//        System.out.println("У объекта Lada проверяем значение поля CaseType");
//        System.out.println(Lada);

        System.out.println(Audi);
        System.out.println(Bmv);
        System.out.println(Hyundai);

        System.out.println("Создаем объекты класса Bus с определенными значениями параметров:");
        System.out.println(Daewoo); // вывод в консоль тех параметров объекта, которые определены в методе toString
        System.out.println(Mercedes);
        System.out.println(Paz);
        System.out.println(LiAZ);

        System.out.println("Создаем объекты класса Truck с определенными значениями параметров:");
        System.out.println(KamAZ); // вывод в консоль тех параметров объекта, которые определены в методе toString
        System.out.println(MAZ);
        System.out.println(Volvo);
        System.out.println(DAF);


        printInfo(Lada);
        printInfo(Audi);
        printInfo(Bmv);
        printInfo(Hyundai);
        printInfo(Daewoo);
        printInfo(Mercedes);
        printInfo(Paz);
        printInfo(LiAZ);
        printInfo(KamAZ);
        printInfo(MAZ);
        printInfo(Volvo);
        printInfo(DAF);


        try {
            System.out.println(Lada.diagnostics());
        } catch (DiagnosticFailedExeption e) {
            e.printStackTrace();
        }

        try {
            System.out.println(KamAZ.diagnostics());
        } catch (DiagnosticFailedExeption e) {
            e.printStackTrace();
        }
    }

    private static void printInfo(Transport<?> transport) {
        System.out.println("Водитель " + transport.getDriver().getName() + " управляет автотранспортом " + transport.getBrand() + "  модель " + transport.getModel() + " и будет учавствовать в заезде");

    }


}