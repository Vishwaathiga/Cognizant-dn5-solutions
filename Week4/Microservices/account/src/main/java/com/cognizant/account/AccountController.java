package com.cognizant.account;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountController {

    private static final Logger LOGGER =
        LoggerFactory.getLogger(AccountController.class);

    @GetMapping("/accounts/{number}")
    public Account getAccount(@PathVariable String number) {
        LOGGER.info("Start - getAccount: {}", number);

        // Dummy response — no DB connection!
        Account account = new Account(
            "00987987973432",
            "savings",
            234343
        );

        LOGGER.info("End - getAccount");
        return account;
    }
}