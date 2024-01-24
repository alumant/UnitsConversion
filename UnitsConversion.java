package com.alumant.model;

import java.util.Scanner;

public class UnitsConversion {

    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);

        String convertFrom, convertTo;
        double quantity;

        double feetToMetersConversion = 0.3048;
        double poundToKgConversion = 0.45359237;

        while (true) {
            System.out.println("Enter the unit to convert from");
            convertFrom = input.next().toLowerCase();
            System.out.println("Enter the unit to convert to");
            convertTo = input.next().toLowerCase();
            System.out.println("Enter the quantity");
            quantity = input.nextDouble();

            if ((convertFrom.equals("feet") && convertTo.equals("meters")) || (convertFrom.equals("meters") && convertTo.equals("feet"))) {
                double result = convertFrom.equals("feet") ? quantity * feetToMetersConversion : quantity / feetToMetersConversion;
                System.out.println(quantity + " " + convertFrom + " is equal to " + result + " " + convertTo);
                break;
            } else if ((convertFrom.equals("pound") && convertTo.equals("kg")) || (convertFrom.equals("kg") && convertTo.equals("pound"))) {
                double result = convertFrom.equals("pound") ? quantity * poundToKgConversion : quantity / poundToKgConversion;
                System.out.println(quantity + " " + convertFrom + " is equal to " + result + " " + convertTo);
                break;
            } else if ((convertFrom.equals("fahrenheit") && convertTo.equals("celsius")) || (convertFrom.equals("celsius") && convertTo.equals("fahrenheit"))) {
                double result = convertFrom.equals("fahrenheit") ? (quantity - 32) / 1.8 : (quantity * 1.8) + 32;
                System.out.println(quantity + " " + convertFrom + " is equal to " + result + " " + convertTo);
                break;
            } else {
                System.out.println("Enter valid units for conversion.");
            }
        }

        input.close();
    }
}


 