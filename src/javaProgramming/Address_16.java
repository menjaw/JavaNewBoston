/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaProgramming;

/**
 *
 * @author Menja
 */
public class Address_16 {

    private String address;
    private String zipcode;
    private String city;
    private String country;

    //Set the address to whatever is saved in the variable
    public void setAddress(String inputAddress) {
        address = inputAddress;
    }

    //Get the address
    public String getAddress() {
        return address; //Returns the address that was setted in the method above
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    //Message send back to user
    public void responseToUser() {
        System.out.printf("Your address is %s", getAddress()); //% tells which String you want to use (here the getAddress())
        System.out.printf(" %s", getZipcode());
        System.out.printf(" %s", getCity());
        System.out.printf(" %s", getCountry());
    }
}
