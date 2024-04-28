package br.com.ConfigurationExternalProperties.controller;

import br.com.ConfigurationExternalProperties.service.PingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ping")
public class PingController {

    @Autowired
    private PingService pingService;

    @PostMapping
    public ResponseEntity<String> getProperties() {
        return ResponseEntity.ok().body(pingService.getProperties());
    }
}