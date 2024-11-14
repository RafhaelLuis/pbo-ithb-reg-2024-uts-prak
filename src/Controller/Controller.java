package Controller;

import Model.Class.GroupReservation;
import Model.Class.OnlinePayment;
import Model.Class.Passenger;
import Model.Class.Reservation;
import Model.Class.Tiket;
import Model.Class.Train;
import Model.Enum.ClassType;
import Model.Enum.TiketStatus;
import Model.Enum.TrainType;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Controller {
    public static ArrayList<Passenger> passengers;
    public static ArrayList<Train> trains;
    public static ArrayList<Reservation> reservations;
    public static ArrayList<OnlinePayment> onlinePayments;
    public static ArrayList<Tiket> tikets;

    public static void CreateDummy() {
        passengers.add(new Passenger("P1", "Asep", 0, 20));
        passengers.add(new Passenger("P2", "Intan", 1, 20));
        passengers.add(new Passenger("P3", "ANi", 1, 20));

        trains.add(new Train(01, "Train_A", TrainType.FASTTRAIN));
        trains.add(new Train(02, "Train_B", TrainType.FASTTRAIN));
        trains.add(new Train(03, "Train_C", TrainType.STANDAR));
        trains.add(new Train(04, "Train_D", TrainType.STANDAR));

        reservations.add(new GroupReservation(1, new GregorianCalendar(2024, 11, 14).getTime(), "Grup_IF", 1));
        reservations.add(new GroupReservation(2, new GregorianCalendar(2024, 11, 14).getTime(), "Grup_AK", 1));
        reservations.add(new GroupReservation(3, new GregorianCalendar(2024, 11, 14).getTime(), "Grup_DKV", 1));
        reservations.add(new GroupReservation(4, new GregorianCalendar(2024, 11, 14).getTime(), "Grup_SI", 1));

        onlinePayments.add(new OnlinePayment("Payment1", "Paypal"));
        onlinePayments.add(new OnlinePayment("Payment2", "DOKU"));
        onlinePayments.add(new OnlinePayment("Payment3", "DOKU"));
        onlinePayments.add(new OnlinePayment("Payment4", "Xendit"));

        tikets.add(new Tiket("T1", "A2", ClassType.FIRST_CLASS, TiketStatus.PAID, passengers.get(0), trains.get(0),reservations.get(0), onlinePayments.get(0)));
        tikets.add(new Tiket("T2", "A4", ClassType.BUSINESS_CLASS, TiketStatus.CANCELED, passengers.get(1), trains.get(2),reservations.get(1), onlinePayments.get(2)));
        tikets.add(new Tiket("T3", "A7", ClassType.EKONOMI_CLASS, TiketStatus.PAID, passengers.get(2), trains.get(3),reservations.get(2), onlinePayments.get(3)));
    }

    public Controller() {
        CreateDummy();
    }

    public static double makePayment(TrainType trainType, ClassType classType) {

        double paymentCost = 0;

        for (Tiket tiket : tikets) {
            if (classType == ClassType.FIRST_CLASS) {
                for (Train train : trains) {
                    if (trainType == TrainType.FASTTRAIN) {
                        paymentCost += 600000;
                    } else {
                        paymentCost += 350000;
                    }
                }
            } else if (classType == ClassType.BUSINESS_CLASS) {
                for (Train train : trains) {
                    if (trainType == TrainType.FASTTRAIN) {
                        paymentCost += 500000;
                    } else {
                        paymentCost += 250000;
                    }
                }
            } else if (classType == ClassType.EKONOMI_CLASS) {
                for (Train train : trains) {
                    if (trainType == TrainType.FASTTRAIN) {
                        paymentCost += 400000;
                    } else {
                        paymentCost += 175000;
                    }
                }
            } else {
                return -1;
            }
        }

        tikets.get(0).setPrice(paymentCost);
        
        return paymentCost;
    }

    public static double calculateTotalRevenue(ArrayList<Tiket>tikets) { // semua transaksi ada pada 1 hari

        double total = 0;

        for (Tiket tiket : tikets) {
            
            total += tiket.getPrice();

        }

        return total;

    }


}
