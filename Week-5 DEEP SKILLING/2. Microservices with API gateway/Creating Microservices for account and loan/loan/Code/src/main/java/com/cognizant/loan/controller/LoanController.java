package com.cognizant.loan.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class LoanController {

    @GetMapping("/loans/{loanNumber}")
    public Map<String, Object> getLoanByNumber(@PathVariable String loanNumber) {
        Map<String, Object> loanDetails = new HashMap<>();
        loanDetails.put("loanNumber", loanNumber);
        loanDetails.put("type", "home loan");
        loanDetails.put("amount", 500000);
        return loanDetails;
    }
}
