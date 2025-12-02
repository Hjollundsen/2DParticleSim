import java.util.*;

public class GravitySim implements ParticleSim{
    private ArrayList<Particle> particles;
    private ArrayList<ParticleSimObserver> observers;

    public GravitySim(int noOfParticles, int rows, int cols, double distance) {
        particles = new ArrayList<>();
        observers = new ArrayList<>();
        for(int i=1; i <= rows; i++){
            for(int j=1; j <= cols; j++){
                if(particles.size() < noOfParticles) {
                    Particle p = new Particle(j * distance, i * distance);
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
        notifyObservers();
    }

    public void addParticle(Particle p) {
        particles.add(p);
    }

    @Override
    public void addObserver(ParticleSimObserver p) {
        observers.add(p);
    }

    public void printParticles() {
        for(int i=1; i<= particles.size(); i++) {
            Particle p = particles.get(i-1);
            System.out.println("Particle " + i + ": \n" + "X:" + p.getX() + "\n" + "Y:" + p.getY());
        }
    }

    public void notifyObservers() {
        for(ParticleSimObserver p : observers){
            p.onParticlesUpdated();
        }
    }
}
