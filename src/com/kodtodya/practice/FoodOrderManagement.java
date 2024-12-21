package com.kodtodya.practice;

import com.kodtodya.practice.service.CustomerService;

import java.util.Scanner;

public class FoodOrderManagement {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();

        System.out.println("--------- Welcome to Food Order Management -----------");
        int option = 0;
        do {
            System.out.println("1. create a customer");
            System.out.println("2. Display all customers");
            System.out.println("Pls enter option:");
            option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1:
                    // crate customer
                    customerService.registerCustomer();
                    break;
                case 2:
                    // crate customer
                    customerService.displayCustomers();
                    break;

                default:
                    System.out.println("invalid option");
            }
        } while(option != 0);
    }
}