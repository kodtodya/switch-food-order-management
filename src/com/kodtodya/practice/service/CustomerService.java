package com.kodtodya.practice.service;

import com.kodtodya.practice.model.Customer;

public class CustomerService {

    private Customer[] customers = new Customer[10];

    void printCustomer(Customer customer) {
        System.out.println(customer);
    }

    public Customer registerCustomer() {
        Customer customer = new Customer();
        //use scanner to accept the values and set to customer object
        //customer.setId();
        customers[0] = customer;
        return customer;
    }
}
