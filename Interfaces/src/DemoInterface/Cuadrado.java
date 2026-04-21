package DemoInterface;

public class Cuadrado implements Figura{
    private float largo;
    private float ancho;
    private float x;
    private float y;

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public Cuadrado(float ancho, float largo, float x, float y) {
        this.ancho = ancho;
        this.largo = largo;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "ancho=" + ancho +
                ", largo=" + largo +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public float calcularArea() {
        return this.ancho*this.largo;
    }
}
