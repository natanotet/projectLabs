package org.fasttrackit.lab3.agenda.domain;

public class Contact {

    private String firstName;

    private String lastName;

    private String phone;

    private String adress;

    public Contact () {
        super();
        phone="";
    }

    public Contact (String firstNameParam, String lastNameParam) {
        super ();
        this ();
        this.firstName = firstNameParam;
        this.lastName = lastNameParam;

    }




    public void setFirstName (String firstNameParam) {

        if(firstNameParam.equals("")) {
            throw new IllegalArgumentException("First name" + "Cannot be empty");
        }
        this.firstName = firstNameParam;
    }

    public String getFirstName () {
        return this.firstName;

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String toString () {

        return "First name is:" + firstName + "and last name is: " + lastName;
    }







}
