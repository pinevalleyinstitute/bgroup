package za.co.ticketreservation.payments;

import java.util.Date;

public class Payment {

    private String methodOfPayment;
    private double amount;
    private Date date;
    private String status;

    // creat a constructor

    public Payment( String methodOfPayment,double amount,Date date,String status,){

    this.methodaoafPayment = methodOfPayment;
    this.amount = amount;
    this. date = date;
    this. status = status;

    }

    // Getters and setters
    public String getmethodOfPayment() {
        return methodOfPayment;
    }

    public void setmethodOfPayment(String methodOfPayment) {
        this.methodOfPayment = methodOfPayment;
    }

    public String getamount() {
        return amount;
    }

    public void setamount(double amount) {
        this.amount = amount;
    }

    public getDate() {
    return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public string getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // payment will have the following functionalities

    public void confirmPayment() {
        return;
    }

    // use conditional statement
    public void declinePaymet() {
        return;
    }

    public void refund() {
        return;
    }

}