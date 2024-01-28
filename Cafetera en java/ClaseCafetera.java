// Clase Cafetera
public class Cafetera {
    private int capacidadMax;
    private int capacidadActual;

    public Cafetera() {
        this.capacidadMax = 1000;
        this.capacidadActual = 0;
    }

    public Cafetera(int capacidadMax) {
        this.capacidadMax = capacidadMax;
        this.capacidadActual = capacidadMax;
    }

    public Cafetera(int capacidadMax, int capacidadActual) {
        this.capacidadMax = capacidadMax;
        if (capacidadActual > capacidadMax) {
            this.capacidadActual = capacidadMax;
        } else {
            this.capacidadActual = capacidadActual;
        }
    }

    public void llenarCafetera() {
        this.capacidadActual = this.capacidadMax;
    }

    public void servirTaza(int capacidadTaza) {
        if (capacidadActual >= capacidadTaza) {
            capacidadActual -= capacidadTaza;
        } else {
            capacidadActual = 0;
        }
    }

    public void agregarCafe(int cantidad) {
        if (capacidadActual + cantidad <= capacidadMax) {
            capacidadActual += cantidad;
        } else {
            capacidadActual = capacidadMax;
        }
    }

    public void vaciarCafetera() {
        this.capacidadActual = 0;
    }
}
