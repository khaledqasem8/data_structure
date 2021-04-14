/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer_project;

import Queue.CircularQueue;
import java.util.Scanner;

/**
 *
 * @author Msarat
 */
public class CustomerCantrol {
    
    CircularQueue<Customer> list= new CircularQueue<>();
    Scanner input =new Scanner(System.in);
    public int numberOfCustomer()
    {
        return list.size();
    }
    public void addCustomer(){
        Customer c=new Customer();
        System.out.println("enter the Customer id :");
        c.setCuId(input.nextInt());
        System.out.println("enter the Customer Name :");
        c.setCuName(input.nextLine());
        c.setCuName(input.nextLine());
        System.out.println("enter the Customer Email :");
        c.setCuEmail(input.nextLine());
        list.enqueue(c);
    }
    public Customer deleteCustomer(){
        return (Customer) list.dequeue();
    }
    public Customer deleteCustomer(int id){
        if(numberOfCustomer()>0){
            boolean check=false;
            while(!check)
            {
                if(list.first().getCuId()==id)
                {
                    check=true;
                    list.dequeue();
                    System.out.println("the data is deleted successfully ");
                    return null;
                }else
                {
                    list.rotate();
                }

            }
            if(!check )
            {
                System.out.println("the data is not exit ");
            }
        }else{
            System.out.println("there is no data");}




        //return  (Reservation) list.dequeue();
        return null;
    }
    public void printCustomer(int id) {
        if(numberOfCustomer()>0){
            boolean check=false;
            while(!check)
            {
                if(list.first().getCuId()==id)
                {
                    check=true;
                    System.out.println(list.first().toString());
                    System.out.println("the data is deleted successfully ");
                    return ;
                }else
                {
                    list.rotate();
                }

            }
            if(!check )
            {
                System.out.println("the data is not exit ");
            }
        }else{
            System.out.println("there is no data");}


    }
    public void printReserveall()
    {


        int n=numberOfCustomer();
        if(numberOfCustomer() >0)
        {
            for (int i = 0; i <n ; i++)
            {
                list.first().toString();
                list.rotate();
            }
        }else
        {
            System.out.println("there is no data");
        }
    }
    public void updateCustomer(int id)
    {
        deleteCustomer(id);
        Customer c=new Customer();

        c.setCuId(id);
        System.out.println("enter the Customer name pls:");
       // c.setCuName(input.nextLine());
        c.setCuName(input.nextLine());
        System.out.println("enter the Customer Email :");
        c.setCuEmail(input.nextLine());
        list.enqueue(c);

    }


    public boolean isEmpty(){return list.isEmpty();}

}
