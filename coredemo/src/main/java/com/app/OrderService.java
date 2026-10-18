package com.app;

import com.app.notification.NotificationService;

public class OrderService {

    NotificationService notification;

    public OrderService(NotificationService notification){
        this.notification = notification;
    }
    
    public void placeOrder(){

        System.out.println("Order placed.");
        notification.sendNotification();

    }
}
