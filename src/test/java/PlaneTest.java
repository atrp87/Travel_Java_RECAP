import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane planeA;
    Plane planeB;

    @Before
    public void setup() {
    planeA = new Plane(PlaneType.BOEING);
    planeB = new Plane(PlaneType.PAPER);
  }

    @Test
    public void hasType() {
        assertEquals(PlaneType.BOEING, planeA.getPlaneType());
    }

    @Test
    public void hasCapacity(){
        assertEquals(10, PlaneType.BOEING.getCapacity());
    }



}
