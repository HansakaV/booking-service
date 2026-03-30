package com.eca.busdepot.bookingservice.model;

import jakarta.persistence.*;

@Entity
@Table(name = "bookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String busId;
    private String customerName;
    private String seatNumber;
    private String journeyDate;

    public Booking() {}

    public Booking(Long id, String busId, String customerName, String seatNumber, String journeyDate) {
        this.id = id;
        this.busId = busId;
        this.customerName = customerName;
        this.seatNumber = seatNumber;
        this.journeyDate = journeyDate;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getBusId() { return busId; }
    public void setBusId(String busId) { this.busId = busId; }
    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public String getSeatNumber() { return seatNumber; }
    public void setSeatNumber(String seatNumber) { this.seatNumber = seatNumber; }
    public String getJourneyDate() { return journeyDate; }
    public void setJourneyDate(String journeyDate) { this.journeyDate = journeyDate; }
}
