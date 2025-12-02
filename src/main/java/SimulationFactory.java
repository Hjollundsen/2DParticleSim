import javax.swing.*;

public class SimulationFactory {
    ParticleSim particleSim;

    public SimulationFactory(ParticleSim particleSim) {
        this.particleSim = particleSim;
    }

    public static void main(String[] args) {
        GravitySim sim = new GravitySim(2,2,1,200);
        SimulationFactory simFactory = new SimulationFactory(sim);
        VisualSim GUI = new VisualSim(sim);

        JFrame frame = new JFrame("Particles");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(GUI);
        frame.setSize(800, 600);
        frame.setVisible(true);

        Timer timer = new Timer(17, e -> sim.updateParticles());
        timer.start();
    }
}
