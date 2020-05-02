public class Plane {

    private PlaneType plane;

    public Plane(PlaneType plane) {
        this.plane = plane;
    }

    public PlaneType getPlaneType() {
        return plane;
    }

    public int getCapacity(){
        return this.plane.getCapacity();
    }
}
