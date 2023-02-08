package transport.mechanic;


import transport.Bus;
import transport.Exeption.DiagnosticFailedExeption;
import transport.Transport;

import java.util.ArrayDeque;
import java.util.Queue;

public class STO {
    private  final Queue<Transport<?>> transportQueue = new ArrayDeque<>();
    public void addTransport(Transport<?> transport) {
        if (transport instanceof Bus) {
            System.out.println("Автобусы не нуждаются в ТО");
        } else {
            transportQueue.add(transport);
        }
    }

    public void runTO(){
        Transport<?> transport = transportQueue.poll();
        if (transport != null) {
            try {
                transport.diagnostics();
                transport.getMechanics().iterator().next().maintenance();
            } catch (DiagnosticFailedExeption e){
                System.out.println("Ошибка при проведении ТО " + transport);
            }
        }
    }
}
