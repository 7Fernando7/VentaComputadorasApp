package mundoPc.servicio;

import mundoPc.modelo.Computadora;

import java.util.ArrayList;
import java.util.List;

public class Orden {

    private final int idOrden;
    private final List<Computadora> computadoras;

    private static int contadorOrdenes;

    public Orden(){
       computadoras = new ArrayList<>();
       this.idOrden = ++contadorOrdenes;
    }

    public void agregarComputadora(Computadora computadora){
        computadoras.add(computadora);
    }

    public void mostrarOrden(){
        System.out.println("Orden #: " + idOrden );
        System.out.println("Total computadores: " + computadoras.size());
        computadoras.forEach(System.out::println);
    }


}
