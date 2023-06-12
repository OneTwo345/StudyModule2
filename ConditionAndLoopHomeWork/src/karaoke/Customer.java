package karaoke;

import java.util.Date;

public class Customer {
    private String name;
    private String address;
    private String phoneNumber;

    private Date dob;
    private String gender;
    private int numberOfGuess;
    private String timeIn;
    private String timeOut;

    public Customer(String name, String address, String phoneNumber, Date dob, String gender, int numberOfGuess, String timeIn, String timeOut) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;

        this.dob = dob;
        this.gender = gender;
        this.numberOfGuess = numberOfGuess;
        this.timeIn = timeIn;
        this.timeOut = timeOut;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }




    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getNumberOfGuess() {
        return numberOfGuess;
    }

    public void setNumberOfGuess(int numberOfGuess) {
        this.numberOfGuess = numberOfGuess;
    }

    public String getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(String timeIn) {
        this.timeIn = timeIn;
    }

    public String getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(String timeOut) {
        this.timeOut = timeOut;
    }
}
