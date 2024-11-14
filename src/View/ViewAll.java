package View;

import Controller.Controller;
import Model.Class.Tiket;
import Model.Enum.ClassType;
import Model.Enum.TiketStatus;
import Model.Enum.TrainType;
import java.util.ArrayList;
import java.util.Scanner;

public class ViewAll {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Tiket> tikets = new ArrayList<>(); 

    public ViewAll(){
        showMenu();
    }

    public static void showMenu() { // asumsi input selalu benar
        System.out.println("1. make payment");
        System.out.println("2. calculate total revenue");
        int choose = Integer.parseInt(scan.nextLine());

        if (choose == 1) {
            showTrainType();
            int chooseTrainType = Integer.parseInt(scan.nextLine());

            showClassType();
            int chooseClassType = Integer.parseInt(scan.nextLine());
            
            showTiketStatus();
            int chooseTiketStatus = Integer.parseInt(scan.nextLine());
            
            double getPayment = Controller.makePayment(getTrainType(chooseTrainType), getClassType(chooseClassType));
            System.out.println("Total yang harus di bayar : " + getPayment + " Status : " + getTiketStatus(chooseTiketStatus));
        } else {
            double totalRevenue = Controller.calculateTotalRevenue(tikets);
            System.out.println("Total pendapatan dalam 1 hari: " + totalRevenue);
        }
    }

    public static void showTrainType(){ 
        System.out.println("1. Fast Train");
        System.out.println("2. Standar");
    }

    public static void showClassType(){ 
        System.out.println("1. First Class");
        System.out.println("2. Business Class");
        System.out.println("3. Ekonomi Class");
    }

    public static void showTiketStatus(){ 
        System.out.println("1. PAID");
        System.out.println("2. CANCELED");
        System.out.println("3. AWAITING_PAYMENT");
    }

    public static TrainType getTrainType(int pilih){
        if (pilih == 1) {
            return TrainType.FASTTRAIN;
        }
        return TrainType.STANDAR;
    } 

    public static ClassType getClassType(int pilih){
        if (pilih == 1) {
            return ClassType.FIRST_CLASS;
        } else if (pilih == 2) {
            return ClassType.BUSINESS_CLASS;
        }
        return ClassType.EKONOMI_CLASS;
    } 

    public static TiketStatus getTiketStatus(int pilih){
        if (pilih == 1) {
            return TiketStatus.PAID;
        } else if (pilih == 2) {
            return TiketStatus.CANCELED;
        }
        return TiketStatus.AWAITING_PAYMENT;
    } 
}
