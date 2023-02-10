package transport.mechanic;

import java.util.Objects;

public class Mechanic {
    private String name;
    private String company;
    private TransportType transportType;


    public Mechanic(String name, String company, TransportType transportType) {
        this.name = name;
        this.company = company;
        this.transportType = transportType;
    }

    public void maintenance(){
        System.out.println("Механик " + name + " из компании " + company + " проводит техобслуживание.");
    }

    public void fixing(){
        System.out.println("Механик " + name + " из компании " + company + " ремонтирует транспортное средство.");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public TransportType getTransportType() {
        return transportType;
    }

    public void setTransportType(TransportType transportType) {
        this.transportType = transportType;
    }

    @Override
    public String toString() {
        return "Механик " + name + " из компании " + company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic mechanic = (Mechanic) o;
        return name.equals(mechanic.name) && company.equals(mechanic.company) && transportType == mechanic.transportType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, company, transportType);
    }
}
