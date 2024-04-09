package org.example.basicwebshop.services;

import org.example.basicwebshop.models.ShopItem;

import java.util.ArrayList;
import java.util.List;

public class ShopItemsList {

    private List<ShopItem> itemList;

    public ShopItemsList() {
        itemList = new ArrayList<>();
        this.itemList.add(new ShopItem("Running shoes","Nike running shoes for every day", 1000, 5));
        this.itemList.add(new ShopItem("Printer","HP ink-jet office printer", 3000, 2));
        this.itemList.add(new ShopItem("Coca Cola","0.5l bottle", 25, 0));
        this.itemList.add(new ShopItem("Wokin","Chicken with fried rice and WOKIN sauce", 119, 100));
        this.itemList.add(new ShopItem("T-shirt","Blue with a corgi on a bike", 300, 1));
    }

    public void addItem(ShopItem item) {
        this.itemList.add(item);
    }

    public List<ShopItem> getItemList() {
        return itemList;
    }
}
