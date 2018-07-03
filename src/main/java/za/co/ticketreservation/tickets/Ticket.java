package za.co.ticketreservation.tickets;

import java.util.Date;

public class Ticket{

    private Date issueDate;
    private String reference;
    private String validity;
    private String nameOfIssuer;

    Booking booking;

public static void main(String[] args) {
    
}

    public String getIssueDate() {
        return issueDate;
    }

    public setAmount(String issueDate){
    this.issueDate= issueDate;
    }

    public getReference() {
    return reference;
    }

    public setReference(String reference){
    this.reference = reference;
    }

    public string getStatus() {
        return status;
    }

    public void setStatus(String status) {
    this.status = status;
    }


    public string getnameOfIssuer() {
        return nameOfIssuer;
    }

    public void setNameOfIssuer(String nameOfIssuer) {
    this.nameOfIssuer = nameOfIssuer;
    }

//a method to print a ticket
    System.out.println("");
//ticket confirmation
    void confirmTicket(){
        return;
    }
// to notify customer by sending an sms
    void sendSms(){
        return;
    }
//notification by email
    void sendEmail(){
        return;
    }
//meams of cacelling a ticket
    void cancelTicket(){
        return;
    }





}
