package org.launchcode.java.studios.restaurantmenu;

import java.text.NumberFormat;
import java.util.Date;
import java.util.Objects;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private Date dateCreated;

    public MenuItem(String description, String category, double price) {
        this(description, category, price, new Date());
    }

    public MenuItem(String description, String category, double price, Date dateCreated) {
        this.description = description;
        this.category = category;
        this.price = price;
        this.dateCreated = dateCreated;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return description.equals(menuItem.description) && category.equals(menuItem.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, category);
    }

    @Override
    public String toString() {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        return description + "\n\tPrice: " + currencyFormat.format(price) + ")" +
                "\n\tCategory: " + this.category;
    }
}
