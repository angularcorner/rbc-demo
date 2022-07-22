package com.example.demo.rest;

import com.example.demo.service.UserIdService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/userId")
@AllArgsConstructor
public class UserIdController {
    private final UserIdService userIdService;

    @PreAuthorize("hasRole('RBC')")
    @GetMapping()
    ResponseEntity<Long> getAutoId() {
        Random rand = new Random();
        return ResponseEntity.ok(userIdService.getNextUserId()  );
    }
}
