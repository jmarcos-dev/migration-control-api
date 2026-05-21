package main.java.com.jmarcosdev.migrationcontrolapi.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/migrations")
public class MigrationController {

    @GetMapping
    public String getAllMigrations() {
        return "Lista de migrations";
    }
}