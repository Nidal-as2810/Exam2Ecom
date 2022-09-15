package exam;

import java.time.LocalDate;

public class VipTicket extends Ticket{


    public VipTicket(String name, LocalDate date, int rowNumber, int seatNumber, Customer customer, double price) throws Exception {
        super(name, date, rowNumber, seatNumber, customer, price);
        ticketPrice(price);
    }

    @Override
    public void ticketPrice(double price) throws Exception {
        if(this.getCustomer().getCustomerType()!=CustomerType.VIP){
            throw new Exception("Are you Dumb? ^_^");
        }

        if(this.getCustomer().getDiscount()!=null){
            this.setPrice(this.getPrice()-this.getCustomer().getDiscount());
        }
    }
}
