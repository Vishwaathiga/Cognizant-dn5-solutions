package com.cognizant.springlearn.controller;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class AuthenticationController {

    private static final Logger LOGGER = 
        LoggerFactory.getLogger(AuthenticationController.class);

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(
            @RequestHeader("Authorization") String authHeader) {

        LOGGER.info("Start");
        LOGGER.debug("Auth Header: {}", authHeader);

        // Step 1: User decode பண்ணு
        String user = getUser(authHeader);

        // Step 2: JWT generate பண்ணு
        String token = generateJwt(user);

        // Step 3: Response map create பண்ணு
        Map<String, String> map = new HashMap<>();
        map.put("token", token);

        LOGGER.info("End");
        return map;
    }

    // Base64 decode பண்ணி username எடுக்கறது
    private String getUser(String authHeader) {
        LOGGER.debug("Start getUser");
        String encodedCredentials = authHeader.substring("Basic ".length());
        byte[] decodedBytes = Base64.getDecoder().decode(encodedCredentials);
        String credentials = new String(decodedBytes);
        String user = credentials.substring(0, credentials.indexOf(":"));
        LOGGER.debug("User: {}", user);
        return user;
    }

    // JWT Token generate பண்றது
    private String generateJwt(String user) {
        LOGGER.debug("Start generateJwt for user: {}", user);
        JwtBuilder builder = Jwts.builder();
        builder.setSubject(user);
        builder.setIssuedAt(new Date());
        builder.setExpiration(new Date((new Date()).getTime() + 1200000)); // 20 mins
        builder.signWith(SignatureAlgorithm.HS256, "secretkey");
        String token = builder.compact();
        LOGGER.debug("Token: {}", token);
        return token;
    }
}