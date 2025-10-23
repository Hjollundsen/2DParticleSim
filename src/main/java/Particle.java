
public class Particle {
    private double x;
    private double y;
    private double vx;
    private double vy;
    private double ax;
    private double ay;

    public Particle(double x, double y) {
        this.x = x;
        this.y = y;
        this.vx = 0.0;
        this.vy = 0.0;
        this.ax = 0.0;
        this.ay = 0.0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getVX() {
        return vx;
    }

    public double getVY() {
        return vy;
    }

    public double getAX() {
        return ax;
    }

    public double getAY() {
        return ay;
    }

    public void applyGravity(int dt) {
        ay = Constants.GRAVITY_CONSTANT * dt;
    }

    public void updateSpeed(int dt) {
        vx += ax * dt;
        vy += ay * dt;
    }

    public void updatePosition(int dt) {
        x += vx * dt;
        y += vy * dt;
        if(y <= 0) {
            y = 0;
            vy = -vy * Constants.COLLISION_DAMPENING_CONSTANT;
        }
    }
}