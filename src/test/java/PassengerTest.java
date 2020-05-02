import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;


    @Before
    public void before() {
        passenger = new Passenger("Andrew", 1);
    }

    @Test
    public void setPassengerHasName() {
        assertEquals("Andrew", passenger.getName());
    }

    @Test
    public void setPassengerHasLuggage() {
        assertEquals(1, passenger.getLuggage());
    }

}
