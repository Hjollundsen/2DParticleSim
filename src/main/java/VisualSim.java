import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class VisualSim extends JPanel implements ParticleSimObserver{
    private ParticleSim particleSim;

    public VisualSim(ParticleSim particleSim) {
        this.particleSim = particleSim;
        particleSim.addObserver(this);
    }

    @Override
    public void onParticlesUpdated() {
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.red);

        ArrayList<Particle> particles = particleSim.getParticles();
        for(Particle p : particles) {
            int screenY = getHeight() - (int) p.getY();
            int screenX = (int) p.getX();
            g.fillOval((int) screenX, (int) screenY, 10, 10);
        }
    }
}
