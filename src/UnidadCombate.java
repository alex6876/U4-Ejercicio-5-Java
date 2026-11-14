public abstract class UnidadCombate {

    protected int posicionX;
    protected int posicionY;
    protected int energia;

    public UnidadCombate(int posicionX, int posicionY, int energia) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.energia = energia;
    }

    public abstract void moverse(int nuevaX, int nuevaY);

    public abstract void atacar();

    public void mostrar(){
        System.out.println("Posicion X: " + posicionX + " Posicion Y: " + posicionY);
        System.out.println("Energia: " + energia);
    }
}
