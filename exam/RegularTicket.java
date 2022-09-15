package exam;

import java.time.LocalDate;

public class RegularTicket extends Ticket{
    public RegularTicket(String name, LocalDate date, int rowNumber, int seatNumber, Customer customer, double price) throws Exception {
        super(name, date, rowNumber, seatNumber, customer, price);
        ticketPrice(price);
    }

    @Override
    public void ticketPrice(double price) throws Exception {
        System.out.println("You can't have doscount!");
    }
}
