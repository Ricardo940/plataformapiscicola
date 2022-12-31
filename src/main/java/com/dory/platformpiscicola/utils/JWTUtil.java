package com.dory.platformpiscicola.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class JWTUtil {

    private final static String ACCESS_TOKEN_SECRET = "4ada";
    private final static Long ACCESS_TOKEN_VALIDITY_MILISECONDS = 10*60*60*1000L;

    private String secretKey = Base64.getEncoder().encodeToString(ACCESS_TOKEN_SECRET.getBytes());
    Key key = new SecretKeySpec( //WRONG secretKeyEncoded.getBytes(), SignatureAlgorithm.HS256.getJcaName());
            secretKey.getBytes(), SignatureAlgorithm.HS256.getJcaName()); // NOT BASE64!


    public String genereteToken(UserDetails userDetails){

        Date expirationTime = new Date(System.currentTimeMillis() + ACCESS_TOKEN_VALIDITY_MILISECONDS);
        return Jwts.builder()
                .setSubject(userDetails.getUsername())
                .setIssuedAt(new Date())
                .setExpiration(expirationTime)
                .signWith(SignatureAlgorithm.HS256, ACCESS_TOKEN_SECRET)
                .compact();
    }

    public boolean validateToken(String token, UserDetails userDetails){
        return userDetails.getUsername().equals(extractUsername(token)) && !isTokenExpired(token);
    }

    public String extractUsername(String token){
        return getClaims(token).getSubject();
    }
    public boolean isTokenExpired(String token){
        return getClaims(token).getExpiration().before(new Date());
    }

    private Claims getClaims(String token){
        return Jwts.parser().setSigningKey(ACCESS_TOKEN_SECRET).parseClaimsJws(token).getBody();
    }

}
