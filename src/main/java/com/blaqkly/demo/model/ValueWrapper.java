package com.blaqkly.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;

@Embeddable

  public  class ValueWrapper {

        @Embedded
        @JsonProperty("Data")
        private PaymentData data;

        @JsonProperty("Status")
        @Column(insertable=false, updatable=false)
        private boolean status;

        @JsonProperty("Message")
        private String message;
        public PaymentData getData() {
            return data;
        }

        public void setData(PaymentData data) {
            this.data = data;
        }

        public boolean isStatus() {
            return status;
        }

        public void setStatus(boolean status) {
            this.status = status;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
