package com.app;

import com.app.notification.NotificationService;
import com.app.notification.SmsService;

public class App {

    public static void main(String[] args) {

        NotificationService notification = new SmsService();
        OrderService orderService = new OrderService(notification);

        orderService.placeOrder();

        /*In real life projects there will thousands of services and all the dependencies will be handled in main, which will make
          the main.java very much complecated , here spring framework helps in managing the dependencies and make the main loosely coupled.

          IOC (Inversion Of Control) is the idea and the Dependecy Injection is the approach.

          Spring have a IOC Container which will manage:
            1. Create object
            2. Manage object
            3. Connects object together

          Spring IOC Container is known as Beans.
        */
    }
}
