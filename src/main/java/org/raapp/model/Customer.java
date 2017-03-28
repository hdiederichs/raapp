package org.raapp.model;

import org.springframework.data.annotation.Id;

/**
 * A model class for customer information
 */
@SuppressWarnings("unused")
public class Customer {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String mobilPhoneNumber;

    public Customer() {
    }

    public Customer(String firstName, String lastName, String emailAddress, String mobilPhoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.mobilPhoneNumber = mobilPhoneNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getMobilPhoneNumber() {
        return mobilPhoneNumber;
    }

    public void setMobilPhoneNumber(String mobilPhoneNumber) {
        this.mobilPhoneNumber = mobilPhoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;

        Customer customer = (Customer) o;

        if (id != null ? !id.equals(customer.id) : customer.id != null) return false;
        if (firstName != null ? !firstName.equals(customer.firstName) : customer.firstName != null) return false;
        if (lastName != null ? !lastName.equals(customer.lastName) : customer.lastName != null) return false;
        if (emailAddress != null ? !emailAddress.equals(customer.emailAddress) : customer.emailAddress != null)
            return false;
        return mobilPhoneNumber != null ? mobilPhoneNumber.equals(customer.mobilPhoneNumber) : customer.mobilPhoneNumber == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (emailAddress != null ? emailAddress.hashCode() : 0);
        result = 31 * result + (mobilPhoneNumber != null ? mobilPhoneNumber.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", mobilPhoneNumber='" + mobilPhoneNumber + '\'' +
                '}';
    }
}
