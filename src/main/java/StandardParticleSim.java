import java.util.*;

public class StandardParticleSim implements ParticleSim{
    private ArrayList<Particle> particles;

    public StandardParticleSim(int noOfParticles, int rows, int cols, double distance) {
        particles = new ArrayList<>();
        for(int i=1; i <= rows; i++){
            for(int j=1; j <= cols; j++){
                if(particles.size() < noOfParticles) {
                    Particle p = new Particle(i * distance, j * distance);
                    particles.add(p);
                }
            }
        }
    }

    @Override
    public ArrayList<Particle> getParticles() {
        return particles;
    }

    @Override
    public void updateParticles() {
        for(Particle p : particles){
            p.applyGravity(1);
            p.updateSpeed(1);
            p.updatePosition(1);
        }
    }

    public void addParticle(Particle p) {
        particles.add(p);
    }

    public void printParticles() {
        for(int i=1; i<= particles.size(); i++) {
            Particle p = particles.get(i-1);
            System.out.println("Particle " + i + ": \n" + "X:" + p.getX() + "\n" + "Y:" + p.getY());
        }
    }

    public static void main(String[] args) {
        StandardParticleSim sp = new StandardParticleSim(0,0,0,0);
        Particle p = new Particle(25, 25);
        sp.addParticle(p);
        Timer timer = new Timer();
        final double timestep = 0.017;
        TimerTask task = new TimerTask() {
            int steps = 0;

            @Override
            public void run() {
                steps++;
                sp.updateParticles();
                sp.printParticles();

                if(steps > 120) {
                    timer.cancel();
                    System.out.println("Timer stopped");
                }
            }
        };

        timer.scheduleAtFixedRate(task, 0, 17);
    }
}
