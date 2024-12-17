package com.example.kubespringapp.controller;

import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() throws UnknownHostException {
        var localHost = InetAddress.getLocalHost();
        var hostName = localHost.getHostName();
        log.info("Host Name: {}", hostName);

        log.info("Hello, World!");
        return "Hello, World!";
    }

}
