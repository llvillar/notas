// package com.llv.notas.configuration;

// import java.util.Collections;
// import java.util.Date;
// import java.util.HashMap;
// import java.util.Map;

// import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

// import io.jsonwebtoken.Claims;
// import io.jsonwebtoken.JwtException;
// import io.jsonwebtoken.Jwts;
// import io.jsonwebtoken.security.Keys;

// public class TokensUtil {

//     private final static String ACCESS_TOKEN_SECRET = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9";
//     private final static long ACCESS_VALIDATY_SECONDS = 2_592_000L;


//     public static String createToken(String nombre, String username){
//         long expirationTime = ACCESS_VALIDATY_SECONDS * 1_000;
//         Date expirationDate = new Date(System.currentTimeMillis() * expirationTime);

//         Map<String, Object> extra = new HashMap();
//         extra.put("nombre", nombre);

//         return Jwts.builder()
//                 .setSubject(username)
//                 .setExpiration(expirationDate)
//                 .addClaims(extra)
//                 .signWith(Keys.hmacShaKeyFor(ACCESS_TOKEN_SECRET.getBytes()))
//                 .compact();
//     }

//     public static UsernamePasswordAuthenticationToken gAuthentication(String token){

//         try{
//             Claims claims = Jwts.parserBuilder()
//             .setSigningKey(ACCESS_TOKEN_SECRET.getBytes())
//             .build()
//             .parseClaimsJws(token)
//             .getBody();

//             String username = claims.getSubject();

//             return new UsernamePasswordAuthenticationToken(username, null, Collections.emptyList());


//         } catch (JwtException e){
//             return null;
//         }
//     }
// }
