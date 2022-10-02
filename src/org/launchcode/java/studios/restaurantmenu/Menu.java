package org.launchcode.java.studios.restaurantmenu;

import java.time.Duration;
import java.util.*;
import java.util.stream.Collectors;

public class Menu {
//    private List<MenuItem> menuItems;
    private Map<String, Map<String, MenuItem>> menuItems;
    private Date dateCreated;
    private Date lastUpdated;

    public Menu() {
        this.menuItems = new HashMap<>();
        this.dateCreated = new Date();
        this.lastUpdated = new Date();
    }

    public void addMenuItem(MenuItem menuItem) {
        this.menuItems.putIfAbsent(menuItem.getCategory(), new HashMap<>());
        this.menuItems.getOrDefault(menuItem.getCategory(), new HashMap<>()).putIfAbsent(menuItem.getDescription(), menuItem);
        // Record date updated
        this.recordDateUpdated();
    }

    public void addMenuItems(Collection<MenuItem> menuItems) {
        menuItems.forEach(menuItem -> this.addMenuItem(menuItem));
    }

    public void removeMenuItem(MenuItem menuItem) {
        // Remove menu item
        this.menuItems.getOrDefault(menuItem.getCategory(), new HashMap<>()).remove(menuItem.getDescription());

        // Record date updated
        this.recordDateUpdated();
    }

    public boolean isMenuItemNew(MenuItem menuItem) {
        // Define what it means to be new.
        final int MAX_DAYS_BETWEEN = 5;
        long daysBetween = Duration.between(this.lastUpdated.toInstant(), menuItem.getDateCreated().toInstant()).toDays();
        System.out.println(daysBetween);

        return daysBetween <= MAX_DAYS_BETWEEN;
    }

    private void recordDateUpdated() {
        this.lastUpdated = new Date();
    }

    public List<MenuItem> getMenuItems() {
        return this.menuItems.values().stream()
                .map(m -> m.values())
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

    }

    public List<MenuItem> getMenuItems(String category) {
        return this.menuItems.getOrDefault(category, new HashMap<>()).values().stream()
                .collect(Collectors.toList());

    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }
}
