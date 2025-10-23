public class Particle {
    private double x;
    private double y;

    public Particle(double x, double y) {
        this.x = x;
        this.y = y;

    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getVX() {
        return 0; //FAKE IT
    }

    public double getVY() {
        return 0; //FAKE IT
    }
}