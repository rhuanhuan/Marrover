package rover;

import org.junit.Before;
import org.junit.Test;

import javax.swing.text.Position;

import static org.junit.Assert.assertEquals;

public class MarsRoverTest {

    private MarsRover rover;

    @Before
    public void setUp() throws Exception {
        rover = new MarsRover( new RoverPosition(1,1), Direction.NORTH);
    }

    @Test
    public void shouldMoveRoverAround() throws Exception {
        assertEquals("1 3 NORTH", rover.run("MM"));
    }

    @Test
    public void shouldTurnRoverRight() throws Exception {
        assertEquals("1 1 WEST", rover.run("RRR"));
    }

    @Test
    public void shouldTurnRoverLeft() throws Exception {
        assertEquals("1 1 EAST", rover.run("LLL"));
    }

    @Test
    public void shouldCircleAround() throws Exception {
        assertEquals("1 1 NORTH", rover.run("MRMRMRMR"));
        assertEquals("1 1 NORTH", rover.run("MLMLMLML"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotAllowInvalidInput() throws Exception {
        rover.run("invalid input");
    }
}
