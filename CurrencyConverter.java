

import java.util.*;
import java.text.DecimalFormat;

public class CurrencyConverter {
    public static void main(String[] args) {
        double amount, dollar, pound, code, euro, yen, ringgit, rupee, aud ,cad ,bdt;
        
        DecimalFormat f=new DecimalFormat("##, ##");
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Hi, Welcome to the currency converter!");

        System.out.println("Which currency you want to convert ?");

        System.out.println("1: Rupee \t2:Dollar \t3:Pound \n4:Euro \t5:Yen \t6:Ringgit \t7:Aud \8:Cad \t9:Bdt");

        System.out.println("How much Money you want to convert ?");
        amount = sc.nextFloat();

        //For amount Conversion
        if (code == 1) {

            dollar = amount / 70;
            System.out.println("Your " + amount + " Rupee is : " + f.format(dollar) + " Dollar");

            pound = amount / 88;
            System.out.println("Your " + amount + " Rupee is : " + f.format(pound) + "Pound");

            euro = amount / 80;
            System.out.println("Your " + amount + "Rupee is :" + f.format(euro) + " Euro");

            yen= amount / 0.63;
            System.out.println("Your " + amount + " Rupee is :" + f.format(yen) + " Yen");

            ringgit = amount / 16;
            System.out.println("Your " + amount + "Rupee is:" + f.format(ringgit) + "ringgit");

             = amount / 16;
            System.out.println("Your " + amount + "Rupee is:" + f.format(ringgit) + "ringgit");
        } 

        else if (code ==2) {
            //For Dollar Conversion

            rupee = amount * 70;
            System.out.println("Your " + amount + " Dollar is: " + f.format(rupee) + "Rupees");

            pound = amount * 0.78;
            System.out.println("Your " + amount + " Dollar is : " + f.format(pound) + "Pound");

            euro = amount * 0.87;
            System.out.println("Your " + amount + "Dollar is :" + f.format(euro) + " Euro");

            yen= amount * 111.087;
            System.out.println("Your " + amount + " Dollar is :" + f.format(yen) + " Yen");

            ringgit = amount * 4.17;
            System.out.println("Your " + amount + "Dollar is:" + f.format(ringgit) + "ringgit");
            
        }

        else if (code ==3) {
            //For Pound Conversion

            rupee = amount * 88;
            System.out.println("Your " + amount + " Pound is: " + f.format(rupee) + "Rupees");

            dollar = amount / 1.26;
            System.out.println("Your " + amount + " Pound is : " + f.format(dollar) + " Dollar");

            euro = amount * 1.10;
            System.out.println("Your " + amount + " Pound is :" + f.format(euro) + " Euro");

            yen= amount * 140.93;
            System.out.println("Your " + amount + " Pound is :" + f.format(yen) + " Yen");

            ringgit = amount * 5.29;
            System.out.println("Your " + amount + " Pound is:" + f.format(ringgit) + "ringgit");

        }

        else if(code == 4){
        //For Euro Conversion

            rupee = amount * 80;
            System.out.println("Your " + amount + " Euro is: " + f.format(rupee) + "Rupees");

            dollar = amount / 1.14;
            System.out.println("Your " + amount + " Euro  is : " + f.format(dollar) + " Dollar");

            pound = amount * 0.90;
            System.out.println("Your " + amount + " Euro is : " + f.format(pound) + "Pound");

            yen= amount * 127.32;
            System.out.println("Your " + amount + " Euro is :" + f.format(yen) + " Yen");

            ringgit = amount * 4.78;
            System.out.println("Your " + amount + " Euro is:" + f.format(ringgit) + "ringgit");
    }
    else if(code == 5){
        //For Yen Conversion

            rupee = amount * 80;
            System.out.println("Your " + amount + " Yen is: " + f.format(rupee) + "Rupees");

            dollar = amount / 1.14;
            System.out.println("Your " + amount + " Yen  is : " + f.format(dollar) + " Dollar");

            pound = amount * 0.90;
            System.out.println("Your " + amount + " Yen is : " + f.format(pound) + "Pound");

            yen= amount * 127.32;
            System.out.println("Your " + amount + " Yen is :" + f.format(yen) + " Yen");

            ringgit = amount * 4.78;
            System.out.println("Your " + amount + " Yen is:" + f.format(ringgit) + "ringgit");
}   
    else if(code == 6){
    //For Ringgit Conversion

        rupee = amount * 80;
        System.out.println("Your " + amount + " Ringgit is: " + f.format(rupee) + "Rupees");

        dollar = amount / 1.14;
        System.out.println("Your " + amount + " Ringgit  is : " + f.format(dollar) + " Dollar");

        pound = amount * 0.90;
        System.out.println("Your " + amount + " Ringgit is : " + f.format(pound) + "Pound");

        yen= amount * 127.32;
        System.out.println("Your " + amount + " Ringgit is :" + f.format(yen) + " Yen");

        ringgit = amount * 4.78;
        System.out.println("Your " + amount + " Ringgit is:" + f.format(ringgit) + "ringgit");
    }
    else if(code == 7){
        //For AUD Conversion

            rupee = amount * 80;
            System.out.println("Your " + amount + " AUD is: " + f.format(rupee) + "Rupees");

            dollar = amount / 1.14;
            System.out.println("Your " + amount + " AUD  is : " + f.format(dollar) + " Dollar");

            pound = amount * 0.90;
            System.out.println("Your " + amount + " AUD is : " + f.format(pound) + "Pound");

            yen= amount * 127.32;
            System.out.println("Your " + amount + " AUD is :" + f.format(yen) + " Yen");

            ringgit = amount * 4.78;
            System.out.println("Your " + amount + " AUD is:" + f.format(ringgit) + "ringgit");
}
    else if(code == 8){
    //For CAD Conversion

        rupee = amount * 80;
        System.out.println("Your " + amount + " CAD is: " + f.format(rupee) + "Rupees");

        dollar = amount / 1.14;
        System.out.println("Your " + amount + " CAD  is : " + f.format(dollar) + " Dollar");

        pound = amount * 0.90;
        System.out.println("Your " + amount + " CAD is : " + f.format(pound) + "Pound");

        yen= amount * 127.32;
        System.out.println("Your " + amount + " CAD is :" + f.format(yen) + " Yen");

        ringgit = amount * 4.78;
        System.out.println("Your " + amount + " CAD is:" + f.format(ringgit) + "ringgit");
    }
    else if(code == 9){
        //For BDT Conversion

            rupee = amount * 80;
            System.out.println("Your " + amount + " BDT is: " + f.format(rupee) + "Rupees");

            dollar = amount / 1.14;
            System.out.println("Your " + amount + " BDT  is : " + f.format(dollar) + " Dollar");

            pound = amount * 0.90;
            System.out.println("Your " + amount + " BDT is : " + f.format(pound) + "Pound");

            yen= amount * 127.32;
            System.out.println("Your " + amount + " BDT is :" + f.format(yen) + " Yen");

            ringgit = amount * 4.78;
            System.out.println("Your " + amount + " BDT is:" + f.format(ringgit) + "ringgit");
}
        
            
