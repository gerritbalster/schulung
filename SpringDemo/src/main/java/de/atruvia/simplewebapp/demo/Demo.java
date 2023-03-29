package de.atruvia.simplewebapp.demo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.atruvia.simplewebapp.service.BlacklistService;
import de.atruvia.simplewebapp.service.Person;
import jakarta.annotation.PostConstruct;

//@Service
@Transactional
public class Demo {


    private final BlacklistService blacklistService;
    private String message = "Hallo Welt"; // 2. FieldInjection
    
    public Demo(@Value("${Demo.gruss}") String message, BlacklistService blacklistService) {  // 1. Construktor
        this.blacklistService = blacklistService;
        this.message = message;
        System.out.println("Ctor Demo");
        System.out.println(message);
    }

    @PostConstruct
    public void init() { // 3. PostConstruct
        System.out.println(message);
        Person p = new Person();
        p.setVorname("Peter");
        System.out.println(String.format("%s isBacklisted=%s", p, blacklistService.isBlacklisted(p)));
        p.setVorname("FRanz");
        System.out.println(String.format("%s isBacklisted=%s", p, blacklistService.isBlacklisted(p)));

    }
}
