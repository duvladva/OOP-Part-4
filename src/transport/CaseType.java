package transport;

// Объявление перечисления
public enum CaseType {
    SEDAN("Седан"), HATCHBACK("Хэтчбек"), COUPE("Купе"), UNIVERSAL("Универсал"), OFFROAD("Внедорожник"),
    CROSSOVER("Кроссовер"), PICKUP("Пикап"), VAN("Фургон"), MINIVAN("Минивэн");

    private final String caseType; // переменная экземпляра перечисляемого типа
    CaseType(String ct) {
        caseType = ct;
    }

    @Override
    public String toString() {
        return " тип кузова: " + caseType;
    }
}