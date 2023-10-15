package com.malli.notificationservice.controller;

import com.malli.notificationservice.service.NotificationService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/notification")
@Tag(name = "NotificationController", description = "Notification management APIs")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @GetMapping("/status")
    public String showStatus() {
        return "Notification application is Running";
    }

}
