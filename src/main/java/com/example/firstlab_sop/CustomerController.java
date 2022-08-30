package com.example.firstlab_sop;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {
    private List<Customer> customers;
    private boolean gender;

    public CustomerController(List<Customer> customers) {
        this.customers = new ArrayList<Customer>();
        this.customers.add(new Customer("1010", "John", true, 25));
        this.customers.add(new Customer("1018", "Peter", true, 24));
        this.customers.add(new Customer("1019", "Sara", false, 23));
        this.customers.add(new Customer("1110" , "Rose", false, 23));
        this.customers.add(new Customer("1001", "Emma", false, 30));
    }

    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    public List<Customer> getCustomers(){
        return this.customers;
    }

    @RequestMapping(value = "/customerbyid/{id}", method = RequestMethod.GET)
    public Customer getCustomerByID(@PathVariable("id") String ID){
        for (Customer data: this.customers) {
            if(data.getID().equals(ID)){
                return data;
            }
        }
        return null;
    }

    @RequestMapping(value = "/customerbyname/{n}", method = RequestMethod.GET)
    public Customer getCustomerByName(@PathVariable("n") String n){
        for (Customer data:
             this.customers) {
            if (data.getName().equals(n)){
                return data;
            }
        }
        return null;
    }

    @RequestMapping(value = "/customerDelByid/{id}", method = RequestMethod.DELETE)
    public boolean delCustomerByID(@PathVariable("id") String ID){
        for (Customer data:
                this.customers) {
            if (data.getID().equals(ID)){
                this.customers.remove(data);
                return true;
            }
        }
        return false;
    }

    @RequestMapping(value = "/customerDelByname/{n}", method = RequestMethod.DELETE)
    public boolean delCustomerByName(@PathVariable("n") String n){
        for (Customer data:
                this.customers) {
            if (data.getName().equals(n)) {
                this.customers.remove(data);
                return true;
            }
        }
        return false;
    }
    @RequestMapping(value = "/addCustomer")
    public  boolean addCustomer(@RequestParam("id") String ID,
                                @RequestParam("name") String n,
                                @RequestParam("sex") String s,
                                @RequestParam("age") int a){
        this.gender = (s.equals("female") || s.equals("Female")) ? false : true;
        this.customers.add(new Customer(ID, n, this.gender, a));
        return true;
    }

    @RequestMapping(value = "/addCustomer2", method = RequestMethod.POST)
    public  boolean addCustomer2(@RequestParam("id") String ID,
                                @RequestParam("name") String n,
                                @RequestParam("sex") String s,
                                @RequestParam("age") int a){
        this.gender = (s.equals("female") || s.equals("Female")) ? false : true;
        this.customers.add(new Customer(ID, n, this.gender, a));
        return true;
    }
}
