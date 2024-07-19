package mundoPc;
import mundoPc.modelo.Computadora;
import mundoPc.modelo.Monitor;
import mundoPc.modelo.Raton ;
import mundoPc.modelo.Teclado;

public class Main {
    public static void main(String[] args) {
        //Crear objetos

        Raton ratonLenovo = new Raton("bluetooth", "Lenovo");
        System.out.println(ratonLenovo);
        Teclado tecladoLenovo = new Teclado("bluetooth", "Lenovo");
        System.out.println(tecladoLenovo);
        Monitor monitorLenovo = new Monitor("Lenovo", 27);
        System.out.println(monitorLenovo);

        //Objeto de tipo computadora

        Computadora computadoraLenovo =
                new Computadora(
                        "ComputadoraLenovo",
                                monitorLenovo,
                                tecladoLenovo,
                                ratonLenovo
        );
        System.out.println(computadoraLenovo);

    }
}