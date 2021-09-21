package com.company;

public class Main {

    public static void main(String[] args) {
        switch (args[0]) {
            case "help", "h", "-h", "--h":
                System.out.println("Write items for shopping list in arguments");
                System.out.println("Available items: broccoli, shrimp, apple, Till");
                break;

            default:
                int price = 0;
                String[] items = {"broccoli", "shrimp", "apple", "Till"};
                int[] itemsCount = new int[4];

                for (String arg : args) {
                        switch (Integer.parseInt(arg)) {
                            case 1:
                                price += 50;
                                itemsCount[0]++;
                                break;

                            case 2:
                                price += 100;
                                itemsCount[1]++;
                                break;

                            case 3:
                                price += 15;
                                itemsCount[2]++;
                                break;

                            case 4:
                                price += 500;
                                itemsCount[3]++;
                                break;

                            default:
                                System.out.println("Item " + arg + " does not exist.");

                        }
                }

                for (int i = 0; i < items.length; i++) {
                    System.out.println(itemsCount[i] + "x" + " " + items[i]);
                }

                System.out.println("Total: " + price);
                break;
        }

    }
}
