package com.example.kubespringapp.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ByeController {

    @GetMapping("/bye")
    public String bye() throws UnknownHostException {
        var localHost = InetAddress.getLocalHost();
        var hostName = localHost.getHostName();
        log.info("Host Name: {}", hostName);

        log.info("Bye, World!");
        return "Bye, World!";
    }

}
