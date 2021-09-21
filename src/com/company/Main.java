package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        switch (args[0]) {
            case "h":
                System.out.println("Write items for shopping list in arguments");
                break;
            default:
                int i = 0;
                for (String arg : args) {
                    i++;
                    System.out.println(i + ". item: " + arg);
                }
                break;
        }

    }
}
