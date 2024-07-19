package mundoPc.modelo;

public class Monitor {
    private final int idMonitor;
    private String marca;
    private int tamanio;
    private static int contadorMonitores;

    private Monitor(){
        idMonitor = ++contadorMonitores;
    }

    public Monitor(String marca, int tamanio){
        this();
        this.marca = marca;
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "idMonitor=" + idMonitor +
                ", marca='" + marca + '\'' +
                ", tamanio=" + tamanio +
                '}';
    }
}
