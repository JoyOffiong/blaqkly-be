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
@Embeddable

    class ValueWrapper {

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
@Embeddable
    class PaymentData {
        @JsonProperty("Amount")
        private double amount;

        @JsonProperty("OrderId")
        private String orderId;

        @JsonProperty("Description")
        private String description;

        @JsonProperty("PaymentMethodId")
        private int paymentMethodId;

        @JsonProperty("SessionId")
        private String sessionId;

        @Embedded
        private Customer customer;

        @JsonProperty("Otp")
        private String otp;

        @JsonProperty("Id")
        @Column(insertable=false, updatable=false)
        private String id;

        @JsonProperty("MerchantId")
        private String merchantId;

        @JsonProperty("BusinessId")
        private String businessId;

        @JsonProperty("Channel")
        private String channel;

        @JsonProperty("CallbackUrl")
        private String callbackUrl;

        @JsonProperty("FeeAmount")
        private double feeAmount;

        @JsonProperty("BusinessName")
        private String businessName;

        @JsonProperty("Currency")
        private String currency;

        @JsonProperty("Status")
        @Column(insertable=false, updatable=false)
        private String status;

        @JsonProperty("StatusReason")
        private String statusReason;

        @JsonProperty("SettlementType")
        private String settlementType;

        @Column(insertable=false, updatable=false)
        @JsonProperty("CreatedAt")
        private String createdAt;

        @JsonProperty("UpdatedAt")
        private String updatedAt;

        @JsonProperty("NgnVirtualBankAccountNumber")
        private String ngnVirtualBankAccountNumber;

        @JsonProperty("NgnVirtualBankCode")
        private String ngnVirtualBankCode;

        @JsonProperty("UsdVirtualAccountNumber")
        private String usdVirtualAccountNumber;

        @JsonProperty("UsdVirtualBankCode")
        private String usdVirtualBankCode;

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        public String getOrderId() {
            return orderId;
        }

        public void setOrderId(String orderId) {
            this.orderId = orderId;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public int getPaymentMethodId() {
            return paymentMethodId;
        }

        public void setPaymentMethodId(int paymentMethodId) {
            this.paymentMethodId = paymentMethodId;
        }

        public String getSessionId() {
            return sessionId;
        }

        public void setSessionId(String sessionId) {
            this.sessionId = sessionId;
        }

        public Customer getCustomer() {
            return customer;
        }

        public void setCustomer(Customer customer) {
            this.customer = customer;
        }

        public String getOtp() {
            return otp;
        }

        public void setOtp(String otp) {
            this.otp = otp;
        }

        public String getMerchantId() {
            return merchantId;
        }

        public void setMerchantId(String merchantId) {
            this.merchantId = merchantId;
        }

        public String getBusinessId() {
            return businessId;
        }

        public void setBusinessId(String businessId) {
            this.businessId = businessId;
        }

        public String getChannel() {
            return channel;
        }

        public void setChannel(String channel) {
            this.channel = channel;
        }

        public String getCallbackUrl() {
            return callbackUrl;
        }

        public void setCallbackUrl(String callbackUrl) {
            this.callbackUrl = callbackUrl;
        }

        public double getFeeAmount() {
            return feeAmount;
        }

        public void setFeeAmount(double feeAmount) {
            this.feeAmount = feeAmount;
        }

        public String getBusinessName() {
            return businessName;
        }

        public void setBusinessName(String businessName) {
            this.businessName = businessName;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getStatusReason() {
            return statusReason;
        }

        public void setStatusReason(String statusReason) {
            this.statusReason = statusReason;
        }

        public String getSettlementType() {
            return settlementType;
        }

        public void setSettlementType(String settlementType) {
            this.settlementType = settlementType;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        public String getNgnVirtualBankAccountNumber() {
            return ngnVirtualBankAccountNumber;
        }

        public void setNgnVirtualBankAccountNumber(String ngnVirtualBankAccountNumber) {
            this.ngnVirtualBankAccountNumber = ngnVirtualBankAccountNumber;
        }

        public String getNgnVirtualBankCode() {
            return ngnVirtualBankCode;
        }

        public void setNgnVirtualBankCode(String ngnVirtualBankCode) {
            this.ngnVirtualBankCode = ngnVirtualBankCode;
        }

        public String getUsdVirtualAccountNumber() {
            return usdVirtualAccountNumber;
        }

        public void setUsdVirtualAccountNumber(String usdVirtualAccountNumber) {
            this.usdVirtualAccountNumber = usdVirtualAccountNumber;
        }

        public String getUsdVirtualBankCode() {
            return usdVirtualBankCode;
        }

        public void setUsdVirtualBankCode(String usdVirtualBankCode) {
            this.usdVirtualBankCode = usdVirtualBankCode;
        }
    }
@Embeddable
    class Customer {

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
            return metadata;
        }

        public void setMetadata(String metadata) {
            this.metadata = metadata;
        }
    }
