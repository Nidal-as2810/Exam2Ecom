package exam;

import java.time.LocalDate;
import java.util.Date;

public abstract class Ticket implements TicketPricing{
    private int id;
    private String showName;
    private LocalDate showDate;
    private int rowNumber;
    private int seatNumber;
    private Customer customer;
    private double price;

    public Ticket(String name, LocalDate date, int rowNumber, int seatNumber, Customer customer, double price) {
        this.showName = name;
        this.showDate = date;
        this.rowNumber = rowNumber;
        this.seatNumber = seatNumber;
        this.customer = customer;
        this.price = price;
        this.id=(int)(Math.random()*1000000);
    }

    public int getId() {
        return id;
    }



    public void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String getShowName() {
        return showName;
    }

    public LocalDate getShowDate() {
        return showDate;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public void setShowDate(LocalDate showDate) {
        this.showDate = showDate;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getPrice() {
        return price;
    }

}
