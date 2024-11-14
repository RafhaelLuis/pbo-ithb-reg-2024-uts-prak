package Model.Class;

public class Passenger {
    private String passengerId;
    private String passengerName;
    private int passengerGender; // 0 = lakilaki , 1 = wanita
    private int passengerAge;
    public Passenger(String passengerId, String passengerName, int passengerGender, int passengerAge) {
        this.passengerId = passengerId;
        this.passengerName = passengerName;
        this.passengerGender = passengerGender;
        this.passengerAge = passengerAge;
    }
    public String getPassengerId() {
        return passengerId;
    }
    public void setPassengerId(String passengerId) {
        this.passengerId = passengerId;
    }
    public String getPassengerName() {
        return passengerName;
    }
    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }
    public int getPassengerGender() {
        return passengerGender;
    }
    public void setPassengerGender(int passengerGender) {
        this.passengerGender = passengerGender;
    }
    public int getPassengerAge() {
        return passengerAge;
    }
    public void setPassengerAge(int passengerAge) {
        this.passengerAge = passengerAge;
    }

    public void  getPassengerInfo(){
        System.out.println(passengerId);
        System.out.println(passengerName);
        System.out.println(passengerGender);
        System.out.println(passengerAge);
    }

    
}
