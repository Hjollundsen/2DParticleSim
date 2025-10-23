import java.util.*;

public interface ParticleSim {
    /**
     * Method to return a particle simulation, that the GUI can use
     * @return Arraylist with Particly type objects inside
     */
    public ArrayList<Particle> getParticles();

    /**
     * Update all particles in the simulation
     */
    public void updateParticles();
}
