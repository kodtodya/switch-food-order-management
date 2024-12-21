package com.kodtodya.practice.service;

import com.kodtodya.practice.model.Customer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class CustomerService {

    //private ArrayList<Customer> customers = new ArrayList<>();
    private HashSet<Customer> customers = new HashSet<>();
    private Scanner scanner = new Scanner(System.in);


    void printCustomer(Customer customer) {
        System.out.println(customer);
    }

    public Customer registerCustomer() {
        Customer customer = new Customer();
        //use scanner to accept the values and set to customer object
        System.out.println("Pls enter id of customer:");
        int customerId = Integer.parseInt(scanner.nextLine());
        customer.setId(customerId);
        System.out.println("Pls enter name of customer:");
        String firstName = scanner.nextLine();
        customer.setFirstName(firstName);
        //customer.setId();
        customers.add(customer);
        return customer;
    }

    public void displayCustomers() {
        for(Customer customer : customers) {
            System.out.println("Customer Info: " + customer);
        }
    }
}
