package transport;

public enum FullMass { // Объявление перечисления

    N1(null, 3.5f), N2(3.5f, 12f), N3(12f, null);

    private final Float minMass; // переменная экземпляра перечисляемого типа
    private final Float maxMass;

    FullMass(Float minMass, Float maxMass) {
        this.minMass = minMass;
        this.maxMass = maxMass;
    }

    @Override
    public String toString() {
        if (minMass == null) {
            return " грузоподъемность до " + maxMass + " тонн.";
        }
        if (maxMass == null) {
            return " грузоподъемность свыше " + minMass + " тонн.";
        } else {return " грузоподъемность от: " + minMass + " до " + maxMass + " тонн.";}
    }


}


