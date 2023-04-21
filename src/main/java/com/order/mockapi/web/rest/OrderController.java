package com.order.mockapi.web.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class OrderController {
    @PostMapping("/request-payment-gateway")
    public ResponseEntity<String> handlePaymentRequest() {
        if (Math.round(Math.random()) == 1) {
            return ResponseEntity.ok().body("PAYMENT_SUCCESS");
        }
        return ResponseEntity.ok().body("PAYMENT_FAILED");
    }

    @PostMapping("/inform-store")
    public ResponseEntity<String> informStore() {
        return ResponseEntity.ok().body("Informed store");
    }

    @PostMapping("/inform-customer")
    public ResponseEntity<String> informCustomer() {
        return ResponseEntity.ok().body("Informed customer successfully!");
    }

    @GetMapping("/response-from-delivery")
    public ResponseEntity<String> respondFromDelivery() {
        return ResponseEntity.ok().body("Delivery got an order!");
    }
}
