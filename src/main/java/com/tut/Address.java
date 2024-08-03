package com.tut;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "student_Address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private int addressId;
    @Column(length = 50, name = "STREET")
    private String street;
    @Column(length = 100, name = "CITY")
    private String city;
    @Column(name = "is_open")
    private boolean isOpen;
    @Transient
    private double x;
    @Column(name = "added_date")
    @Temporal(TemporalType.DATE)
    private Date addedData;
    @Lob
    private byte[] image;

    public Address() {
        super();
    }

    public Address(int addressId, String street, String city, boolean isOpen, double x, Date addedData, byte[] image) {
        this.addressId = addressId;
        this.street = street;
        this.city = city;
        this.isOpen = isOpen;
        this.x = x;
        this.addedData = addedData;
        this.image = image;
    }

    @Override
    public String toString() {
        return "Address [addressId=" + addressId + ", street=" + street + ", city=" + city + ", isOpen=" + isOpen
                + ", x=" + x + ", addedData=" + addedData + ", image=" + Arrays.toString(image) + "]";
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public Date getAddedData() {
        return addedData;
    }

    public void setAddedData(Date addedData) {
        this.addedData = addedData;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
