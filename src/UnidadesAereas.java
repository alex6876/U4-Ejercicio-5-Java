public class UnidadesAereas extends UnidadCombate{
    public UnidadesAereas(int posicionX, int posicionY, int energia) {
        super(posicionX, posicionY, energia);
    }


    @Override
    public void moverse(int nuevaX, int nuevaY) {

        int distanciaX = Math.abs(nuevaX - posicionX);
        int distanciaY = Math.abs(nuevaY - posicionY);

        int distancia = Math.max(distanciaX, distanciaY);

        if (distancia >= 1 && distancia <= 5 && energia >= 8) {

            posicionX = nuevaX;
            posicionY = nuevaY;

            energia -= 8;

            System.out.println("La unidad aerea volo hasta su destino.");

        } else {

            System.out.println("La unidad aerea no puede realizar ese movimiento.");
        }
    }

    @Override
    public void atacar() {

        if (energia >= 12) {

            energia -= 12;

            System.out.println("La unidad aerea realiza un ataque desde el aire.");

        } else {

            System.out.println("La unidad aerea no tiene energia suficiente para atacar.");
        }
    }
}
