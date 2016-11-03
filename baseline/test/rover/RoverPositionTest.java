package rover;

import org.junit.Test;

import static org.junit.Assert.*;

public class RoverPositionTest {

    @Test
    public void shouldReturnPositionAsAString() throws Exception {
        RoverPosition roverPosition = new RoverPosition(1,2);
        assertEquals("1 2",roverPosition.asString());
    }

}