/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportasi.darat;

public class customer {
    private String CustomerID;
    private String Firstname;
    private String Surname;
    private String Address;
    private String Postcode;
    private String Town;
    private String ProveofID;
    private Double DownPayment;
    private Double Deposit;
    
    
    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }
    public String getFirstname() {
        return Firstname;
    }
    
    public String getSurname() {
        return Surname;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }
    
    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public String getAddress() {
        return Address;
    }
    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPostcode() {
        return Postcode;
    }

    public void setPostcode(String Postcode) {
        this.Postcode = Postcode;
    }
    
    public String getTown() {
        return Town;
    }

    public void setTown(String Town) {
        this.Town = Town;
    }
    public String getProveofID() {
        return ProveofID;
    }

    public void setProveofID(String ProveofID) {
        this.ProveofID = ProveofID;
    }
    public Double getDownPayment() {
        return DownPayment;
    }

    public void setDownPayment(Double DownPayment) {
        this.DownPayment = DownPayment;
    }
    public Double getDeposit() {
        return Deposit;
    }

    public void setDeposit(Double Deposit) {
        this.Deposit = Deposit;
    }
    

    
    public void customer(){
        System.out.println("Ini adalah kelas customer");
    }
}
