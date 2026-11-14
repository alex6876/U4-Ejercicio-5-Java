public class Infanteria extends UnidadCombate {
    public Infanteria(int posicionX, int posicionY, int energia) {
        super(posicionX, posicionY, energia);

    }

    @Override
    public void moverse(int nuevaX, int nuevaY) {
        int distancia = Math.abs(nuevaX - posicionX)
                + Math.abs(nuevaY - posicionY);

        if(distancia == 1 && energia >= 5) {

            posicionX = nuevaX;
            posicionY = nuevaY;

            energia -= 5;

            System.out.println("La infanteria avanzó una casilla");
        }else{
            System.out.println("La infanteria no puede realizar ese movimiento");
        }
    }

    @Override
    public void atacar() {
        if(energia >= 10){

            energia -= 10;

            System.out.println("La infanteria ataca con su espada.");
        }else{
            System.out.println("La infanteria no tiene suficiente energia.");
        }
    }


}
