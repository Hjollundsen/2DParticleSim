import org.junit.jupiter.api.*;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestParticleSim {
    @BeforeEach
    public void setUp() {
        // Fill BeforeEach On The Go
    }

    @Test
    public void shouldInitiallyReturn2ForXWhenGiven2asArgumentForXPosition() {
        // Given a new Particle
        double initialX = 2;
        Particle particle = new Particle(initialX,2);
        // When asked for its x position
        double xPos = particle.getX();
        // Then it should be the initially given
        assertThat(initialX, is(xPos));
    }

    @Test
    public void shouldInitiallyReturn7ForYWhenGiven2AsArgumentFor7Position() {
        // Given a new Particle
        double initialY = 7;
        Particle particle = new Particle(initialY,7);
        // When asked for its x position
        double yPos = particle.getY();
        // Then it should be the initially given
        assertThat(initialY, is(yPos));
    }

    @Test
    public void shouldInitiallyHave0VelocityInX() {
        // Given a new particle
        Particle particle = new Particle(0,0);
        // When we measure its speed in x
        double vx = particle.getVX();
        // Then it should be 0
        assertThat(vx, is(0.0));
    }

    @Test
    public void shouldInitiallyHave0VelocityInY() {
        // Given a new particle
        Particle particle = new Particle(0,0);
        // When we measure its speed in y
        double vy = particle.getVY();
        // THen it should be 0
        assertThat(vy, is(0.0));
    }
}