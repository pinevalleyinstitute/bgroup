package za.ca.ticketreservation.people;

public class Company {

    private String companyName;
    private String companyAddress;
    private int phoneNumber;
    private int faxNumber;
    private String emailAddress;
    private String registrationNumber;
    private String VATregNumber;
    private String licenceNumber;

    // getters and setters for above variables

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return this.companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getFaxNumber() {
        return this.faxNumber;
    }

    public void setFaxNumber(int faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getRegistrationNumber() {
        return this.registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getVatregNumber() {
        return this.VATregNumber;
    }

    public void setVatregNumber(String VATregNumber) {
        this.VATregNumber = VATregNumber;
    }

    public String getLicenceNumber() {
        return this.licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    // CREATE A CONSTRUCTOR

    Company() {

    }

}