package Model.Class;

public class GroupReservation extends Passenger {
    private String groupName;
    private int numberOfPassenger;
    
    public GroupReservation(String passengerId, String passengerName, int passengerGender, int passengerAge,
            String groupName, int numberOfPassenger) {
        super(passengerId, passengerName, passengerGender, passengerAge);
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
