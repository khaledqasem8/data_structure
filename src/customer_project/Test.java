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
public class Test {
       public static void main(String[] args) {
        CustomerCantrol c=new CustomerCantrol();
        c.addCustomer();
        c.addCustomer();
        c.printCustomer(2);
        c.updateCustomer(1);
        c.printCustomer(1);
        

       }
}