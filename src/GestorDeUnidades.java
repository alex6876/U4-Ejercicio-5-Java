import java.util.List;

public class GestorDeUnidades {

    public void ejecutarAcciones(List<UnidadCombate> unidades) {

        for (UnidadCombate unidad : unidades) {

            unidad.moverse(2, 2);

            unidad.atacar();

            unidad.mostrar();

        }
    }
}