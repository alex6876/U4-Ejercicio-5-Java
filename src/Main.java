import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Infanteria infanteria = new Infanteria(1, 2, 100);

        Caballeria caballeria = new Caballeria(0, 2, 100);

        UnidadesAereas unidadAerea = new UnidadesAereas(0, 0, 100);

        List<UnidadCombate> unidades = new ArrayList<>();

        unidades.add(infanteria);
        unidades.add(caballeria);
        unidades.add(unidadAerea);

        GestorDeUnidades gestor = new GestorDeUnidades();

        gestor.ejecutarAcciones(unidades);
    }
}