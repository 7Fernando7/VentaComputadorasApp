package mundoPc;
import mundoPc.modelo.Computadora;
import mundoPc.modelo.Monitor;
import mundoPc.modelo.Raton ;
import mundoPc.modelo.Teclado;
import mundoPc.servicio.Orden;

public class VentaComputadorasApp {
    public static void main(String[] args) {
        //Crear objetos

        Raton ratonLenovo = new Raton("bluetooth", "Lenovo");
        //System.out.println(ratonLenovo);
        Teclado tecladoLenovo = new Teclado("bluetooth", "Lenovo");
        //System.out.println(tecladoLenovo);
        Monitor monitorLenovo = new Monitor("Lenovo", 27);
        //System.out.println(monitorLenovo);

        //Objeto de tipo computadora

        Computadora computadoraLenovo =
                new Computadora(
                        "ComputadoraLenovo",
                                monitorLenovo,
                                tecladoLenovo,
                                ratonLenovo
        );
        //System.out.println(computadoraLenovo);
        // Objeto Computadora
        Monitor monitorDell = new Monitor("Dell", 15);
        Teclado tecladoDell = new Teclado("bluetooth", "Dell");
        Raton ratonDell = new Raton("bluetooth", "Dell");
        Computadora computadoraDell = new Computadora("ComputadoraDell", monitorDell, tecladoDell, ratonDell);

        //Creamos una orden
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraLenovo);
        orden1.agregarComputadora(computadoraDell);
        orden1.mostrarOrden();

        //Computadora Mac
        Monitor monitorMac = new Monitor("Mac", 27);
        Teclado tecladoMac = new Teclado("bluetooth", "Mac");
        Raton ratonMac = new Raton("bluetooth", "Mac");
        Computadora computadoraIMac = new Computadora("iMac", monitorMac, tecladoMac, ratonMac);

        //Creamos segunda orden
        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadoraLenovo);
        orden2.agregarComputadora(computadoraDell);
        orden2.agregarComputadora(computadoraIMac);
        System.out.println();
        orden2.mostrarOrden();

    }
}