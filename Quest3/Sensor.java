import java.util.ArrayList;
import java.util.List;

public class Sensor{

    private String tipo;
    private double valor;
    private List<Observer> observers;

    public Sensor(String tipo) {
        this.tipo = tipo;
        this.observers = new ArrayList<>();
    }

    public void adicionarObserver(Observer observer) {
        observers.add(observer);
    }

    public void removerObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setValor(double novoValor) {
        this.valor = novoValor;
        notificarObservers();
    }

    private void notificarObservers() {
        for (Observer observer : observers) {
            observer.atualizar(tipo, valor);
        }
    }
}
