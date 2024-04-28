package br.com.ConfigurationExternalPropertiesPong.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pong")
public class PongController {

    @GetMapping("/dev")
    public ResponseEntity<String> dev() {
        return ResponseEntity.ok().body("dev properties");
    }

    @GetMapping("/prod")
    public ResponseEntity<String> prod() {
        return ResponseEntity.ok().body("prod properties");
    }
}
