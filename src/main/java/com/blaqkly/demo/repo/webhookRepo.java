package com.blaqkly.demo.repo;

import com.blaqkly.demo.model.Webhook_model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface webhookRepo extends JpaRepository<Webhook_model, String> {

}

