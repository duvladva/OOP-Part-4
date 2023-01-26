package transport;


import transport.driver.Driver;
import transport.driver.DriverB;
import transport.driver.DriverC;
import transport.driver.DriverD;
import transport.mechanic.Mechanic;
import transport.mechanic.STO;
import transport.mechanic.TransportType;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        DriverB driverB = new DriverB("Андрей Андреевич Андреев", true, 5);
        DriverC driverC = new DriverC("Борис Борисович Борисов", true, 6);
        DriverD driverD = new DriverD("Владимир Владимирович Владимиров", true, 5);

        Car carLada = new Car("Lada", "Vesta", 1.7, driverB, CaseType.SEDAN);
        Car carAudi = new Car("Audi", "", 3.0, driverB, CaseType.HATCHBACK);
        Car carBmv = new Car("BMV", "BMV Z8", 2.0, driverB, CaseType.OFFROAD);
        Car carHyundai = new Car("Hyundai", "Hyundai Avant", 1.6, driverB, CaseType.MINIVAN);


        Bus busDaewoo = new Bus("Daewoo", "mod001", 3.0, driverD, PassengerCapacity.N2);
        Bus busMercedes = new Bus("Mercedes", "mod002", 2.8, driverD, PassengerCapacity.N5);
        Bus busPaz = new Bus("PAZ", "mod003", 3.5, driverD, PassengerCapacity.N1);
        Bus busLiAZ = new Bus("LiAZ", "5292", 3.2, driverD, PassengerCapacity.N3);

        Truck truckKamAZ = new Truck("KamAZ", "5320", 10.0, driverC, FullMass.N1);
        Truck truckMAZ = new Truck("MAZ", "5432", 11.0, driverC, FullMass.N2);
        Truck truckVolvo = new Truck("Volvo", "2012", 12.0, driverC, FullMass.N3);
        Truck truckDAF = new Truck("DAF", "105", 13.0, driverC, FullMass.N1);

        System.out.println("Создаем объекты класса Car с определенными значениями параметров:");
        System.out.println(carLada); // вывод в консоль тех параметров объекта, которые определены в методе toString
//        System.out.println("У объекта Lada в поле CaseType установлено значение \"Седан\", изменяем его на \"Хэтчбек\"");
//        Lada.setCaseType(CaseType.HATCHBACK);
//        System.out.println("У объекта Lada проверяем значение поля CaseType");
//        System.out.println(Lada);

        System.out.println(carAudi);
        System.out.println(carBmv);
        System.out.println(carHyundai);

        System.out.println("Создаем объекты класса Bus с определенными значениями параметров:");
        System.out.println(busDaewoo); // вывод в консоль тех параметров объекта, которые определены в методе toString
        System.out.println(busMercedes);
        System.out.println(busPaz);
        System.out.println(busLiAZ);

        System.out.println("Создаем объекты класса Truck с определенными значениями параметров:");
        System.out.println(truckKamAZ); // вывод в консоль тех параметров объекта, которые определены в методе toString
        System.out.println(truckMAZ);
        System.out.println(truckVolvo);
        System.out.println(truckDAF);


//        System.out.println(Lada.getBrand().getBytes());
//        printInfo(Lada);
//        printInfo(Audi);
//        printInfo(Bmv);
//        printInfo(Hyundai);
//        printInfo(Daewoo);
//        printInfo(Mercedes);
//        printInfo(Paz);
//        printInfo(LiAZ);
//        printInfo(KamAZ);
//        printInfo(MAZ);
//        printInfo(Volvo);
//        printInfo(DAF);


//        try {
//            System.out.println(Lada.diagnostics());
//        } catch (DiagnosticFailedExeption e) {
//            e.printStackTrace();
//        }

//        try {
//            System.out.println(KamAZ.diagnostics());
//        } catch (DiagnosticFailedExeption e) {
//            e.printStackTrace();
//        }

        List<Driver> drivers = new ArrayList<>();
        drivers.add(driverB);
        drivers.add(driverC);
        drivers.add(driverD);


        Mechanic mechanic1 = new Mechanic("Максимов Максим", "Винтик", TransportType.ALL);
        Mechanic mechanic2 = new Mechanic("Михайлов Михаил", "Шпунтик", TransportType.ALL);
        Mechanic mechanic3 = new Mechanic("Магомедов Магомед", "Серпантин", TransportType.ALL);

        carLada.addMechanic(mechanic1);
        carLada.addMechanic(mechanic2);
        carLada.addMechanic(mechanic3);

        busDaewoo.addMechanic(mechanic3);

        truckKamAZ.addMechanic(mechanic1);
        truckKamAZ.addMechanic(mechanic1);
        truckKamAZ.addMechanic(mechanic3);

        List<Transport<?>> racers = new ArrayList<>(); // список водителей
        racers.add(carLada);
        racers.add(busDaewoo);
        racers.add(truckKamAZ);

        for (Transport<?> transport: racers) {
            System.out.println(transport + " " + transport.getDriver() + " " + transport.getMechanics());
        }

        STO sto = new STO();

        sto.addTransport(carLada);
        sto.addTransport(busDaewoo);
        sto.addTransport(truckKamAZ);

        sto.runTO();
        sto.runTO();
        sto.runTO();
    }

    private static void printInfo(Transport<?> transport) {
        System.out.println("Водитель " + transport.getDriver().getName() + " управляет автотранспортом " + transport.getBrand() + "  модель " + transport.getModel() + " и будет участвовать в заезде");

    }


}