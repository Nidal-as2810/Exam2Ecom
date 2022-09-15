import exam.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        Humus breakfast=new Humus();

        Customer vipCustomer=new Customer("Muhammad","al-Khwarizmi","algorithm@life.com","Algorithms", CustomerType.VIP,150.0);
        Customer regularCustomer=new Customer("nidal","abu sbeh","nidal.as2810@gmail.com","home",CustomerType.REGULAR,0.0);

        vipCustomer.breakfastVoucher(breakfast);
        regularCustomer.breakfastVoucher(breakfast);


        RegularTicket regularTicket=new RegularTicket(regularCustomer.getFirstName(),LocalDate.now(),5,515,regularCustomer,1000D);
        VipTicket vipTicket=new VipTicket(regularCustomer.getFirstName(),LocalDate.now(),1,115,regularCustomer,1000D);
        VipTicket vipTicket1=new VipTicket(vipCustomer.getFirstName(),LocalDate.now(),1,115,vipCustomer,1000D);

    }
}