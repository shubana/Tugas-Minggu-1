package com.company;

public class Customer extends User {
    private String Customer_name ;
    private String Address ;
    private String Email ;
    private String Credit_card_info ;
    private String CreditCardExpDate ;
    private String CVCcode ;
    private String Shipping;

    Customer(String UserId, String Password, String Customer_name, String Addres, String Email, String Credit_card_info, String CreditCardExpDate, String CVCcode){
        super(UserId, Password);
        this.Customer_name = Customer_name;
        this.Address = Addres;
        this.Email = Email;
        this.Credit_card_info = Credit_card_info;
        this.CreditCardExpDate = CreditCardExpDate;
        this.CVCcode = CVCcode;
    }

    public String getCustomer_name(){
        return Customer_name;
    }
    public String getAddress(){
        return Address;
    }
    public String getEmail(){
        return Email;
    }
    public String getCredit_card_info(){
        return Credit_card_info;
    }
    public String getCreditCardExpDate(){
        return CreditCardExpDate;
    }
    public String getCVCcode(){
        return CVCcode;
    }


    public String tagihan(int subtotal, int tax){

        return ("Credit Card info : " + getCredit_card_info() + "\nCard ExpDate : "+ getCreditCardExpDate()+
                "\nCard codeCVC : "+ getCVCcode()+ "\n\nShipping Info "+ "\nSubtotal : " + subtotal+ "\nTax : "+ tax +
                "\nTotal : "+ (subtotal + (subtotal * tax / 100)));
    }


    public void Register(){
        // error 404, file exits
    }
}
