package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner Sc = new Scanner(System.in);
        String mygrocerylist = "";
        Random rn = new Random();
        ArrayList< Grocery1>grocerylist = new ArrayList<>();

        do {

            System.out.println("Enter the Item Name");
            String userInputName = Sc.next();
            System.out.println("Enter the price");
            double userInputPrice = Sc.nextDouble();
            System.out.println("Enter the quantity ");
           // System.out.println(" Enter the cost");
           // double userInputCost = Sc.nextDouble();
            int userInputQuantity = Sc.nextInt();
            //System.out.println("Enter the quantity purchase");
            //int userInputQuantity = rn.nextInt();
           // System.out.println("Enter the cost");
            double userInputCost = userInputPrice*userInputQuantity;
            //double userInputCost = Sc.nextDouble();
            System.out.println("does this Item Taxable(True or false):");
            boolean userInputTaxable = Sc.nextBoolean();

            grocerylist.add(new Grocery1(userInputName,userInputPrice,userInputQuantity,userInputPrice*userInputQuantity,userInputTaxable));
            System.out.println("would you like to enter more Item Y(yes) or N(no)");
            mygrocerylist = Sc.next();


        }while (!mygrocerylist.equalsIgnoreCase("no"));

        System.out.println("Item Name"+"\t"+"Price"+"\t"+"Quantity"+"\t"+ "Cost"+"\t"+"Taxable");
        double subtotalAmount = 0;
        double GrandTotal = 0;
        double Taxrate = 0;
        double SalesTax = 0;
        double cost = 0;


        for (Grocery1 newlist: grocerylist){
            System.out.println(newlist.getName()+"\t\t\t"+newlist.getPrice()+"\t\t\t"+newlist.getQuantity()+"\t\t\t"+newlist.getCost()+"\t\t\t"+ newlist.isTaxable());
            subtotalAmount += newlist.getCost();
             SalesTax += newlist.getCost()*Taxrate;
            GrandTotal += newlist.getCost();
        }


        ArrayList<Double> Taxable = new ArrayList<>();

        Taxable.add(6.00);
        Taxable.add(5.30);
        Taxable.add(5.75);
        Taxable.add(5.00);

        Random rnx = new Random();
        int index = rnx.nextInt(Taxable.size()-1);
        double Taxable1 = Taxable.get(index);
        double Taxrate2 = Taxable.get(index);
        SalesTax += cost*Taxrate;

        //System.out.println("\n" + Taxable+ "");

        System.out.println("Total purchase Amount=" +subtotalAmount);
        System.out.println("tax rate = " + Taxable.get(index));
        System.out.println("sales tax =" + Taxrate*cost.(index));
       System.out.println("Grand Total=" +grocerylist.size());



    }

}
