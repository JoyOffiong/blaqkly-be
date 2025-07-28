package com.blaqkly.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.List;

import lombok.*;

@Entity
@Data
@Table(name = "webhook_model")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Webhook_model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    @JsonProperty("Value")
    private ValueWrapper value;

    @Transient
    private List<Object> formatters;

    @Transient
    private List<Object> contentTypes;

    @Transient
    private Object declaredType;

    @Column(name = "status_code")
    private int statusCode;

        public ValueWrapper getValue() {
            return value;
        }

        public void setValue(ValueWrapper value) {
            this.value = value;
        }

        public List<Object> getFormatters() {
            return formatters;
        }

        public void setFormatters(List<Object> formatters) {
            this.formatters = formatters;
        }

        public List<Object> getContentTypes() {
            return contentTypes;
        }

        public void setContentTypes(List<Object> contentTypes) {
            this.contentTypes = contentTypes;
        }

        public Object getDeclaredType() {
            return declaredType;
        }

        public void setDeclaredType(Object declaredType) {
            this.declaredType = declaredType;
        }

        public int getStatusCode() {
            return statusCode;
        }

        public void setStatusCode(int statusCode) {
            this.statusCode = statusCode;
        }
    }

