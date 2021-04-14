/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer_project;

/**
 *
 * @author Msarat
 */
public class Customer {
      private String cuName;
    private int cuId;
    private String cuEmail;

    public Customer() {
    }

    public Customer(String cuName, int cuId, String cuEmail) {
        this.cuName = cuName;
        this.cuId = cuId;
        this.cuEmail = cuEmail;
    }

    public String getCuName() {
        return cuName;
    }

    public void setCuName(String cuName) {
        this.cuName = cuName;
    }

    public int getCuId() {
        return cuId;
    }

    public void setCuId(int cuId) {
        this.cuId = cuId;
    }

    public String getCuEmail() {
        return cuEmail;
    }

    public void setCuEmail(String cuEmail) {
        this.cuEmail = cuEmail;
    }




    @Override
    public String toString() {
        return "Customer{" +
                "Customer Name is='" + cuName + '\'' +
                ", Customer Id is=" + cuId +
                ",Customer Email is='" + cuEmail + '\'' +
                '}';
    }

}
