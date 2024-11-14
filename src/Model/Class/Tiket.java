package Model.Class;

import Model.Enum.*;

public class Tiket {
    private String tiketId;
    private String seatNumber;
    private ClassType classType;
    private TiketStatus status;
    private double price;
    private Passenger passenger;
    private Train train;
    private Reservation reservation;
    private OnlinePayment onlinePayment;
    
    public Tiket(String tiketId, String seatNumber, ClassType classType, TiketStatus status, Passenger passenger,
            Train train, Reservation reservation, OnlinePayment onlinePayment) {
        this.tiketId = tiketId;
        this.seatNumber = seatNumber;
        this.classType = classType;
        this.status = status;
        this.passenger = passenger;
        this.train = train;
        this.reservation = reservation;
        this.onlinePayment = onlinePayment;
    }
    public String getTiketId() {
        return tiketId;
    }
    public void setTiketId(String tiketId) {
        this.tiketId = tiketId;
    }
    public String getSeatNumber() {
        return seatNumber;
    }
    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }
    public ClassType getClassType() {
        return classType;
    }
    public void setClassType(ClassType classType) {
        this.classType = classType;
    }
    public TiketStatus getStatus() {
        return status;
    }
    public void setStatus(TiketStatus status) {
        this.status = status;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public Passenger getPassenger() {
        return passenger;
    }
    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
    public Train getTrain() {
        return train;
    }
    public void setTrain(Train train) {
        this.train = train;
    }
    public Reservation getReservation() {
        return reservation;
    }
    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
    public OnlinePayment getOnlinePayment() {
        return onlinePayment;
    }
    public void setOnlinePayment(OnlinePayment onlinePayment) {
        this.onlinePayment = onlinePayment;
    }
    

    

    

    
}
