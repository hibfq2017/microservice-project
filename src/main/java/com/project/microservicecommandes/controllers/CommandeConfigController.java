package com.project.microservicecommandes.controllers;

import com.project.microservicecommandes.configuration.CommandeConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/config")
public class CommandeConfigController {

        @Autowired
        private CommandeConfig commandeConfig;

        @GetMapping("/last-days")
        public int getCommandesLast() {
            return commandeConfig.getCommandesLast();
        }

}
