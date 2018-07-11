package za.co.ticketreservation.bookings;

import java.util.Date;

public class Booking {

    // variablesdeclaration describing the characteristics of the booking object
    private String referenceNumber;
    private Date startDate;
    private Date endDate;
    private double price;
    private String insurance;
    private String exemption;
    private String bookingType;
    private int numberOfPerson;
    private double discount;
    private String direction;
    private String category;
    private String penalty;
    private String Payment payment;

    // getters and setters

    public String getReferencenumber() {
        return this.referenceNumber;
    }

    public void setReferencenumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public Date getStartdate() {
        return this.startDate;
    }

    public void setStartdate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEnddate() {
        return this.endDate;
    }

    public void setEnddate(Date endDate) {
        this.endDate = endDate;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getInsurance() {
        return this.insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    public String getExemption() {
        return this.exemption;
    }

    public void setExemption(String exemption) {
        this.exemption = exemption;
    }

    public String getBookingtype() {
        return this.bookingType;
    }

    public void setBookingtype(String bookingType) {
        this.bookingType = bookingType;
    }

    public int getNumberofperson() {
        return this.numberOfPerson;
    }

    public void setNumberofperson(int numberOfPerson) {
        this.numberOfPerson = numberOfPerson;
    }

    public double getDiscount() {
        return this.discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getDirection() {
        return this.direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPenalty() {
        return this.penalty;
    }

    public void setPenalty(String penalty) {
        this.penalty = penalty;
    }

    // getters and setters created that decribes the relationship Booking has a
    // Ticket

    public String getPayment() {
        return this.Payment;
    }

    public void setPayment(String Payment) {
        this.Payment = Payment;
    }
    // Now to create an overloaded constructor

Booking(String referenceNumber,Date startDate,Date endDate,double price,String insurance,String exemption,String bookingType,int numberOfPerson,double discount,String  penalty,String direction,String category,String Payment payment );

    this.referenceNumber = referenceNumber;
    this.startDate = startDate;
    this.endDate = endDate;
    this.price = price;
    this.insurance = insurance;
    this.exemption = exemption;
    this.bookingType = bookingType;
    this.numberOfPerson = numberOfPerson;
    this.discount = discount;
    this. penalty = penalty;
    this. direction = direction;
    this.category = category;
    this.payment = payment;




//the booking object will have the following behavior

    public void refund() {

        //check using conditional statements
        return;
    }

    public void confirmBooking() {
        return;
    }

    public void updateBooking() {
        return;
    }

    public void discount() {
        //use condtions
        return;
    }

    public void penalty() {
        //use conditions
        return;
    }

    public void cancelBoking() {
       // use conditions
        return;
    }

    public void createBooking() {
        // use conditions and Scanner
        return;
    }

}
