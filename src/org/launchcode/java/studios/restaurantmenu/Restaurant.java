package org.launchcode.java.studios.restaurantmenu;

import java.util.Arrays;

public class Restaurant {
    public static void main(String[] args) {
        Menu menu = new Menu();

        MenuItem fries = new MenuItem("Fries", "Appetizer", 2.50);
        MenuItem cake = new MenuItem("Cheese Cake", "Dessert", 7.50);
        MenuItem iceCream = new MenuItem("Ice-cream Cone", "Dessert", 2.50);
        MenuItem burger = new MenuItem("Whopper", "Meal", 6.75);

        menu.addMenuItems(Arrays.asList(fries, cake, burger, iceCream));

        menu.getMenuItems().stream()
                .forEach(m -> {
                    System.out.println(m);
                    System.out.println("Is new? " + menu.isMenuItemNew(m));
                    System.out.println();
                });
        System.out.println("----------");
        menu.getMenuItems("Dessert").stream()
                .forEach(m -> {
                    System.out.println(m);
                    System.out.println("Is new? " + menu.isMenuItemNew(m));
                    System.out.println();
                });

        System.out.println(menu.getDateCreated().toInstant());
        System.out.println(menu.getLastUpdated().toInstant());


    }
}
