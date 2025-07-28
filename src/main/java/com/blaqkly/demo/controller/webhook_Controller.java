package com.blaqkly.demo.controller;
import com.blaqkly.demo.model.Product_model;
import com.blaqkly.demo.repo.productRepo;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.blaqkly.demo.model.Webhook_model;
import com.blaqkly.demo.repo.webhookRepo;


import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;

@RestController
@RequestMapping("/api")
public class webhook_Controller {

    @Autowired
    private webhookRepo repo;


        @PostMapping("/webhook")
    public ResponseEntity<Webhook_model> addWebhook(@RequestBody Webhook_model body) {
        Webhook_model savedWebhook = repo.save(body);
        return ResponseEntity.ok(savedWebhook);
    }

    ;
}

//    public ResponseEntity<String> handleWebhook(@RequestBody webhook_model body,
//                                                @RequestHeader("x-signature") String receivedSignature) {
//        String secret = "b3273ae16f5443cab2e622062d0cd075";
//        System.out.println(receivedSignature +  " " + "receivedSignature");
//
//        byte[] secretBytes = secret.getBytes(StandardCharsets.UTF_8);
//        byte[] payloadBytes = body.getBytes(StandardCharsets.UTF_8);
//
//        try {
//            Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
//            SecretKeySpec secretKey = new SecretKeySpec(secretBytes, "HmacSHA256");
//            sha256_HMAC.init(secretKey);
//
//            byte[] hash = sha256_HMAC.doFinal(payloadBytes);
//            String computedSignature = Base64.getEncoder().encodeToString(hash);
//            System.out.println(computedSignature + " " + "computedSignature");
//
//            if (!MessageDigest.isEqual(computedSignature.getBytes(), receivedSignature.getBytes())) {
//
//                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid signature");
//
//            }
//
//            // TODO: Deserialize and process body
//
//            webhook_model res = repo.save(body);
//            ObjectMapper mapper = new ObjectMapper();
//            String response = mapper.writeValueAsString(res);
//
//            return ResponseEntity.ok(response);
//
//        } catch (Exception e) {
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error processing signature");
//        }
//    }
//}
