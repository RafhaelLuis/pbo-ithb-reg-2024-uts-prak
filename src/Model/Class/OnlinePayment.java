package Model.Class;

import Model.Interface.*;


public class OnlinePayment implements Interface {
    private String transactionId;
    private String paymentGateway;

    public OnlinePayment(String transactionId, String paymentGateway) {
        this.transactionId = transactionId;
        this.paymentGateway = paymentGateway;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getPaymentGateway() {
        return paymentGateway;
    }

    @Override
    public void makePayment(double amount) {
        System.out.println("Processing online payment of $" + amount + " through " + paymentGateway +
                ". Transaction ID: " + transactionId);
    }

}
