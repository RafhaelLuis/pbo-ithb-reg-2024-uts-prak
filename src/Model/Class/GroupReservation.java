package Model.Class;

import java.util.Date;

public class GroupReservation extends Reservation {
    private String groupName;
    private int numberOfPassenger;

    
    
    public GroupReservation(int reservationId, Date reservationDate, String groupName, int numberOfPassenger) {
        super(reservationId, reservationDate);
        this.groupName = groupName;
        this.numberOfPassenger = numberOfPassenger;
    }
    public String getGroupName() {
        return groupName;
    }
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    public int getNumberOfPassenger() {
        return numberOfPassenger;
    }
    public void setNumberOfPassenger(int numberOfPassenger) {
        this.numberOfPassenger = numberOfPassenger;
    }

    
}
