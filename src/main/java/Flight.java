import java.util.ArrayList;

public class Flight {

    private Plane plane;
    private String number;
    private String a;
    private String b;
    private String time;

    private ArrayList<Passenger> passengers;

    public Flight(Plane plane, String number, String a, String b, String time) {
        this.plane = plane;
        this.number = number;
        this.a = a;
        this.b = b;
        this.time = time;
        this.passengers = new ArrayList<Passenger>();
    }

    public Plane getPlane() {
        return plane;
    }


    public String getFlightNumber() {
        return number;
    }


    public String getTime() {
        return time;
    }

    public String getGLA() {
        return a;
    }

    public String getEDI() {
        return b;
    }

    public int getNumberOfPassengers(){
        return this.passengers.size();
    }

    public void addPassenger(Passenger passenger) {
        if (getNumberOfPassengers() < plane.getCapacity()) {
            this.passengers.add(passenger);
        }
    }

//    public int getAvailableSeats() {
//        int emptySeats = this.plane.getEmptySeats
//    }
}
