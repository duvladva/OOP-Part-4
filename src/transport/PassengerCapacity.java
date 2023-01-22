package transport;

public enum PassengerCapacity {
            N1(null, 10), N2(null, 25), N3(40, 50),
    N4(60, 80), N5(100, 120);

        final Integer minCapasity; // переменная экземпляра перечисляемого типа
        final Integer maxCapasity;

    PassengerCapacity(Integer minCapasity, Integer maxCapasity) {
            this.minCapasity = minCapasity;
            this.maxCapasity = maxCapasity;
        }

        @Override
        public String toString() {
            if (minCapasity == null) {
                return " вместимость до " + maxCapasity + " мест.";
            }
            else return " вместимость от: " + minCapasity + " до " + maxCapasity + " мест.";
        }


    }

