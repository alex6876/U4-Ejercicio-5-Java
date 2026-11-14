public class Caballeria extends UnidadCombate {
    public Caballeria(int posicionX, int posicionY, int energia) {
        super(posicionX, posicionY, energia);
    }

    @Override
    public void moverse(int nuevaX, int nuevaY) {

        boolean movimientoHorizontal = nuevaY == posicionY;
        boolean movimientoVertical = nuevaX == posicionX;

        int distancia = Math.abs(nuevaX - posicionX)
                + Math.abs(nuevaY - posicionY);

        if ((movimientoHorizontal || movimientoVertical)
                && distancia >= 1 && distancia <= 3
                && energia >= 10) {

            posicionX = nuevaX;
            posicionY = nuevaY;

            energia -= 10;

            System.out.println("La caballeria se desplazo rapidamente.");

        } else {

            System.out.println("La caballeria no puede realizar ese movimiento.");
        }
    }

    @Override
    public void atacar() {

        if (energia >= 15) {

            energia -= 15;

            System.out.println("La caballeria realiza una carga de ataque.");

        } else {

            System.out.println("La caballeria no tiene energia suficiente para atacar.");
        }
    }
}
