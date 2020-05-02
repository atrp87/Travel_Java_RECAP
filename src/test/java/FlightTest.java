import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flightA;
    Flight flightB;
    Plane planeA;
    Plane planeB;
    Passenger passengerA;
    Passenger passengerB;

    ArrayList<Passenger> passengers;

    @Before
    public void setup() {
        this.planeA = new Plane(PlaneType.BOEING);
        this.planeB = new Plane(PlaneType.PAPER);
        this.passengerA = new Passenger("Andrew", 1);
        this.passengerB = new Passenger("Cammy", 6);

        passengers = new ArrayList<Passenger>();

        flightA = new Flight(planeA, "FR756", "GLA", "EDI", "16.00");
        flightB = new Flight(planeB, "FR657", "EDI", "GLA", "19.00");
    }

    @Test
    public void canGetPlaneType() {
        assertEquals(PlaneType.BOEING, flightA.getPlane().getPlaneType());
    }

    @Test
    public void canGetNumber() {
        assertEquals("FR756", flightA.getFlightNumber());
    }

    @Test
    public void canGetTime() {
        assertEquals("16.00", flightA.getTime());
    }

    @Test
    public void canGetGLA() {
        assertEquals("GLA", flightA.getGLA());
    }

    @Test
    public void canGetEDI() {
        assertEquals("EDI", flightA.getEDI());
    }
    @Test
    public void canAddPassenger(){
        flightA.addPassenger(passengerB);
        assertEquals(1, flightA.getNumberOfPassengers());
    }
//    @Test
//    public void canShowAllSeatsAreAvailable() {
//        assertEquals(400, flightA.getAvailableSeats());
//    }

}

