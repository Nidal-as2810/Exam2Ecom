package exam;

public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String DeliveryAddress;
    private Enum<CustomerType> customerType;
    private Double discount;
    private Voucher breakfast;

    public Customer(String firstName, String lastName, String email, String deliveryAddress, Enum<CustomerType> customerType, Double discount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        DeliveryAddress = deliveryAddress;
        this.customerType = customerType;
        this.discount = discount;
        this.id=(int)(Math.random()*100000);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        DeliveryAddress = deliveryAddress;
    }

    public void setCustomerType(Enum<CustomerType> customerType) {
        this.customerType = customerType;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getDeliveryAddress() {
        return DeliveryAddress;
    }

    public Enum<CustomerType> getCustomerType() {
        return customerType;
    }

    public Double getDiscount() {
        return discount;
    }

    public void breakfastVoucher(Voucher voucher){
        this.breakfast=voucher;
    }
    public void eat(){
        this.breakfast.foodVoucher();
    }

    public void print(){
        String text=String.format("id: $id",this.getId());

        System.out.println(text);
    }
}
