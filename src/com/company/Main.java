package com.company;

public class Main {

    public static void main(String[] args) {
        String[] items = {"brokolice", "kreveta", "jablko", "pomeranc", "hruska", "arasidy", "pistacie", "cokolada", "visen", "rohlik"};
        int[] itemsCount = new int[items.length];
        int price = 0;

        if (args[0].equals("help") || args[0].equals("h") || args[0].equals("-h") || args[0].equals("--h")) {
            System.out.println("Write items for shopping list in arguments");
            System.out.println("Available items:");
            for (int i = 0; i < items.length; i++) {
                System.out.println(i + " " + items[i]);
            }
        } else {
            for (String arg : args) {
                switch (Integer.parseInt(arg)) {
                    case 0:
                        price += 50;
                        itemsCount[0]++;
                        break;

                    case 1:
                        price += 100;
                        itemsCount[1]++;
                        break;

                    case 2:
                        price += 10;
                        itemsCount[2]++;
                        break;

                    case 3:
                        price += 15;
                        itemsCount[3]++;
                        break;

                    case 4:
                        price += 20;
                        itemsCount[4]++;
                        break;

                    case 5:
                        price += 5;
                        itemsCount[5]++;
                        break;

                    case 6:
                        price += 5;
                        itemsCount[6]++;
                        break;

                    case 7:
                        price += 50;
                        itemsCount[7]++;
                        break;

                    case 8:
                        price += 25;
                        itemsCount[8]++;
                        break;

                    case 9:
                        price += 4;
                        itemsCount[9]++;
                        break;

                    default:
                        System.out.println("Item " + arg + " does not exist.");
                        break;
                }
            }
        }

        if (price > 0) {
            for (int i = 0; i < items.length; i++) {
                System.out.println(itemsCount[i] + "x" + " " + items[i]);
            }

            System.out.println("Total: " + price);
        }
    }
}
