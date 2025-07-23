package com.blaqkly.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.nio.charset.Charset;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class webhook_model {


    @Id //
    @JsonProperty("businessId")
    private String businessId;


    @JsonProperty("amount")
    private String amount;


    @JsonProperty("message")
    private String message;

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public String getAmount() { return amount; }
    public void setAmount(String amount) { this.amount = amount; }

    public String getBusinessId() { return businessId; }
    public void setBusinessId(String businessId) { this.businessId = businessId; }

//    public Long getId() { return id; }
//    public void setId(Long id) { this.id = id; }

    public byte[] getBytes(Charset charset) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(this);
            return json.getBytes(charset);
        } catch (Exception e) {
            throw new RuntimeException("Failed to convert object to JSON", e);
        }
    }

}
