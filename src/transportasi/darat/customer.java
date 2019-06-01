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
    
    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }
    
    public void customer(){
        System.out.println("Ini adalah kelas customer");
    }
}
