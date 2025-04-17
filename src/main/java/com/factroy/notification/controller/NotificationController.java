package com.factroy.notification.controller;


import com.factroy.notification.dtos.DtoPaymentResponse;
import com.factroy.notification.dtos.NotificationRequest;
import com.factroy.notification.services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//@CrossOrigin(origins = "http://localhost:5173", allowCredentials = "true")
@RestController
@RequestMapping("/notification")
public class NotificationController {
    @Autowired
    private NotificationService notificationService;

    @PostMapping("/{notificationType}")
    public ResponseEntity<?> processNotification(@PathVariable String notificationType, @RequestBody NotificationRequest data) {
        String response= notificationService.processNotification(notificationType, data);
        return ResponseEntity.ok(response);
    }
}
