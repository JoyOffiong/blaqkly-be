package com.blaqkly.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
  public  class Customer {

        @JsonProperty("Id")
        @Column(insertable=false, updatable=false)
        private String id;

        @JsonProperty("TransactionId")
        private String transactionId;

        @JsonProperty("CreatedAt")
        private String createdAt;

        @JsonProperty("Email")
        private String email;

        @JsonProperty("Phone")
        private String phone;

        @JsonProperty("FirstName")
        private String firstName;

        @JsonProperty("LastName")
        private String lastName;

    @JsonProperty("Metadata")
    private String metadata;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTransactionId() {
            return transactionId;
        }

        public void setTransactionId(String transactionId) {
            this.transactionId = transactionId;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getMetadata() {
            return metadata.toString();
        }

        public void setMetadata(String metadata) {
            this.metadata = metadata;
        }
    }
