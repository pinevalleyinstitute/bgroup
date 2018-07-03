package za.co.ticketreservation.payments;

import java.util.Date;

public class Payment {

    private String methodOfPayment;
    private double amount;
    private Date date;
    private String status;
    
//Getters and setters
    public String getmethodOfPayment() {
        return methodOfPayment;
    }

    public void setmethodOfPayment(String methodOfPayment) {
        this.methodOfPayment = methodOfPayment;
    }

    public String getamount() {
        return amount;
    }

    public setamount(double amount){
    this.amount= amount;
    }

    public getDate() {
    return date;
    }

    public setDate(String date){
    this.date = date;
    }

    public string getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}

//payment will have the following functionalities


public void confirmPayment() {
    return;
}

public void declinePaymet() {
    //use conditional statement
    return;
}


public void refund() {

    //check using conditional statements
    return;
}


}