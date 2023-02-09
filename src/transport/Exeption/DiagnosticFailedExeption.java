package transport.Exeption;

public class DiagnosticFailedExeption extends Exception {
    public DiagnosticFailedExeption() {
        super("Необходимо указать тип прав");
    }
}
