package com.kodtodya.practice;

import java.util.Scanner;

public class FoodOrderManagement {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("--------- Welcome to Food Order Management -----------");
        int option = 0;
        do {
            System.out.println("Pls enter option:");
            option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1:
                    // crate customer
                    System.out.println("create customer call");
                    break;

            }
        } while(option != 0);
    }
}