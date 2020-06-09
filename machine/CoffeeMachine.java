package machine;

import java.util.Scanner;

public class CoffeeMachine {

    static int machineWater = 400;
    static int machineMilk = 540;
    static int machineBeans = 120;
    static int machineCups = 9;
    static int money = 550;
//    final static int WATER = 200;
//    final static int MILK = 50;
//    final static int BEANS = 15;

    public static void main(String[] args) {
        int exit = 0;
        do {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            Scanner in = new Scanner(System.in);
            String action = in.next();
            switch (action) {
                case "buy":
                    buy();
                    break;
                case "fill":
                    fillMachine();
                    break;
                case "take":
                    take();
                    break;
                case "remaining":
                    machineContent();
                    break;
                case "exit":
                    exit = 1;
                    break;
                case "back":
                    break;
                default:
                    System.out.println("Unknown command try again");
            }
            System.out.println();
        } while (exit!=1);

    }

    public static void machineContent(){
        System.out.println("The coffee machine has:");
        System.out.println(CoffeeMachine.machineWater + " of water");
        System.out.println(CoffeeMachine.machineMilk + " of milk");
        System.out.println(CoffeeMachine.machineBeans+ " of coffee beans");
        System.out.println(CoffeeMachine.machineCups + " of disposable cups");
        System.out.println(CoffeeMachine.money + " of money\n");
    }

    public static void fillMachine(){
        Scanner in = new Scanner(System.in);
        System.out.println("Write how many ml of water do you want to add:");
        CoffeeMachine.machineWater = CoffeeMachine.machineWater + in.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        CoffeeMachine.machineMilk = CoffeeMachine.machineMilk + in.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        CoffeeMachine.machineBeans = CoffeeMachine.machineBeans + in.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        CoffeeMachine.machineCups = CoffeeMachine.machineCups + in.nextInt();
    }

//    public static void makeCoffee(){
//        System.out.println("Write how many cups of coffee you will need:");
//        Scanner in = new Scanner(System.in);
//        int cups = in.nextInt();
//        int a = CoffeeMachine.machineWater / CoffeeMachine.WATER;
//        int b = CoffeeMachine.machineMilk / CoffeeMachine.MILK;
//        int c = CoffeeMachine.machineBeans / CoffeeMachine.BEANS;
//        int d = Math.min(a, Math.min(b, c));
//
//        if (d == cups) {
//            System.out.println("Yes, I can make that amount of coffee");
//        } else if (d < cups) {
//            System.out.println("No, I can make only " + d + " cup(s) of coffee");
//        } else if (d > cups) {
//            System.out.println("Yes, I can make that amount of coffee (and even " + (d-cups) + " more than that)");
//        }
//
//        }

    public static void take(){
        System.out.println("I gave you $" + CoffeeMachine.money);
        CoffeeMachine.money = 0;
    }

    public static void buy() {
        Scanner in = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String cof = in.next();
        switch (cof) {
            case "1":
                espresso();
                break;
            case "2":
                latte();
                break;
            case "3":
                cappuccino();
                break;
            case "back":
                break;
            default:
                System.out.println("Wrong input. Please enter 1-3");
        }
    }

    public static void espresso(){
        int water = 250;
        int beans = 16;
        if (CoffeeMachine.machineWater < water) {
            System.out.println("Sorry, not enough water!\n");
        } else if (CoffeeMachine.machineBeans < beans){
            System.out.println("Sorry, not enough coffee beans!\n");
        } else {
            System.out.println("I have enough resources, making you a coffee!\n");
            CoffeeMachine.machineWater -= water;
            CoffeeMachine.machineBeans -= beans;
            CoffeeMachine.money+=4;
            CoffeeMachine.machineCups--;
        }
    }

    public static void latte(){
        int water = 350;
        int milk = 75;
        int beans = 20;
        if (CoffeeMachine.machineWater < water) {
            System.out.println("Sorry, not enough water!\n");
        } else if (CoffeeMachine.machineBeans < beans){
            System.out.println("Sorry, not enough coffee beans!\n");
        } else if (CoffeeMachine.machineMilk < milk){
            System.out.println("Sorry, not enough coffee milk!\n");
        } else {
            System.out.println("I have enough resources, making you a coffee!\n");
            CoffeeMachine.machineWater -= water;
            CoffeeMachine.machineBeans -= beans;
            CoffeeMachine.machineMilk -= milk;
            CoffeeMachine.money+=7;
            CoffeeMachine.machineCups--;
        }
    }

    public static void cappuccino(){
        int water = 200;
        int milk = 100;
        int beans = 12;
        if (CoffeeMachine.machineWater < water) {
            System.out.println("Sorry, not enough water!\n");
        } else if (CoffeeMachine.machineBeans < beans){
            System.out.println("Sorry, not enough coffee beans!\n");
        } else if (CoffeeMachine.machineMilk < milk){
            System.out.println("Sorry, not enough coffee milk!\n");
        } else {
            System.out.println("I have enough resources, making you a coffee!\n");
            CoffeeMachine.machineWater -= water;
            CoffeeMachine.machineBeans -= beans;
            CoffeeMachine.machineMilk -= milk;
            CoffeeMachine.money+=6;
            CoffeeMachine.machineCups--;
        }
    }



    }
