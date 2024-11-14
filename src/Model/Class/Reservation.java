package Model.Class;

import java.util.Date;

abstract public class Reservation {
    private int reservationId;
    private Date reservationDate;
    public Reservation(int reservationId, Date reservationDate) {
        this.reservationId = reservationId;
        this.reservationDate = reservationDate;
    }
    public int getReservationId() {
        return reservationId;
    }
    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }
    public Date getReservationDate() {
        return reservationDate;
    }
    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }



    
}
