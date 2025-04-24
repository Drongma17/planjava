package com.udemy.amazon;

import java.util.List;

public class Order {

    private int orderId;
    private String orderName;
    private int orderCount;
    private List<Item> itemList;

    public Order(int orderId, String orderName, int orderCount, List<Item> itemList) {
        this.orderId = orderId;
        this.orderName = orderName;
        this.orderCount = orderCount;
        this.itemList = itemList;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public int getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(int orderCount) {
        this.orderCount = orderCount;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderName='" + orderName + '\'' +
                ", orderCount=" + orderCount +
                ", itemList=" + itemList +
                '}';
    }
}
