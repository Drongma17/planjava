package com.udemy.amazon;

import java.util.List;
import java.util.stream.Collectors;

public class ShopNow {


    List<Item> getAllItems(List<Order> orders){
        return orders.stream()
                .flatMap(order -> order.getItemList().stream())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {



    }
}
