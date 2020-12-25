package com.LogosBuh;

import javax.naming.NameNotFoundException;
import java.util.Scanner;
import java.lang.String;

public class Main {
    private Scanner scanner = new Scanner(System.in);

       public static void main(String[] args) {
        Main main = new Main();
        String monthFromScanner = main.readFromScanner("Введіть МІСЯЦЬ");
        Months month;
        try {
            month = main.convertFromString(monthFromScanner);

        } catch (NameNotFoundException e) {
            System.out.println("Введенно неправильний місяць");
        }


        String monthFromSesons = main.readFromScannerSesons("Введіть пору року");
            sesonsMoths(); {
            String sesonsMoth = monthFromSesons.toLowerCase();

            switch(sesonsMoth) {
                case Season.WINTER:
                    System.out.println("Грудень Cічень Лютий ");
                    break;
                case Season.SPRING:
                    System.out.println("Березень, квітень, травень");
                    break;
                case Season.SUMMER:
                    System.out.println("червень липень серпень");
                    break;
                case Season.FALL:
                    System.out.println("вересень жовтень листопад");
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + sesonsMoth);
            }

    }
        main.nextTurn();
    }



    public void nextTurn() {
        System.out.println("Бажаєте продовжити....");
        String action = readFromScanner("(так/ні)");
        if (Action.NO.getV().equals(action)) {
            System.exit(0);
        } else if (Action.YES.getV().equals(action)){
            main(new String[]{});
        }
        nextTurn();
    }

    public Months convertFromString(String str) throws NameNotFoundException {
        Months[] values = Months.values();
        for (Months months : values) {
            boolean equals = months.getMonth().equals(str);
            if (equals) {
                return months;
            }
        }
        throw new NameNotFoundException();
    }

    public String readFromScanner(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }
    public String readFromScannerSesons(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }
    private enum Action {
        YES("так"),
        NO("ні");

        private String v;

        Action(String v) {
            this.v = v;
        }

        public String getV() {
            return v;
        }
    }
    public static void sesonsMoths() {
    }

    }


