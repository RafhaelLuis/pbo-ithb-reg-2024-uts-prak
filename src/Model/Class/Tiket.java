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
}
