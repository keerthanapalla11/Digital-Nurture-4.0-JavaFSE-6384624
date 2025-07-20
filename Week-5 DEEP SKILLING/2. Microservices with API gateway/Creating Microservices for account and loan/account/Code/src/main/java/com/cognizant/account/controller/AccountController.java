package com.cognizant.account.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class AccountController {

    @GetMapping("/accounts/{number}")
    public Map<String, Object> getAccountByNumber(@PathVariable String number) {
        Map<String, Object> accountDetails = new HashMap<>();
        accountDetails.put("number", number);
        accountDetails.put("type", "savings");
        accountDetails.put("balance", 234343);
        return accountDetails;
    }
}
